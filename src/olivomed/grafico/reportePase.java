package olivomed.grafico;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
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
public class reportePase extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public TableRowSorter trsFiltro;
    public TableRowSorter trsFiltro1;
    public TableRowSorter trsFiltro2;

    public reportePase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jMedico = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jAño = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        comboFiltro1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtFiltro1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMes1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jAño1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        comboFiltro2 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtFiltro2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMedico1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jAño2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Generar por:");

        jTable2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "CODIGO", "NOMBRE", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jMes.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Medico");

        jMedico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Ezer Rodriguez", "Dra. Gilma Ramirez", "Dr. Norman Godoy", "Clinica Los Angeles" }));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Año");

        jAño.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAñoKeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton4.setText("Generar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por");
        jToolBar1.add(jLabel1);

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("......");
        jToolBar1.add(jLabel19);

        comboFiltro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO", "NOMBRE", " " }));
        jToolBar1.add(comboFiltro);

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
        jToolBar1.add(jButton1);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("..............................");
        jToolBar1.add(jLabel22);

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar1.add(jLabel18);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(25, 25, 25))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PASE MES - MEDICO", jPanel1);

        jToolBar2.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar2.setRollover(true);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Buscar por");
        jToolBar2.add(jLabel2);

        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("......");
        jToolBar2.add(jLabel23);

        comboFiltro1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboFiltro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO", "NOMBRE", "CAPATAZ" }));
        jToolBar2.add(comboFiltro1);

        jLabel24.setForeground(new java.awt.Color(204, 204, 255));
        jLabel24.setText(".....");
        jToolBar2.add(jLabel24);

        txtFiltro1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtFiltro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltro1KeyPressed(evt);
            }
        });
        jToolBar2.add(txtFiltro1);

        jLabel25.setForeground(new java.awt.Color(204, 204, 255));
        jLabel25.setText("......");
        jToolBar2.add(jLabel25);

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
        jToolBar2.add(jButton2);

        jLabel26.setForeground(new java.awt.Color(204, 204, 255));
        jLabel26.setText("..............................");
        jToolBar2.add(jLabel26);

        jLabel27.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar2.add(jLabel27);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("Generar por:");

        jMes1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Año");

        jAño1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jAño1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAño1KeyPressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton5.setText("Generar");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "CODIGO", "NOMBRE", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable3KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jAño1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("", jPanel2);

        jTabbedPane1.addTab("PASES POR MES", jTabbedPane2);

        jToolBar3.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar3.setRollover(true);

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Buscar por");
        jToolBar3.add(jLabel8);

        jLabel28.setForeground(new java.awt.Color(204, 204, 255));
        jLabel28.setText("......");
        jToolBar3.add(jLabel28);

        comboFiltro2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboFiltro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO", "NOMBRE", "CAPATAZ" }));
        jToolBar3.add(comboFiltro2);

        jLabel29.setForeground(new java.awt.Color(204, 204, 255));
        jLabel29.setText(".....");
        jToolBar3.add(jLabel29);

        txtFiltro2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtFiltro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltro2KeyPressed(evt);
            }
        });
        jToolBar3.add(txtFiltro2);

        jLabel30.setForeground(new java.awt.Color(204, 204, 255));
        jLabel30.setText("......");
        jToolBar3.add(jLabel30);

        jButton3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton3.setText("Generar Documento");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton3);

        jLabel31.setForeground(new java.awt.Color(204, 204, 255));
        jLabel31.setText("..............................");
        jToolBar3.add(jLabel31);

        jLabel32.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel32);

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("Medico");

        jMedico1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMedico1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Ezer Rodriguez", "Dra. Gilma Ramirez", "Dr. Norman Godoy" }));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("Año");

        jAño2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jAño2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAño2KeyPressed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton6.setText("Generar");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable4.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "CODIGO", "NOMBRE", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jTable4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable4KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jAño2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jAño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("", jPanel3);

        jTabbedPane1.addTab("PASE POR MEDICO", jTabbedPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        // TODO add your handling code here:
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(jTable2.getModel());
        jTable2.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        crearTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setPases();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAñoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAñoKeyPressed

    private void txtFiltro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro1KeyPressed
        // TODO add your handling code here:
        txtFiltro1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro1.getText());
                txtFiltro1.setText(cadena);
                repaint();
                filtro1();
            }
        });
        trsFiltro1 = new TableRowSorter(jTable3.getModel());
        jTable3.setRowSorter(trsFiltro1);
    }//GEN-LAST:event_txtFiltro1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crearTablePASESPORMES();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jAño1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAño1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAño1KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setPasesXMES();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    private void txtFiltro2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro2KeyPressed
        // TODO add your handling code here:
        txtFiltro2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro2.getText());
                txtFiltro2.setText(cadena);
                repaint();
                filtro2();
            }
        });
        trsFiltro2 = new TableRowSorter(jTable4.getModel());
        jTable4.setRowSorter(trsFiltro2);
    }//GEN-LAST:event_txtFiltro2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        crearTablePASESPORMEDICO();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jAño2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAño2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAño2KeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setPasesMEDICO();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4KeyPressed

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
            java.util.logging.Logger.getLogger(reportePase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportePase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportePase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportePase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new reportePase().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<String> comboFiltro1;
    private javax.swing.JComboBox<String> comboFiltro2;
    private javax.swing.JTextField jAño;
    private javax.swing.JTextField jAño1;
    private javax.swing.JTextField jAño2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMedico;
    private javax.swing.JComboBox<String> jMedico1;
    private javax.swing.JComboBox<String> jMes;
    private javax.swing.JComboBox<String> jMes1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtFiltro1;
    private javax.swing.JTextField txtFiltro2;
    // End of variables declaration//GEN-END:variables

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void agregarFilas1() {
        DefaultTableModel temp = (DefaultTableModel) jTable3.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void agregarFilas2() {
        DefaultTableModel temp = (DefaultTableModel) jTable4.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void setPases() {
        String mes = jMes.getSelectedItem().toString();
        String medico = jMedico.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        Pase p;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMesMedico(mes, medico);
        for (int x = 0; x < pases.size(); x++) {
            p = pases.get(x);
            int anio = Integer.parseInt(jAño.getText());
            if (anio == obtenerAnio(p.getFecha())) {
                agregarFilas();
                jTable2.setValueAt(x + 1, x, 0);
                jTable2.setValueAt(p.getIdempleado(), x, 1);
                jTable2.setValueAt(p.getNombre(), x, 2);
                jTable2.setValueAt(p.getValor(), x, 3);
                suma = suma + p.getValor();
            }
        }
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", suma,};
        temp.addRow(nuevo);
    }

    public void setPasesXMES() {
        String mes = jMes1.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        Pase p;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMes(mes);
        for (int x = 0; x < pases.size(); x++) {
            p = pases.get(x);
            int anio = Integer.parseInt(jAño1.getText());
            if (anio == obtenerAnio(p.getFecha())) {
                agregarFilas1();
                jTable3.setValueAt(x + 1, x, 0);
                jTable3.setValueAt(p.getIdempleado(), x, 1);
                jTable3.setValueAt(p.getNombre(), x, 2);
                jTable3.setValueAt(p.getValor(), x, 3);
                suma = suma + p.getValor();
            }
        }
        DefaultTableModel temp = (DefaultTableModel) jTable3.getModel();
        Object nuevo[] = {"", "", "", suma,};
        temp.addRow(nuevo);
    }

    public void setPasesMEDICO() {
        String medico = jMedico1.getSelectedItem().toString();
        transaccionPase service = new transaccionPase();
        Pase p;
        float suma = (float) 0.0;
        ArrayList<Pase> pases;
        pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMedico(medico);
        for (int x = 0; x < pases.size(); x++) {
            p = pases.get(x);
            int anio = Integer.parseInt(jAño2.getText());
            if (anio == obtenerAnio(p.getFecha())) {
                agregarFilas2();
                jTable4.setValueAt(x + 1, x, 0);
                jTable4.setValueAt(p.getIdempleado(), x, 1);
                jTable4.setValueAt(p.getNombre(), x, 2);
                jTable4.setValueAt(p.getValor(), x, 3);
                suma = suma + p.getValor();
            }
        }
        DefaultTableModel temp = (DefaultTableModel) jTable4.getModel();
        Object nuevo[] = {"", "", "", suma,};
        temp.addRow(nuevo);
    }

    public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "CODIGO") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "NOMBRE") {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    public void filtro1() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "CODIGO") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "NOMBRE") {
            columnaABuscar = 2;
        }
        trsFiltro1.setRowFilter(RowFilter.regexFilter(txtFiltro1.getText(), columnaABuscar));
    }

    public void filtro2() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "CODIGO") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "NOMBRE") {
            columnaABuscar = 2;
        }
        trsFiltro2.setRowFilter(RowFilter.regexFilter(txtFiltro2.getText(), columnaABuscar));
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

    public void crearTable() {
        try {
            String mes = jMes.getSelectedItem().toString();
            String medico = jMedico.getSelectedItem().toString();
            float sumaded = (float) 0.0;
            String parrafo1 = "PASES MEDICOS";
            String parrafo2 = jMedico.getSelectedItem().toString();
            String parrafo3 = jMes.getSelectedItem().toString() + " del año " + jAño.getText();
            String parrafo4 = "___________________________________";
            String parrafo5 = "Firma";

            String path = "C:\\Users\\CRISTINA\\Documents\\OLIVOPMED\\Olivomed\\template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
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
            tableOneRowOne.getCell(0).setText("Nº");
            tableOneRowOne.getCell(1).setText("CODIGO");
            tableOneRowOne.getCell(2).setText("EMPLEADO");
            tableOneRowOne.getCell(3).setText("DEDUCCION");

            for (int i = 0; i < jTable2.getRowCount(); i++) {
                XWPFTableRow row = tableOne.getRow(i);
                row.getCell(0).setText(Integer.toString(i));
            }

            transaccionPase service = new transaccionPase();
            Pase p;
            float suma = (float) 0.0;
            Deduccion ded;
            int rowNr = 1;

            ArrayList<Pase> pases;
            pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMesMedico(mes, medico);
            for (int x = 0; x < pases.size(); x++) {
                p = pases.get(x);
                int anio = Integer.parseInt(jAño.getText());
                if (anio == obtenerAnio(p.getFecha())) {
                    agregarFilas();
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(p.getIdempleado());
                    row.getCell(2).setText(p.getNombre());
                    row.getCell(3).setText(formatNumber(p.getValor()));
                    suma = suma + p.getValor();
                }
            }
            XWPFTableRow row = tableOne.getRow(nRows - 1);
            row.getCell(3).setText(formatNumber(suma));

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.addBreak();
            run4.addBreak();
            run4.addBreak();
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setFontFamily("Consolas");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.CENTER);

            try (FileOutputStream outStream = new FileOutputStream("C:\\Users\\CRISTINA\\Documents\\Documentos Medicos\\Pases medicos de " + medico + " mes de " + mes + " año " + jAño.getText() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (IOException ex) {
            Logger.getLogger(reportePase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String formatNumber(float cantidad) {
        String res;
        DecimalFormat formato = new DecimalFormat("#,###.00");
        res = formato.format(cantidad);
        return res;
    }

    public void crearTablePASESPORMES() {
        try {
            String mes = jMes1.getSelectedItem().toString();
            float sumaded = (float) 0.0;
            String parrafo1 = "PASES MEDICOS";
            String parrafo3 = "Mes " + jMes1.getSelectedItem().toString() + " del año " + jAño1.getText();
            String parrafo4 = "___________________________________";
            String parrafo5 = "Firma";

            String path = "C:\\Users\\CRISTINA\\Documents\\OLIVOPMED\\Olivomed\\template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.CENTER);

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
            tableOneRowOne.getCell(0).setText("Nº");
            tableOneRowOne.getCell(1).setText("CODIGO");
            tableOneRowOne.getCell(2).setText("EMPLEADO");
            tableOneRowOne.getCell(3).setText("DEDUCCION");

            for (int i = 0; i < jTable2.getRowCount(); i++) {
                XWPFTableRow row = tableOne.getRow(i);
                row.getCell(0).setText(Integer.toString(i));
            }

            transaccionPase service = new transaccionPase();
            Pase p;
            float suma = (float) 0.0;
            Deduccion ded;
            int rowNr = 1;

            ArrayList<Pase> pases;
            pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMes(mes);
            for (int x = 0; x < pases.size(); x++) {
                p = pases.get(x);
                int anio = Integer.parseInt(jAño.getText());
                if (anio == obtenerAnio(p.getFecha())) {
                    agregarFilas();
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(p.getIdempleado());
                    row.getCell(2).setText(p.getNombre());
                    row.getCell(3).setText(formatNumber(p.getValor()));
                    suma = suma + p.getValor();
                }
            }
            XWPFTableRow row = tableOne.getRow(nRows - 1);
            row.getCell(3).setText(formatNumber(suma));

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.addBreak();
            run4.addBreak();
            run4.addBreak();
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setFontFamily("Consolas");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.CENTER);

            try (FileOutputStream outStream = new FileOutputStream("C:\\Users\\CRISTINA\\Documents\\Documentos Medicos\\Pases medicos de " + mes + " del año " + jAño1.getText() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (IOException ex) {
            Logger.getLogger(reportePase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void crearTablePASESPORMEDICO() {
        try {
            String medico = jMes1.getSelectedItem().toString();
            float sumaded = (float) 0.0;
            String parrafo1 = "PASES MEDICOS";
            String parrafo3 = "Medico " + jMedico1.getSelectedItem().toString() + " del año " + jAño2.getText();
            String parrafo4 = "___________________________________";
            String parrafo5 = "Firma";

            String path = "C:\\Users\\CRISTINA\\Documents\\OLIVOPMED\\Olivomed\\template.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(12);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.CENTER);

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
            tableOneRowOne.getCell(0).setText("Nº");
            tableOneRowOne.getCell(1).setText("CODIGO");
            tableOneRowOne.getCell(2).setText("EMPLEADO");
            tableOneRowOne.getCell(3).setText("DEDUCCION");

            for (int i = 0; i < jTable2.getRowCount(); i++) {
                XWPFTableRow row = tableOne.getRow(i);
                row.getCell(0).setText(Integer.toString(i));
            }

            transaccionPase service = new transaccionPase();
            Pase p;
            float suma = (float) 0.0;
            Deduccion ded;
            int rowNr = 1;

            ArrayList<Pase> pases;
            pases = (ArrayList<Pase>) service.obtenerUltimoPaseByMedico(medico);
            for (int x = 0; x < pases.size(); x++) {
                p = pases.get(x);
                int anio = Integer.parseInt(jAño.getText());
                if (anio == obtenerAnio(p.getFecha())) {
                    agregarFilas();
                    XWPFTableRow row = tableOne.getRow(rowNr++);
                    row.getCell(1).setText(p.getIdempleado());
                    row.getCell(2).setText(p.getNombre());
                    row.getCell(3).setText(formatNumber(p.getValor()));
                    suma = suma + p.getValor();
                }
            }
            XWPFTableRow row = tableOne.getRow(nRows - 1);
            row.getCell(3).setText(formatNumber(suma));

            XWPFParagraph paragraph4 = writedoc.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            run4.setFontSize(12);
            run4.addBreak();
            run4.addBreak();
            run4.addBreak();
            run4.setFontFamily("Consolas");
            run4.setText(parrafo4);
            paragraph4.setAlignment(ParagraphAlignment.CENTER);

            XWPFParagraph paragraph5 = writedoc.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            run5.setFontSize(12);
            run5.setFontFamily("Consolas");
            run5.setText(parrafo5);
            paragraph5.setAlignment(ParagraphAlignment.CENTER);

            try (FileOutputStream outStream = new FileOutputStream("C:\\Users\\CRISTINA\\Documents\\Documentos Medicos\\Pases medicos de " + medico + " del año " + jAño2.getText() + ".docx")) {
                writedoc.write(outStream);
                JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CON EXITO!");
            }

        } catch (IOException ex) {
            Logger.getLogger(reportePase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
