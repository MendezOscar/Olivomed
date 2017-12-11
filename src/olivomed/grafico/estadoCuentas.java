package olivomed.grafico;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static olivomed.grafico.desglosePase.jFecha;
import static olivomed.grafico.desglosePase.txtFiltro;
import olivomed.logica.transaccionDeduccion;
import olivomed.logica.transaccionPase;
import olivomed.modelos.Deduccion;
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
        jPlazo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el codigo del prestamo");
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

        jPlazo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Pagos");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Pase a Favor");

        jNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jTable2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo deduccion", "Numero", "Fecha", "Valor del pase", "Nº de Pagos", "Deduccion", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarPase();
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crearTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPlazo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void buscarPase() {
        String id = txtFiltro.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de prestamo ingresado");
        } else {
            try {
                Pase p;
                transaccionPase service = new transaccionPase();
                p = service.findByIdPase(id);
                if (p != null) {
                    setearPrestamo(p);
                } else {
                    JOptionPane.showMessageDialog(null, "El Prestamo: " + id + " no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(estadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setearPrestamo(Pase p) {
        jNombre.setText(p.getNombre());
        jPlazo.setText(Float.toString(p.getPagos()));
        jTable2.setValueAt(p.getNumero(), 0, 1);
        jTable2.setValueAt(p.getFecha(), 0, 2);
        jTable2.setValueAt(p.getValor(), 0, 3);
        jTable2.setValueAt(p.getPagos(), 0, 4);
        jTable2.setValueAt(p.getDeduccion(), 0, 5);
        jTable2.setValueAt(p.getValor(), 0, 6);
        obtenerDeducciones();
    }

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    private void obtenerDeducciones() {
        try {
            String idPrestamo = txtFiltro.getText();
            transaccionPase service = new transaccionPase();
            transaccionDeduccion servi = new transaccionDeduccion();
            Pase pres = service.findByIdPase(idPrestamo);
            Deduccion ded;
            ArrayList<Deduccion> depts;
            depts = (ArrayList<Deduccion>) servi.obtenerUltimaDeduccionByIdPaseAcs(idPrestamo);
            for (int x = 0; x < depts.size(); x++) {
                ded = depts.get(x);
                agregarFilas();
                jTable2.setValueAt(ded.getIdDeduccion(), x + 1, 0);
                jTable2.setValueAt(ded.getFecha(), x + 1, 2);
                jTable2.setValueAt(ded.getValor(), x + 1, 5);
                jTable2.setValueAt(ded.getSaldo(), x + 1, 6);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(estadoCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void crearTable() {
        try {
            String idPrestamo = txtFiltro.getText();
            transaccionPase service = new transaccionPase();
            Pase pres = service.findByIdPase(idPrestamo);

            String parrafo1 = "PASE MEDICO";
            String parrafo2 = "Estado de cuentas";
            String parrafo3 = "Otorgado a: " + pres.getNombre();
            String parrafo4 = "Pagadero en " + pres.getPagos() + " pagos quincenales";

            String path = "template.docx";
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

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            int nRows = jTable2.getRowCount();
            int nCols = jTable2.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("DEDUCCION");
            tableOneRowOne.getCell(1).setText("NUMERO");
            tableOneRowOne.getCell(2).setText("FECHA");
            tableOneRowOne.getCell(3).setText("PASE");
            tableOneRowOne.getCell(4).setText("PAGOS");
            tableOneRowOne.getCell(5).setText("DEDUCCION");
            tableOneRowOne.getCell(6).setText("SALDO");

            for (int x = 0; x < 1; x++) {
                XWPFTableRow tableRowTwo = tableOne.getRow(1);
                tableRowTwo.getCell(1).setText(Float.toString(pres.getNumero()));
                tableRowTwo.getCell(2).setText(pres.getFecha());
                tableRowTwo.getCell(3).setText(Float.toString(pres.getValor()));
                tableRowTwo.getCell(4).setText(Float.toString(pres.getPagos()));
                tableRowTwo.getCell(6).setText(Float.toString(pres.getValor()));
            }

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
                row.getCell(2).setText(ded.getFecha());               
                row.getCell(5).setText(Float.toString(ded.getValor()));
                row.getCell(6).setText(Float.toString(ded.getSaldo()));
            }

            try (FileOutputStream outStream = new FileOutputStream("Estado de cuentas de " + pres.getNombre() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(desglosePase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(desglosePase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}
