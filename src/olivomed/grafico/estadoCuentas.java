package olivomed.grafico;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import olivomed.logica.transaccionCliente;
import olivomed.logica.transaccionDeduccion;
import olivomed.logica.transaccionEstado;
import olivomed.logica.transaccionPase;
import olivomed.modelos.Deduccion;
import olivomed.modelos.Empleado;
import olivomed.modelos.Estado;
import olivomed.modelos.Pase;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Oscar Mendez
 */
public class estadoCuentas extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public estadoCuentas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDateI = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateF = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el codigo del Empleado");
        jToolBar1.add(jLabel1);

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("......");
        jToolBar1.add(jLabel19);

        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText(".....");
        jToolBar1.add(jLabel20);

        txtFiltro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });
        jToolBar1.add(txtFiltro);

        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("......");
        jToolBar1.add(jLabel21);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("..............");
        jToolBar1.add(jLabel22);

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar1.add(jLabel18);

        jButton2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton2.setText("Generar Documento");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("...........................................");
        jToolBar1.add(jLabel23);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Estado Cuenta de");

        jNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jTable2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Estado", "Id Cliente", "Cliente", "Fecha", "Id Transaccion", "Transaccion", "Monto", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton1.setText("General");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Fin");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Entre Fechas   Inicio");

        jButton3.setText("Generar por fechas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jDateI, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jDateF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(118, 118, 118))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String idCliente = txtFiltro.getText();
            setCliente(idCliente);
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crearTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        estadoCuenta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        estadoCuentaFechas();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(estadoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estadoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estadoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estadoCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new estadoCuentas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateF;
    private com.toedter.calendar.JDateChooser jDateI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jNombre;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void estadoCuenta() {
        String idCliente = txtFiltro.getText();
        Estado est;
        transaccionEstado service = new transaccionEstado();
        ArrayList<Estado> depts;
        depts = (ArrayList<Estado>) service.obtenerUltimaEstadoByIdPaseAcs(idCliente);
        for (int x = 0; x < depts.size(); x++) {
            est = depts.get(x);
            jTable2.setValueAt(est.getId(), x, 0);
            jTable2.setValueAt(est.getIdcliente(), x, 1);
            jTable2.setValueAt(est.getNombre(), x, 2);
            System.out.println(est.getFecha());
            java.sql.Date sqlDate = new java.sql.Date(est.getFecha().getTime());
            jTable2.setValueAt(sqlDate, x, 3);
            jTable2.setValueAt(est.getIdTrans(), x, 4);
            jTable2.setValueAt(est.getTrasaccion(), x, 5);
            jTable2.setValueAt(Float.toString(est.getMonto()), x, 6);
            jTable2.setValueAt(Float.toString(est.getSaldo()), x, 7);
            agregarFilas();
        }
    }

    private void estadoCuentaFechas() {
        String idCliente = txtFiltro.getText();
        Estado est;
        transaccionEstado service = new transaccionEstado();
        ArrayList<Estado> depts;
        java.util.Date finicio = jDateI.getDate();
        java.sql.Date sqlDate1 = new java.sql.Date(finicio.getTime());
        java.util.Date ffin = jDateF.getDate();
        java.sql.Date sqlDate2 = new java.sql.Date(ffin.getTime());
        depts = (ArrayList<Estado>) service.obtenerUltimaEstadoByFechas(sqlDate1, sqlDate2, idCliente);
        for (int x = 0; x < depts.size(); x++) {
            est = depts.get(x);
            jTable2.setValueAt(est.getId(), x, 0);
            jTable2.setValueAt(est.getIdcliente(), x, 1);
            jTable2.setValueAt(est.getNombre(), x, 2);
            jTable2.setValueAt(est.getFecha(), x, 3);
            jTable2.setValueAt(est.getIdTrans(), x, 4);
            jTable2.setValueAt(est.getTrasaccion(), x, 5);
            jTable2.setValueAt(Float.toString(est.getMonto()), x, 6);
            jTable2.setValueAt(Float.toString(est.getSaldo()), x, 7);
            agregarFilas();
        }
    }

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void crearTable() {
        try {
            String idPrestamo = txtFiltro.getText();
            transaccionPase service = new transaccionPase();
            Pase pres = service.findByIdPase(idPrestamo);

            String parrafo1 = "PASE MEDICO";
            String parrafo2 = "Estado de cuentas";
            String parrafo3 = "Otorgado a: " + pres.getNombre();

            String path = "C:\\Users\\CRISTINA\\Documents\\OLIVOPMED\\Olivomed\\template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(14);
            run1.setBold(true);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(12);
            run2.setBold(true);
            run2.setFontFamily("Consolas");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(12);
            run3.setFontFamily("Consolas");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.CENTER);

            int nRows = jTable2.getRowCount();
            int nCols = jTable2.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("IDESTADO");
            tableOneRowOne.getCell(1).setText("IDCLIENTE");
            tableOneRowOne.getCell(2).setText("CLIENTE");
            tableOneRowOne.getCell(3).setText("FECHA");
            tableOneRowOne.getCell(4).setText("IDTRANSACCION");
            tableOneRowOne.getCell(5).setText("TRANSACCION");
            tableOneRowOne.getCell(6).setText("MONTO");
            tableOneRowOne.getCell(6).setText("SALDO");

            int rowNr = 2;
            Deduccion ded;
            ArrayList<Deduccion> depts;
            transaccionDeduccion servi = new transaccionDeduccion();
            depts = (ArrayList<Deduccion>) servi.obtenerUltimaDeduccionByIdPaseAcs(idPrestamo);
            for (int x = 0; x < depts.size(); x++) {
                agregarFilas();
                ded = depts.get(x);
                agregarFilas();
                XWPFTableRow row = tableOne.getRow(rowNr++);
                row.getCell(0).setText(ded.getIdDeduccion());
                row.getCell(2).setText(ded.getFecha().toString());
                row.getCell(5).setText(Float.toString(ded.getValor()));
                row.getCell(6).setText(Float.toString(ded.getSaldo()));
            }

            try (FileOutputStream outStream = new FileOutputStream("C:\\Users\\CRISTINA\\Documents\\Documentos Medicos\\Estado de cuentas de " + pres.getNombre() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (SQLException | FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    private int obtenerNumero(String idPase) {
        try {
            transaccionPase service = new transaccionPase();
            Pase p = service.findByIdPase(idPase);
            return p.getNumero();
        } catch (SQLException ex) {
            Logger.getLogger(estadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private Date obtenerFecha(String idPase) {
        try {
            transaccionPase service = new transaccionPase();
            Pase p = service.findByIdPase(idPase);
            return p.getFecha();
        } catch (SQLException ex) {
            Logger.getLogger(estadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void setCliente(String idCliente) {
        try {
            Empleado emp;
            transaccionCliente service = new transaccionCliente();
            emp = service.findByIdClientes(idCliente);
            jNombre.setText(emp.getNombre());
        } catch (SQLException ex) {
            Logger.getLogger(estadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
