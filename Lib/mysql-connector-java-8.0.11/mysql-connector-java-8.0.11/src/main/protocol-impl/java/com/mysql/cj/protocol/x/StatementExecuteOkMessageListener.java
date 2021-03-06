/*
 * Copyright (c) 2015, 2018, Oracle and/or its affiliates. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License, version 2.0, as published by the
 * Free Software Foundation.
 *
 * This program is also distributed with certain software (including but not
 * limited to OpenSSL) that is licensed under separate terms, as designated in a
 * particular file or component or in included license documentation. The
 * authors of MySQL hereby grant you an additional permission to link the
 * program and your derivative works with the separately licensed software that
 * they have included with MySQL.
 *
 * Without limiting anything contained in the foregoing, this file, which is
 * part of MySQL Connector/J, is also subject to the Universal FOSS Exception,
 * version 1.0, a copy of which can be found at
 * http://oss.oracle.com/licenses/universal-foss-exception.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License, version 2.0,
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301  USA
 */

package com.mysql.cj.protocol.x;

import java.util.concurrent.CompletableFuture;

import com.google.protobuf.GeneratedMessage;
import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.protocol.MessageListener;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.x.protobuf.Mysqlx.Error;
import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;
import com.mysql.cj.x.protobuf.MysqlxResultset.FetchDone;
import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecuteOk;

/**
 * Async message reader accumulating the status necessary to produce a {@link StatementExecuteOk} result.
 */
public class StatementExecuteOkMessageListener implements MessageListener<XMessage> {
    private StatementExecuteOkBuilder builder = new StatementExecuteOkBuilder();
    private CompletableFuture<StatementExecuteOk> future = new CompletableFuture<>();
    private ProtocolEntityFactory<Notice, XMessage> noticeFactory;

    public StatementExecuteOkMessageListener(CompletableFuture<StatementExecuteOk> future, ProtocolEntityFactory<Notice, XMessage> noticeFactory) {
        this.future = future;
        this.noticeFactory = noticeFactory;
    }

    public Boolean createFromMessage(XMessage message) {
        //GeneratedMessage msg = (GeneratedMessage) message.getMessage();
        @SuppressWarnings("unchecked")
        Class<? extends GeneratedMessage> msgClass = (Class<? extends GeneratedMessage>) message.getMessage().getClass();
        if (Frame.class.equals(msgClass)) {
            this.builder.addNotice(this.noticeFactory.createFromMessage(message));
            return false; /* done reading? */
        } else if (StmtExecuteOk.class.equals(msgClass)) {
            this.future.complete(this.builder.build());
            return true; /* done reading? */
        } else if (Error.class.equals(msgClass)) {
            this.future.completeExceptionally(new XProtocolError(Error.class.cast(message.getMessage())));
            return true; /* done reading? */
        } else if (FetchDone.class.equals(msgClass)) {
            return false; /* done reading? */
        }
        this.future.completeExceptionally(new WrongArgumentException("Unhandled msg class (" + msgClass + ") + msg=" + message.getMessage()));
        return true; /* done reading? */
    }

    public void closed() {
        this.future.completeExceptionally(new CJCommunicationsException("Sock was closed"));
    }

    public void error(Throwable ex) {
        this.future.completeExceptionally(ex);
    }
}
