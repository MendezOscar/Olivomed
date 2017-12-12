package olivomed.grafico;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import olivomed.logica.transaccionCliente;
import olivomed.logica.transaccionDeduccion;
import olivomed.logica.transaccionPase;
import olivomed.modelos.Deduccion;
import olivomed.modelos.Empleado;
import olivomed.modelos.Pase;

/**
 *
 * @author Oscar Mendez
 */
public class registroDeduccion extends javax.swing.JFrame {

    public DefaultTableModel tm;
    Date fechaActual;

    public registroDeduccion() {
        initComponents();
        this.tm = (DefaultTableModel) jTable2.getModel();
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
        jLabel6 = new javax.swing.JLabel();
        jPase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDeduccion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jMedico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jFecha = new javax.swing.JTextField();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/DeduccionFrom.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("CODIGO DEL PASE");

        jPase.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
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

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("EMPLEADO");

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

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("CODIGO DE DEDUCCION");

        jDeduccion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeduccionActionPerformed(evt);
            }
        });
        jDeduccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDeduccionKeyPressed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Valor del pase", "Nº de Pagos", "Deduccion", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("MEDICO");

        jMedico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMedicoActionPerformed(evt);
            }
        });
        jMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMedicoKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("FECHA");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPase, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jPase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDeduccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jDeduccion.getText();
        if ("".equals(jDeduccion.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            transaccionDeduccion service = new transaccionDeduccion();
            if (service.findByIdPase(id) == null) {
                Deduccion d;
                d = enviarDatos();
                service.createDeduccion(d);
            } else {
                JOptionPane.showMessageDialog(null, "la deduccion: " + id + " no se registro");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = jDeduccion.getText();
        if ("".equals(jDeduccion.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Deduccion d;
                d = enviarDatos();
                transaccionDeduccion service = new transaccionDeduccion();
                service.updateDeduccion(id, d);
            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jDeduccion.getText();
            transaccionDeduccion service = new transaccionDeduccion();
            service.deleteDeduccion(id);
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
        String id = jDeduccion.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Deduccion d;
                transaccionDeduccion service = new transaccionDeduccion();
                d = service.findByIdDeduccion(id);
                if (d != null) {
                    setearBusqueda(d);
                } else {
                    JOptionPane.showMessageDialog(null, "la deduccion: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPaseActionPerformed

    private void jPaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPaseKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Deduccion ded = verificarPagos();
            if (ded == null) {
                setearCodigo();
                buscarPase();
                buscarEmpleado();
                buscarMedico();
            } else if (ded.getSaldo() < 1) {
                JOptionPane.showMessageDialog(null, "El Prestamo: " + ded.getIdPase() + " ya esta pagado");
            } else {
                setearCodigo();
                buscarPase();
                buscarEmpleado();
                buscarMedico();
            }
        }
    }//GEN-LAST:event_jPaseKeyPressed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreKeyPressed

    private void jDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeduccionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jDeduccionActionPerformed

    private void jDeduccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDeduccionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jDeduccion.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    Deduccion d;
                    transaccionDeduccion service = new transaccionDeduccion();
                    d = service.findByIdDeduccion(id);
                    if (d != null) {
                        setearBusqueda(d);
                    } else {
                        JOptionPane.showMessageDialog(null, "la deduccion: " + id + " no existe");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jDeduccionKeyPressed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMedicoActionPerformed

    private void jMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMedicoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMedicoKeyPressed

    private void jFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaActionPerformed

    private void jFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaKeyPressed

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
            java.util.logging.Logger.getLogger(registroDeduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroDeduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroDeduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroDeduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registroDeduccion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JTextField jDeduccion;
    public static javax.swing.JTextField jFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jMedico;
    public static javax.swing.JTextField jNombre;
    public static javax.swing.JTextField jPase;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables

    public Deduccion enviarDatos() {
        Deduccion ded;
        String idDeduccion = jDeduccion.getText();
        String idPase = jPase.getText();
        String Nombre = jNombre.getText();
        String fecha = jFecha.getText();
        float pase = Float.parseFloat(String.valueOf(tm.getValueAt(0, 1)));
        float valor = Float.parseFloat(String.valueOf(tm.getValueAt(0, 3)));
        float Saldo = Float.parseFloat(String.valueOf(tm.getValueAt(0, 4)));
        int contador = setearnumero();
        String medico = jMedico.getText();
        ded = new Deduccion(idDeduccion, idPase, Nombre, fecha, pase, valor, Saldo, contador, medico);
        return ded;
    }

    public void limpiar() {
        jDeduccion.setText("");
        jPase.setText("");
        jFecha.setText("");
        jMedico.setText("");
        jTable2.setValueAt(0, 0, 1);
        jTable2.setValueAt(0, 0, 2);
        jTable2.setValueAt(0.0, 0, 3);
        jTable2.setValueAt(0.0, 0, 4);
    }

    public void obtenerSaldo() {
        try {
            String idd = jDeduccion.getText();
            String idPres = jPase.getText();
            transaccionPase service = new transaccionPase();
            transaccionDeduccion servi = new transaccionDeduccion();
            Pase p = service.findByIdPase(idPres);
            String[] obnum = idd.split("\\-");
            String num = obnum[3];
            int numero = Integer.parseInt(num);
            int numant = numero - 1;
            int plazo = p.getPagos();
            String id = obnum[0] + "-" + obnum[1] + "-" + obnum[2] + "-" + numant + "-" + "de" + plazo;
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    Deduccion ded;
                    ded = servi.findByIdDeduccion(id);
                    if (ded != null) {
                        setearSaldo(ded);
                    } else {
                        JOptionPane.showMessageDialog(null, "La Deduccion: " + id + " no existe");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int setearnumero() {
        int numero;
        String idPase = jPase.getText();
        transaccionDeduccion service = new transaccionDeduccion();
        ArrayList<Deduccion> depts;
        depts = (ArrayList<Deduccion>) service.obtenerUltimaDeduccionByIdPase(idPase);
        if (depts.isEmpty()) {
            numero = depts.size() + 1;
            return numero;
        } else {
            numero = depts.size() + 1;
            return numero;
        }
    }

    public void setearSaldo(Deduccion ded) {
        float deduccion = ded.getValor();
        float Saldo = ded.getSaldo();
        float SaldoDeudor = Saldo - deduccion;
        jTable2.setValueAt(SaldoDeudor, 0, 4);
    }

    public void setearBusqueda(Deduccion ded) {
        jDeduccion.setText(ded.getIdDeduccion());
        jPase.setText(ded.getIdPase());
        jFecha.setText(ded.getFecha());
        buscarPase();
        buscarEmpleado();
    }

    private void buscarPase() {
        String id = jPase.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de pase ingresado");
        } else {
            try {
                Pase p;
                transaccionPase service = new transaccionPase();
                p = service.findByIdPase(id);
                if (p != null) {
                    setearPase(p);
                } else {
                    JOptionPane.showMessageDialog(null, "El pase: " + id + " no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void buscarEmpleado() {
        String id = jPase.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de pase ingresado");
        } else {
            try {
                Pase pres;
                transaccionPase service = new transaccionPase();
                pres = service.findByIdPase(id);
                if (pres != null) {
                    obtenerCliente(pres);
                } else {
                    JOptionPane.showMessageDialog(null, "El Prestamo: " + id + " no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setearPase(Pase p) {
        jTable2.setValueAt(p.getNumero(), 0, 0);
        jTable2.setValueAt(p.getValor(), 0, 1);
        jTable2.setValueAt(p.getPagos(), 0, 2);
        jTable2.setValueAt(p.getDeduccion(), 0, 3);
        String idDeduccion = jDeduccion.getText();
        String[] obnum = idDeduccion.split("\\-");
        String num = obnum[3];
        String numero = num;
        float Saldo;
        if ("1".equals(numero)) {
            Saldo = p.getValor() - p.getDeduccion();
            jTable2.setValueAt(Saldo, 0, 4);
        } else {
            obtenerSaldo();
        }
    }

    private void obtenerCliente(Pase pres) {
        String id = pres.getIdempleado();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Empleado emp;
                transaccionCliente service = new transaccionCliente();
                emp = service.findByIdClientes(id);
                if (emp != null) {
                    setearCliente(emp);
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setearCliente(Empleado emp) {
        jNombre.setText(emp.getNombre());
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setearCodigo() {
        try {
            String idPrestamo = jPase.getText();
            transaccionPase service = new transaccionPase();
            transaccionDeduccion servi = new transaccionDeduccion();
            Pase p = service.findByIdPase(idPrestamo);
            ArrayList<Deduccion> depts;
            depts = (ArrayList<Deduccion>) servi.obtenerUltimaDeduccionByIdPase(idPrestamo);
            if (depts.isEmpty()) {
                int plazo = p.getPagos();
                String code = idPrestamo + "-" + "1" + "-" + "de" + plazo;
                jDeduccion.setText(code);
            } else {
                int plazo = p.getPagos();
                Deduccion ded = depts.get(0);
                int consecutivo = ded.getContador() + 1;
                String code = idPrestamo + "-" + consecutivo + "-" + "de" + plazo;
                jDeduccion.setText(code);
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Deduccion verificarPagos() {
        try {
            transaccionPase service = new transaccionPase();
            transaccionDeduccion servi = new transaccionDeduccion();
            String idPrestamo = jPase.getText();
            Pase pres = service.findByIdPase(idPrestamo);
            Deduccion ded = servi.findByIdPase(pres.getIdPase());
            return ded;
        } catch (SQLException ex) {
            Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void buscarMedico() {
        try {
            String idPase = jPase.getText();
            transaccionPase service = new transaccionPase();
            Pase p = service.findByIdPase(idPase);
            jMedico.setText(p.getMedico());
        } catch (SQLException ex) {
            Logger.getLogger(registroDeduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
