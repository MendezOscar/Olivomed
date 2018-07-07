package olivomed.grafico;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import olivomed.logica.transaccionCliente;
import olivomed.logica.transaccionCuenta_hdr;
import olivomed.modelos.Cuenta_hdr;
import olivomed.modelos.Empleado;

/**
 *
 * @author Oscar Mendez
 */
public final class registrarCuenta_hdr extends javax.swing.JFrame {

    Date fechaActual;

    public registrarCuenta_hdr() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCuenta_hdr = new javax.swing.JTextField();

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

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("CODIGO EMPLEADO");

        jEmpleado.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpleadoActionPerformed(evt);
            }
        });
        jEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEmpleadoKeyPressed(evt);
            }
        });

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
        jLabel7.setText("CODIGO CREDITO EMPLEADO");

        jCuenta_hdr.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCuenta_hdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCuenta_hdrActionPerformed(evt);
            }
        });
        jCuenta_hdr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCuenta_hdrKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCuenta_hdr, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCuenta_hdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jCuenta_hdr.getText();
        if ("".equals(jCuenta_hdr.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                transaccionCuenta_hdr service = new transaccionCuenta_hdr();
                if (service.findByIdCuenta(id) == null) {
                    Cuenta_hdr cue;
                    cue = enviarDatoscuenta_hdr();
                    service.createCuenta(cue);
                } else {
                    JOptionPane.showMessageDialog(null, "El credito: " + id + " no se registro");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = jCuenta_hdr.getText();
        if ("".equals(jCuenta_hdr.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Cuenta_hdr cue;
                cue = enviarDatoscuenta_hdr();
                transaccionCuenta_hdr service = new transaccionCuenta_hdr();
                service.updateCuenta(id, cue);
            } catch (SQLException ex) {
                Logger.getLogger(registrarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jCuenta_hdr.getText();
            transaccionCuenta_hdr service = new transaccionCuenta_hdr();
            service.deleteCuenta(id);
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
        String id = jCuenta_hdr.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Cuenta_hdr cue;
                transaccionCuenta_hdr service = new transaccionCuenta_hdr();
                cue = service.findByIdCuenta(id);
                if (cue != null) {
                    setearBusqueda(cue);
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

    private void jEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmpleadoActionPerformed

    private void jEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEmpleadoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
            setearCodigo_hdr();
        }
    }//GEN-LAST:event_jEmpleadoKeyPressed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreKeyPressed

    private void jCuenta_hdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCuenta_hdrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCuenta_hdrActionPerformed

    private void jCuenta_hdrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCuenta_hdrKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCuenta_hdrKeyPressed

    private void jFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaKeyPressed

    private void jFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaActionPerformed

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
            java.util.logging.Logger.getLogger(registrarCuenta_hdr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarCuenta_hdr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarCuenta_hdr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarCuenta_hdr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrarCuenta_hdr().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JTextField jCuenta_hdr;
    public static javax.swing.JTextField jEmpleado;
    private javax.swing.JTextField jFecha;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jNombre;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables

    
    public Cuenta_hdr enviarDatoscuenta_hdr() {
        Cuenta_hdr cuenta_hdr;
        String idEmpleado = jEmpleado.getText();
        String nombre = jNombre.getText();
        int contador = setearnumero1();
        String idCuenta = setNumerocuenta();
        String estatusfinanciero = "A";
        String fecha = jFecha.getText();
        String fechapagada = "";
        cuenta_hdr = new Cuenta_hdr(idCuenta, idEmpleado, nombre, estatusfinanciero, contador, fecha, fechapagada);
        return cuenta_hdr;
    }

    public void limpiar() {
        jEmpleado.setText("");
        jNombre.setText("");
    }

    public void setearBusqueda(Cuenta_hdr cuenta) {
        jEmpleado.setText(cuenta.getIdEmpleado());
        jNombre.setText(cuenta.getNombre());
        jFecha.setText("");
        jCuenta_hdr.setText(cuenta.getIdCuenta());
    }
    
    public void buscarCliente() {
        String id = jEmpleado.getText();
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

    public void setearFecha() {
        fechaActual = new Date();
        jFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(fechaActual));
    }

    private int setearnumero1() {
        int numero;
        String idCliente = jEmpleado.getText();
        transaccionCuenta_hdr service = new transaccionCuenta_hdr();
        ArrayList<Cuenta_hdr> depts;
        depts = (ArrayList<Cuenta_hdr>) service.obtenerCuentahdrByIdCliente(idCliente);
        numero = depts.size() + 1;
        return numero;
    }

    private String setNumerocuenta() {
        int numero;
        String idEmpleado = jEmpleado.getText();
        transaccionCuenta_hdr service = new transaccionCuenta_hdr();
        ArrayList<Cuenta_hdr> depts;
        depts = (ArrayList<Cuenta_hdr>) service.obtenerCuentahdrByIdCliente(idEmpleado);
        numero = depts.size() + 1;
        String codigoCuenta_hdr = idEmpleado + numero;
        return codigoCuenta_hdr;
    }

    private void setearCodigo_hdr() {
        jCuenta_hdr.setText(setNumerocuenta());
    }
    
    

}
