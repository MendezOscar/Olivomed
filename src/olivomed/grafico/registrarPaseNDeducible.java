package olivomed.grafico;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import olivomed.logica.transaccionCliente;
import olivomed.logica.transaccionPase;
import olivomed.logica.transaccionPaseNDeducible;
import olivomed.modelos.Empleado;
import olivomed.modelos.paseNDeducible;

/**
 *
 * @author Oscar Mendez
 */
public final class registrarPaseNDeducible extends javax.swing.JFrame {

    public DefaultTableModel tm;
    Date fechaActual;

    public registrarPaseNDeducible() {
        initComponents();
        this.tm = (DefaultTableModel) jTable2.getModel();
        setearFecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar3 = new javax.swing.JToolBar();
        jLabel41 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPase = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jMedico = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar3.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar3.setRollover(true);

        jLabel41.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel41);

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/guardar.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setToolTipText("");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton3);

        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText(".......");
        jToolBar3.add(jLabel14);

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/modicar.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.setToolTipText("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton4);

        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText(".......");
        jToolBar3.add(jLabel15);

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.setToolTipText("");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton5);

        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText(".......");
        jToolBar3.add(jLabel16);

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/limpiar.png"))); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.setToolTipText("");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton6);

        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText(".......");
        jToolBar3.add(jLabel17);

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.setToolTipText("");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton7);

        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setText(".......");
        jToolBar3.add(jLabel18);

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reporte.png"))); // NOI18N
        jButton8.setText("reporte");
        jButton8.setToolTipText("");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton8);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pasemedico.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("NOMBRE DEL EMPLEADO");

        jNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNombreKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("CODIGO DEL PASE");

        jPase.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPaseMouseClicked(evt);
            }
        });
        jPase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPaseActionPerformed(evt);
            }
        });
        jPase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPaseKeyPressed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Numero", "Valor del pase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("MEDICO");

        jMedico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Ezer Rodriguez", "Dra. Gilma Ramirez", "Dr. Norman Godoy", "Clinica Los Angeles" }));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("FECHA");

        jFecha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFechaActionPerformed(evt);
            }
        });
        jFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFechaKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("CODIGO DEL EMPLEADO");

        jCodigo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCodigoMouseClicked(evt);
            }
        });
        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });
        jCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(378, 488, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(441, 441, 441))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPase, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jPase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jPase.getText();
        if ("".equals(jPase.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                transaccionPaseNDeducible service = new transaccionPaseNDeducible();
                if (service.findByIdPase(id) == null) {
                    paseNDeducible p;
                    p = enviarDatos();
                    service.createPase(p);
                } else {
                    JOptionPane.showMessageDialog(null, "El pase: " + id + " no se registro");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = jPase.getText();
        if ("".equals(jPase.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                paseNDeducible p;
                p = enviarDatos();
                transaccionPaseNDeducible service = new transaccionPaseNDeducible();
                service.updatePase(id, p);
            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jPase.getText();
            transaccionPase service = new transaccionPase();
            service.deletePase(id);
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String id = jPase.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                paseNDeducible p;
                transaccionPaseNDeducible service = new transaccionPaseNDeducible();
                p = service.findByIdPase(id);
                if (p != null) {
                    setearBusqueda(p);
                } else {
                    JOptionPane.showMessageDialog(null, "El pase: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        reportePase rp = new reportePase();
        rp.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreKeyPressed

    private void jPaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPaseActionPerformed

    private void jPaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPaseKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jPase.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    paseNDeducible p;
                    transaccionPaseNDeducible service = new transaccionPaseNDeducible();
                    p = service.findByIdPase(id);
                    if (p != null) {
                        setearBusqueda(p);
                    } else {
                        JOptionPane.showMessageDialog(null, "El pase: " + id + " no existe");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(registrarPaseNDeducible.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jPaseKeyPressed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable2KeyPressed

    private void jFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaActionPerformed

    private void jFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaKeyPressed

    private void jPaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaseMouseClicked
        // TODO add your handling code here:
        setearCodigo();
    }//GEN-LAST:event_jPaseMouseClicked

    private void jCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCodigoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigoMouseClicked

    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigoActionPerformed

    private void jCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
            setearCodigo();
        }

    }//GEN-LAST:event_jCodigoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrarPaseNDeducible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarPaseNDeducible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarPaseNDeducible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarPaseNDeducible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrarPaseNDeducible().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JTextField jCodigo;
    public static javax.swing.JTextField jFecha;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMedico;
    public static javax.swing.JTextField jNombre;
    public static javax.swing.JTextField jPase;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables

    public paseNDeducible enviarDatos() {
        paseNDeducible p;
        String idPase = jPase.getText();
        String nombre = jNombre.getText();
        String fecha = jFecha.getText();
        float valor = Float.parseFloat(String.valueOf(tm.getValueAt(0, 1)));
        int contador = setearnumero();
        int numero = Integer.parseInt(String.valueOf(tm.getValueAt(0, 0)));
        String medico = jMedico.getSelectedItem().toString();
        String mes = obtenerMes();
        String codigo = jCodigo.getText();
        p = new paseNDeducible(idPase, nombre, fecha, valor, medico, contador, numero, codigo, mes);
        return p;
    }

    public String obtenerMes() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = jFecha.getText();
            Date date = format.parse(fecha);
            String formato = "MM";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            int mes = Integer.parseInt(dateFormat.format(date));
            String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "octubre", "Noviembre", "Diciembre"};
            return meses[mes - 1];
        } catch (ParseException ex) {
            Logger.getLogger(registrarPase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public void limpiar() {
        jPase.setText("");
        jNombre.setText("");
        jTable2.setValueAt("", 0, 0);
        jTable2.setValueAt("", 0, 1);
        jCodigo.setText("");
    }

    public void setearBusqueda(paseNDeducible p) {
        jPase.setText(p.getIdPase());
        jNombre.setText(p.getNombre());
        jFecha.setText(p.getFecha());
        jTable2.setValueAt(p.getNumero(), 0, 0);
        jTable2.setValueAt(p.getValor(), 0, 1);
        jMedico.setSelectedItem(p.getMedico());
        jCodigo.setText(p.getCodigo());
    }

    public int setearnumero() {
        try {
            int numero;
            transaccionPaseNDeducible service = new transaccionPaseNDeducible();
            ArrayList<paseNDeducible> depts;
            depts = (ArrayList<paseNDeducible>) service.findAllPases();
            numero = depts.size() + 1;
            return numero;
        } catch (SQLException ex) {
            Logger.getLogger(registrarPaseNDeducible.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void buscarCliente() {
        String id = jCodigo.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de cliente ingresado");
        } else {
            try {
                Empleado emp;
                transaccionCliente service = new transaccionCliente();
                emp = service.findByIdClientes(id);
                if (emp != null) {
                    setearCliente(emp);
                } else {
                    JOptionPane.showMessageDialog(null, "El Cliente: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setearCliente(Empleado emp) {
        jNombre.setText(emp.getNombre());
    }

    public void setearCodigo() {
        try {
            String idCliente = jCodigo.getText();
            transaccionPaseNDeducible service = new transaccionPaseNDeducible();
            ArrayList<paseNDeducible> depts;
            depts = (ArrayList<paseNDeducible>) service.findAllPases();
            if (depts.isEmpty()) {
                String code = idCliente + obtenerDr() + "1";
                jPase.setText(code);
            } else {
                int consecutivo = depts.size() + 1;
                String code = idCliente + obtenerDr() + consecutivo;
                jPase.setText(code);
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarPaseNDeducible.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String obtenerDr() {
        String doctor = jMedico.getSelectedItem().toString();
        String doc = null;
        if (null != doctor) {
            switch (doctor) {
                case "Dr. Ezer Rodriguez":
                    doc = "1";
                    break;
                case "Dra. Gilma Ramirez":
                    doc = "2";
                    break;
                case "Dr. Norman Godoy":
                    doc = "3";
                    break;
                case "Clinica Los Angeles":
                    doc = "4";
                    break;
                default:
                    break;
            }
        }
        return doc;
    }

    public String formatNumber(float cantidad) {
        String res;
        DecimalFormat formato = new DecimalFormat("#,###.00");
        res = formato.format(cantidad);
        return res;
    }

    public void setearFecha() {
        fechaActual = new Date();
        jFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(fechaActual));
    }

}
