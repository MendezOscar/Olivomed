package olivomed.grafico;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import olivomed.logica.transaccionCliente;
import olivomed.logica.transaccionPase;
import olivomed.modelos.Empleado;
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
public final class reporteContabilidad extends javax.swing.JFrame {

    public DefaultTableModel tm;

    public reporteContabilidad() {
        initComponents();
        setColunma1();
        this.tm = (DefaultTableModel) jTable2.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jMedico = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jMes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jAño = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DEDUCCIONES", "SALDOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("DEDUCCIONES");

        jMedico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Ezer Rodriguez", "Dra. Gilma Ramirez", "Dr. Norman Godoy", "Clinica Los Angeles" }));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("MES");

        jMes.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("AÑO");

        jAño.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAñoKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton1.setText("Generar Documento");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAñoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            setPasesSocios();
            setPasesMensuales();
            setPasesEventuales();
            setPasesNoDeducibles();
            setTotal();
        }
    }//GEN-LAST:event_jAñoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        crearTable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(reporteContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reporteContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reporteContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reporteContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new reporteContabilidad().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAño;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jMedico;
    private javax.swing.JComboBox<String> jMes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void setColunma1() {
        jTable2.setValueAt("Eventuales", 0, 0);
        jTable2.setValueAt("Mensuales", 1, 0);
        jTable2.setValueAt("Socios", 2, 0);
        jTable2.setValueAt("No deducibles", 3, 0);
        jTable2.setValueAt("TOTAL", 4, 0);
    }

    public void setPasesSocios() {
        String mes = jMes.getSelectedItem().toString();
        String medico = jMedico.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        transaccionCliente tc = new transaccionCliente();
        Pase p;
        String idCliente;
        Empleado emp;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMesMedico(mes, medico);
        for (int x = 0; x < pases.size(); x++) {
            try {
                p = pases.get(x);
                idCliente = p.getIdempleado();
                emp = tc.findByIdClientes(idCliente);
                int anio = Integer.parseInt(jAño.getText());
                if ("Socio".equals(emp.getTipo())) {
                    if (anio == obtenerAnio(p.getFecha())) {
                        if ("DEDUCIBLE".equals(p.getEstado())) {
                            suma = suma + p.getValor();
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(reporteContabilidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jTable2.setValueAt(suma, 2, 1);
    }

    public void setPasesEventuales() {
        String mes = jMes.getSelectedItem().toString();
        String medico = jMedico.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        transaccionCliente tc = new transaccionCliente();
        Pase p;
        String idCliente;
        Empleado emp;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMesMedico(mes, medico);
        for (int x = 0; x < pases.size(); x++) {
            try {
                p = pases.get(x);
                idCliente = p.getIdempleado();
                emp = tc.findByIdClientes(idCliente);
                int anio = Integer.parseInt(jAño.getText());
                if ("Eventual".equals(emp.getTipo())) {
                    if (anio == obtenerAnio(p.getFecha())) {
                        if ("DEDUCIBLE".equals(p.getEstado())) {
                            suma = suma + p.getValor();
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(reporteContabilidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jTable2.setValueAt(suma, 0, 1);
    }

    public void setPasesMensuales() {
        String mes = jMes.getSelectedItem().toString();
        String medico = jMedico.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        transaccionCliente tc = new transaccionCliente();
        Pase p;
        String idCliente;
        Empleado emp;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMesMedico(mes, medico);
        for (int x = 0; x < pases.size(); x++) {
            try {
                p = pases.get(x);
                idCliente = p.getIdempleado();
                emp = tc.findByIdClientes(idCliente);
                int anio = Integer.parseInt(jAño.getText());
                if ("Mensual".equals(emp.getTipo())) {
                    if (anio == obtenerAnio(p.getFecha())) {
                        if ("DEDUCIBLE".equals(p.getEstado())) {
                            suma = suma + p.getValor();
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(reporteContabilidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jTable2.setValueAt(suma, 1, 1);
    }

    public void setPasesNoDeducibles() {
        String mes = jMes.getSelectedItem().toString();
        String medico = jMedico.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        transaccionCliente tc = new transaccionCliente();
        Pase p;
        String idCliente;
        Empleado emp;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMesMedico(mes, medico);
        for (int x = 0; x < pases.size(); x++) {
            try {
                p = pases.get(x);
                idCliente = p.getIdempleado();
                emp = tc.findByIdClientes(idCliente);
                int anio = Integer.parseInt(jAño.getText());
                if (anio == obtenerAnio(p.getFecha())) {
                    if ("NO DEDUCIBLE".equals(p.getEstado())) {
                        suma = suma + p.getValor();
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(reporteContabilidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jTable2.setValueAt(suma, 3, 1);
    }

    public void setTotal() {
        float socios = Float.parseFloat(String.valueOf(tm.getValueAt(2, 1)));
        float eventual = Float.parseFloat(String.valueOf(tm.getValueAt(0, 1)));
        float mensual = Float.parseFloat(String.valueOf(tm.getValueAt(1, 1)));
        float nodeducible = Float.parseFloat(String.valueOf(tm.getValueAt(3, 1)));
        float sumatotal = socios + eventual + mensual + nodeducible;
        jTable2.setValueAt(sumatotal, 4, 1);
    }

    public int obtenerAnio(String jfecha) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = jfecha;
            Date date = format.parse(fecha);
            String formato = "yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            return Integer.parseInt(dateFormat.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(reportePase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public String formatNumber(float cantidad) {
        String res;
        DecimalFormat formato = new DecimalFormat("#,###.00");
        res = formato.format(cantidad);
        return res;
    }

    private void crearTable() {
        try {
            float sumaded = (float) 0.0;
            String parrafo1 = "DEDUCCIONES PASES MEDICOS REPORTE GENERAL";
            String parrafo5 = jMedico.getSelectedItem().toString();
            String parrafo2 = "Concernientes al mes de " + jMes.getSelectedItem().toString() + " del año " + jAño.getText();
            String parrafo3 = "___________________________________";
            String parrafo4 = "Firma";

            String path = "template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setBold(true);
            run5.setFontFamily("Consolas");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(12);
            run2.setBold(true);
            run2.setFontFamily("Consolas");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.CENTER);

            int nRows = jTable2.getRowCount() + 1;
            int nCols = jTable2.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("DEDUCCIONES");
            tableOneRowOne.getCell(1).setText("SALDOS");
            float socios = Float.parseFloat(String.valueOf(tm.getValueAt(2, 1)));
            float eventual = Float.parseFloat(String.valueOf(tm.getValueAt(0, 1)));
            float mensual = Float.parseFloat(String.valueOf(tm.getValueAt(1, 1)));
            float nodeducible = Float.parseFloat(String.valueOf(tm.getValueAt(3, 1)));
            float sumatotal = Float.parseFloat(String.valueOf(tm.getValueAt(4, 1)));
            int rowNr = 1;
            for (int i = 0; i < 7 ; i++) {
                XWPFTableRow row = tableOne.getRow(rowNr++);
                switch (i) {
                    case 0:
                        row.getCell(0).setText("Eventuales");
                        row.getCell(1).setText(Float.toString(eventual));
                        break;
                    case 1:
                        row.getCell(0).setText("Mesuales");
                        row.getCell(1).setText(Float.toString(mensual));
                        break;
                    case 2:
                        row.getCell(0).setText("Socios");
                        row.getCell(1).setText(Float.toString(socios));
                        break;
                    case 3:
                        row.getCell(0).setText("No deducibles");
                        row.getCell(1).setText(Float.toString(nodeducible));
                        break;
                    case 4:
                        row.getCell(0).setText("TOTAL");
                        row.getCell(1).setText(Float.toString(sumatotal));
                       break;
                }

            }

            XWPFParagraph paragraph3 = writedoc.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            run3.setFontSize(12);
            run3.addBreak();
            run3.addBreak();
            run3.addBreak();
            run3.setFontFamily("Consolas");
            run3.setText(parrafo3);
            paragraph3.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.addBreak();
            run4.addBreak();
            run4.addBreak();
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            try (FileOutputStream outStream = new FileOutputStream("reporte a contabilidad de "
                    + jMedico.getSelectedItem().toString() + " del mes de " + jMes.getSelectedItem().toString()
                    + " del año " + jAño.getText() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (IOException ex) {
            Logger.getLogger(reporteContabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
