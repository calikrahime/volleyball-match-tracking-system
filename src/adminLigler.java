
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author rahimecalik
 */
public class adminLigler extends javax.swing.JFrame {

    /**
     * Creates new form adminLigler
     */
    public adminLigler() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSLigSonuclari = new javax.swing.JTable();
        jButtonLSEkle = new javax.swing.JButton();
        jButtonLSSİL = new javax.swing.JButton();
        jButtonLigSonuclari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableYesilKartSayisi = new javax.swing.JTable();
        jButtonYesilKartSayisi = new javax.swing.JButton();
        jButtonPuanTablosu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePuanTablosu = new javax.swing.JTable();
        jButtonYKSil = new javax.swing.JButton();
        jButtonYKEkle = new javax.swing.JButton();
        jButtonPTEkle = new javax.swing.JButton();
        jButtonPTSil = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonLig2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableLig2 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jButtonLig2Ekle = new javax.swing.JButton();
        jButtonL2Sil = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonELGörüntüleme = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableELTablo = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButtonELEkle = new javax.swing.JButton();
        jButtonELSil = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableSLigSonuclari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableSLigSonuclari);

        jButtonLSEkle.setText("LSEkle");
        jButtonLSEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLSEkleActionPerformed(evt);
            }
        });

        jButtonLSSİL.setText("LSSil");
        jButtonLSSİL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLSSİLActionPerformed(evt);
            }
        });

        jButtonLigSonuclari.setText("Lig sonuclari");
        jButtonLigSonuclari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLigSonuclariActionPerformed(evt);
            }
        });

        jTableYesilKartSayisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableYesilKartSayisi);

        jButtonYesilKartSayisi.setText("Yesil Kart Sayilari");
        jButtonYesilKartSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYesilKartSayisiActionPerformed(evt);
            }
        });

        jButtonPuanTablosu.setText("Puan Tablosu");
        jButtonPuanTablosu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuanTablosuActionPerformed(evt);
            }
        });

        jTablePuanTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTablePuanTablosu);

        jButtonYKSil.setText("YKSil");
        jButtonYKSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYKSilActionPerformed(evt);
            }
        });

        jButtonYKEkle.setText("YKEkle");
        jButtonYKEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYKEkleActionPerformed(evt);
            }
        });

        jButtonPTEkle.setText("PTEkle");
        jButtonPTEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPTEkleActionPerformed(evt);
            }
        });

        jButtonPTSil.setText("PTSil");
        jButtonPTSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPTSilActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tarih");

        jLabel6.setText("Saat");

        jLabel2.setText("İlk Takım");

        jLabel3.setText("İlk Takım Skor");

        jLabel4.setText("İkinci Takım Skor");

        jLabel5.setText("İkinci Takım");

        jLabel7.setText("Ad");

        jLabel8.setText("Yesil Kart Sayisi");

        jLabel9.setText("Takim");

        jLabel10.setText("Galibiyet");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel13.setText("Beraberlik");

        jLabel11.setText("Malubiyet");

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel1)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel6)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonLSEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonLSSİL, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(31, 31, 31)
                                                        .addComponent(jLabel4))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jLabel11)))
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField7)
                                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPTSil)
                            .addComponent(jButtonPTEkle))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButtonYesilKartSayisi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jButtonPuanTablosu)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonYKSil)
                            .addComponent(jButtonYKEkle)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(240, 240, 240))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jButtonLigSonuclari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLSEkle)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLSSİL)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLigSonuclari)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonYesilKartSayisi)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPuanTablosu)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jButtonYKEkle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonYKSil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButtonPTEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPTSil)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("sultanlarLigi", jPanel1);

        jButtonLig2.setText("Lig 2 ");
        jButtonLig2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLig2ActionPerformed(evt);
            }
        });

        jTableLig2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTableLig2);

        jLabel19.setText("Date");

        jLabel20.setText("Saat");

        jLabel21.setText("Ilk Takım");

        jLabel22.setText("Ilk Skor");

        jLabel23.setText("Ikinci Skor");

        jLabel24.setText("Ikici Takim");

        jButtonLig2Ekle.setText("Ekle");
        jButtonLig2Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLig2EkleActionPerformed(evt);
            }
        });

        jButtonL2Sil.setText("Sil");
        jButtonL2Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonL2SilActionPerformed(evt);
            }
        });

        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel21)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(130, 130, 130)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(315, 315, 315)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonLig2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(jTextField22))
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel24))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonL2Sil, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addComponent(jButtonLig2Ekle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2))
                .addGap(242, 242, 242))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButtonLig2)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLig2Ekle))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonL2Sil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        jTabbedPane1.addTab("lig2", jPanel3);

        jButtonELGörüntüleme.setText("Efeler Ligi Görüntüle");
        jButtonELGörüntüleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELGörüntülemeActionPerformed(evt);
            }
        });

        jTableELTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTableELTablo);

        jLabel12.setText("Date");

        jLabel14.setText("Saat");

        jLabel15.setText("ilkTakim");

        jLabel16.setText("ikinciSkor");

        jLabel17.setText("ilkSkor");

        jLabel18.setText("ikinciTakim");

        jButtonELEkle.setText("Ekle");
        jButtonELEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELEkleActionPerformed(evt);
            }
        });

        jButtonELSil.setText("Sil");
        jButtonELSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELSilActionPerformed(evt);
            }
        });

        jButton4.setText("Geri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18))
                            .addComponent(jButtonELGörüntüleme, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonELSil)
                        .addComponent(jButtonELEkle))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(227, 227, 227))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonELGörüntüleme)
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonELEkle))
                .addGap(18, 18, 18)
                .addComponent(jButtonELSil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("efelerLigi", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //5 TANE VERİ GETİR METHODU VAR 
    //Her bir metod belirli bir tablodan verileri getirir ve DefaultTableModel nesnesine ekler. 
    //DriverManager.getConnection ile veritabanına bağlanılır.
    //createStatement ve executeQuery metodları ile SQL sorgusu çalıştırılır.
    //ResultSet nesnesi ile sorgu sonuçları alınır.
    //ResultSetMetaData nesnesi ile sütun sayısı ve sütun adları gibi bilgiler alınır.
    //DefaultTableModel oluşturulup, sütun adları eklenir ve satırlar model eklenir.
    //ResultSet, Statement ve Connection nesneleri kapatılır.

    // Sultanlar Ligi verilerini getiren metod 
    public DefaultTableModel veriGetir() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
        Statement s = c.createStatement();
        ResultSet resultSet = s.executeQuery("SELECT * FROM proje.sultanLigi");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int sütunSayısı = metaData.getColumnCount();

        DefaultTableModel model = new DefaultTableModel();
        for (int i = 1; i <= sütunSayısı; i++) {
            model.addColumn(metaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Object[] row = new Object[sütunSayısı];
            for (int i = 1; i <= sütunSayısı; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            model.addRow(row);
        }

        resultSet.close();
        s.close();
        c.close();

        return model;
    }
    // Yeşil Kart Sayısı verilerini getiren metod

    public DefaultTableModel veriGetir2() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
        Statement s = c.createStatement();
        ResultSet resultSet = s.executeQuery("SELECT * FROM proje.yesilKartSayisi");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int sütunSayısı = metaData.getColumnCount();

        DefaultTableModel model2 = new DefaultTableModel();
        for (int i = 1; i <= sütunSayısı; i++) {
            model2.addColumn(metaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Object[] row = new Object[sütunSayısı];
            for (int i = 1; i <= sütunSayısı; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            model2.addRow(row);
        }

        resultSet.close();
        s.close();
        c.close();

        return model2;
    }
    // Puan Tablosu verilerini getiren metod

    public DefaultTableModel veriGetir3() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
        Statement s = c.createStatement();
        ResultSet resultSet = s.executeQuery("SELECT * FROM proje.puanTablosu");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int sütunSayısı = metaData.getColumnCount();

        DefaultTableModel model3 = new DefaultTableModel();
        for (int i = 1; i <= sütunSayısı; i++) {
            model3.addColumn(metaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Object[] row = new Object[sütunSayısı];
            for (int i = 1; i <= sütunSayısı; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            model3.addRow(row);
        }

        resultSet.close();
        s.close();
        c.close();

        return model3;
    }
    // Efeler Ligi verilerini getiren metod

    public DefaultTableModel veriGetir4() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
        Statement s = c.createStatement();
        ResultSet resultSet = s.executeQuery("SELECT * FROM proje.efelerLig");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int sütunSayısı = metaData.getColumnCount();

        DefaultTableModel model4 = new DefaultTableModel();
        for (int i = 1; i <= sütunSayısı; i++) {
            model4.addColumn(metaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Object[] row = new Object[sütunSayısı];
            for (int i = 1; i <= sütunSayısı; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            model4.addRow(row);
        }

        resultSet.close();
        s.close();
        c.close();

        return model4;
    }
    // 2. Lig verilerini getiren metod

    public DefaultTableModel veriGetir5() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
        Statement s = c.createStatement();
        ResultSet resultSet = s.executeQuery("SELECT * FROM proje.lig2");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int sütunSayısı = metaData.getColumnCount();

        DefaultTableModel model5 = new DefaultTableModel();
        for (int i = 1; i <= sütunSayısı; i++) {
            model5.addColumn(metaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Object[] row = new Object[sütunSayısı];
            for (int i = 1; i <= sütunSayısı; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            model5.addRow(row);
        }

        resultSet.close();
        s.close();
        c.close();

        return model5;
    }

    private void jButtonLSSİLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLSSİLActionPerformed
        //Butona basıldığında seçili satırı hem tablodan hem sql veritabanından sil
        try {
            // Seçilen satırı al
            int selectedRow = jTableSLigSonuclari.getSelectedRow();
            // Eğer seçili satır yoksa kullanıcıya uyarı göster
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Lütfen silinecek satırı seçin.");
            } else {
                // Veritabanı bağlantısını oluştur
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
                Statement s = c.createStatement();
// Seçili satırdaki 'ilkTakim' sütununun değerini al
                Object ilkTakimObject = jTableSLigSonuclari.getModel().getValueAt(selectedRow, 2);
                String ilkTakimToDelete;
                if (ilkTakimObject instanceof String) {
                    ilkTakimToDelete = (String) ilkTakimObject;
                } else {
                    //Eğer değer String türünde değilse, IllegalArgumentException fırlatılır.
                    throw new IllegalArgumentException("Değişken tipi hatası oluştu.");
                }

                // Veritabanından ilgili kaydı silmek için SQL sorgusu 
                String sql = "DELETE FROM proje.sultanLigi WHERE ilkTakim = '" + ilkTakimToDelete + "'";
                s.executeUpdate(sql);

                // DefaultTableModel kullanılarak JTable'dan seçilen satır kaldırılır.
                ((DefaultTableModel) jTableSLigSonuclari.getModel()).removeRow(selectedRow);
// Kaynakları kapat
                s.close();
                c.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            // SQL hatası durumunda hata mesajını yazdır ve kullanıcıya uyarı göster
            JOptionPane.showMessageDialog(null, "Veritabanı işlemi sırasında bir hata oluştu.");
        } catch (IllegalArgumentException ex) {
            // Tip hatası durumunda hata mesajını yazdır ve kullanıcıya uyarı göster
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Sütun hatalı türde veri içeriyor.");
        }
    }//GEN-LAST:event_jButtonLSSİLActionPerformed

    private void jButtonLigSonuclariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLigSonuclariActionPerformed

        // veriGetir() metodunu çağırarak tablo modelini elde etme
        try {
            DefaultTableModel model = veriGetir();
            jTableSLigSonuclari.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButtonLigSonuclariActionPerformed

    private void jButtonLSEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLSEkleActionPerformed
        // DefaultTableModel oluşturma
        DefaultTableModel model = new DefaultTableModel();
        try {
            // Veritabanına bağlantı kurulması
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
            // Sultanlar Ligi tablosuna veri eklemek için SQL sorgusu
            String insertQuery = "INSERT INTO sultanLigi (tarih, saat, ilkTakim, ilkSkor, ikinciSkor, ikinciTakim) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = c.prepareStatement(insertQuery);
            // TextField'ların içeriklerini almak
            String tarih = jTextField1.getText();
            String saat = jTextField6.getText();
            String ilkTakim = jTextField2.getText();
            String ilkSkor = jTextField3.getText();
            String ikinciSkor = jTextField4.getText();
            String ikinciTakim = jTextField5.getText();

// TextField'ların boş olup olmadığını kontrol et
            if (tarih.isEmpty() || saat.isEmpty() || ilkTakim.isEmpty() || ilkSkor.isEmpty() || ikinciSkor.isEmpty() || ikinciTakim.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                return; // İşlemi sonlandır
            }
            // SQL sorgusu için parametreleri ayarlama
            st.setString(1, tarih);
            st.setString(2, saat);
            st.setString(3, ilkTakim);
            st.setString(4, ilkSkor);
            st.setString(5, ikinciSkor);
            st.setString(6, ikinciTakim);
// SQL sorgusunu çalıştırma
            st.executeUpdate();
            // Kaynakları kapatma
            st.close();
            c.close();
            JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla eklendi.");
// TextField'ları temizleme
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();

        }


    }//GEN-LAST:event_jButtonLSEkleActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButtonYesilKartSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYesilKartSayisiActionPerformed

        try {
            //veriGetir2() metodunu çağırma ve JTable modelini ayarlama
            DefaultTableModel model2 = veriGetir2();
            // JTable'a oluşturulan tablo modelini ekleme
            jTableYesilKartSayisi.setModel(model2);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonYesilKartSayisiActionPerformed

    private void jButtonYKEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYKEkleActionPerformed
        // Yeni bir DefaultTableModel oluşturma
        DefaultTableModel model2 = new DefaultTableModel();
        // TextField'lardan girilen verileri alma
        String adı = ad.getText();
        String yesilKartSayisiStr = jTextField7.getText();
// Girilen verilerin boş olup olmadığını kontrol etme
        if (adı.isEmpty() || yesilKartSayisiStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return; // İşlemi sonlandır
        }
// Yeşil Kart Sayısı'nın geçerli bir sayı olup olmadığını kontrol etme
        int yesilKartSayisi;
        try {
            yesilKartSayisi = Integer.parseInt(yesilKartSayisiStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Yeşil Kart Sayısı geçerli bir sayı olmalıdır.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return; // İşlemi sonlandır
        }
        try {
            // Veritabanına bağlantı kurulması ve SQL sorgusu çalıştırılması
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
            // yesilKartSayisi tablosuna veri eklemek için SQL sorgusu
            String insertQuery = "INSERT INTO yesilKartSayisi (ad, yesilKartSayisi) VALUES (?, ?)";
            PreparedStatement st = c.prepareStatement(insertQuery);
// SQL sorgusu için parametreleri ayarlama
            st.setString(1, adı);
            st.setInt(2, yesilKartSayisi);
// SQL sorgusunu çalıştırma
            st.executeUpdate();
            // Kaynakları kapatma
            st.close();
            c.close();
            JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla eklendi.");
// TextField'ları temizleme
            ad.setText("");
            jTextField7.setText("");

        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButtonYKEkleActionPerformed

    private void jButtonYKSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYKSilActionPerformed

        try {
            // Kullanıcının JTable'da seçtiği satırı al
            int selectedRow = jTableYesilKartSayisi.getSelectedRow();
            // Eğer seçili satır yoksa kullanıcıya uyarı göster
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Lütfen silinecek satırı seçin.");
                return; // İşlemi sonlandır
            } else {
                // Veritabanına bağlantı kurulması
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
                Statement s = c.createStatement();
// Seçili satırdaki 'ad' sütununun değerini al
                Object adObject = jTableYesilKartSayisi.getModel().getValueAt(selectedRow, 0);
                String adToDelete;
                if (adObject instanceof String) {
                    adToDelete = (String) adObject;
                } else {
                    throw new IllegalArgumentException("Değişken tipi hatası oluştu.");
                }

                // Veritabanından sql sorgusu ile ilgili kaydı sil
                String sql = "DELETE FROM proje.yesilKartSayisi WHERE ad = '" + adToDelete + "'";
                int affectedRows = s.executeUpdate(sql);
//affectedRows, SQL sorgusunun kaç satırı etkilediğini belirten bir değişkendir. Eğer affectedRows değeri 0'dan büyükse, bu sorgunun başarılı olduğunu ve en az bir satırı etkilediğini gösterir.
                if (affectedRows > 0) {
                    
                    DefaultTableModel model2 = (DefaultTableModel) jTableYesilKartSayisi.getModel();
                    //removeRow metodu, belirtilen satır indeksine sahip satırı tablodan kaldırır. selectedRow, kullanıcının tablodan seçtiği satırın indeksidir.
                    model2.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla silindi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Silme işlemi başarısız oldu.", "Hata", JOptionPane.ERROR_MESSAGE);
                }

                s.close();
                c.close();
            }
        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdır ve kullanıcıya uyarı göster
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Veritabanı işlemi sırasında bir hata oluştu.");
        } catch (IllegalArgumentException ex) {
            // Tip hatası durumunda hata mesajını yazdır ve kullanıcıya uyarı göster
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sütun hatalı türde veri içeriyor.");
        }


    }//GEN-LAST:event_jButtonYKSilActionPerformed

    private void jButtonPuanTablosuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuanTablosuActionPerformed

        try {
            //veriGetir3() metodunu çağırma ve JTable modelini ayarlama
            DefaultTableModel model3 = veriGetir3();
            jTablePuanTablosu.setModel(model3);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButtonPuanTablosuActionPerformed

    private void jButtonPTEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPTEkleActionPerformed
        DefaultTableModel model3 = new DefaultTableModel();
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
            // puanTablosu tablosuna veri eklemek için INSERT sorgusu oluşturulur.
            String insertQuery = "INSERT INTO puanTablosu (takim, galibiyet, beraberlik, malubiyet) VALUES (?, ?, ?, ?)";
            //PreparedStatement nesnesi kullanılarak SQL sorgusu hazırlanır.
            PreparedStatement st = c.prepareStatement(insertQuery);
// TextField'lardan girilen verileri alma
            String takim = jTextField9.getText();
            String malubiyet = jTextField10.getText();
            String beraberlik = jTextField13.getText();
            String galibiyet = jTextField11.getText();
// Girilen verilerin boş olup olmadığını kontrol etme
            if (takim.isEmpty() || malubiyet.isEmpty() || beraberlik.isEmpty() || galibiyet.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                return; // İşlemi sonlandır
            }
// Kullanıcıdan alınan veriler PreparedStatement nesnesine parametre olarak eklenir.
            st.setString(1, takim);
            st.setString(2, malubiyet);
            st.setString(3, beraberlik);
            st.setString(4, galibiyet);
// SQL sorgusunu çalıştırma
            st.executeUpdate();
            // Kaynakları kapatma
            st.close();
            c.close();
            JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla eklendi.");
// TextField'ları temizleme
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField13.setText("");
            jTextField11.setText("");

        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();

        }

    }//GEN-LAST:event_jButtonPTEkleActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonELEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELEkleActionPerformed
        // Yeni bir DefaultTableModel oluşturma
        DefaultTableModel model5 = new DefaultTableModel();
        try {
            // Veritabanına bağlantı kurulması
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
            // efelerLig tablosuna veri eklemek için SQL sorgusu
            String insertQuery = "INSERT INTO efelerLig (date, saat, ilkTakim, ilkSkor, ikinciSkor, ikinciTakim) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = c.prepareStatement(insertQuery);
// TextField'lardan girilen verileri alma
            String date = jTextField8.getText();
            String saat = jTextField12.getText();
            String ilkTakim = jTextField14.getText();
            String ilkSkor = jTextField15.getText();
            String ikinciSkor = jTextField16.getText();
            String ikinciTakim = jTextField17.getText();

// TextField'ların boş olup olmadığını kontrol et
            if (date.isEmpty() || saat.isEmpty() || ilkTakim.isEmpty() || ilkSkor.isEmpty() || ikinciSkor.isEmpty() || ikinciTakim.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                return; // İşlemi sonlandır
            }
// SQL sorgusu için parametreleri ayarlama
            st.setString(1, date);
            st.setString(2, saat);
            st.setString(3, ilkTakim);
            st.setString(4, ilkSkor);
            st.setString(5, ikinciSkor);
            st.setString(6, ikinciTakim);
// SQL sorgusunu çalıştırma
            st.executeUpdate();
            // Kaynakları kapatma
            JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla eklendi.");
            st.close();
            c.close();
// TextField'ları temizleme
            jTextField8.setText("");
            jTextField12.setText("");
            jTextField14.setText("");
            jTextField15.setText("");
            jTextField16.setText("");
            jTextField17.setText("");
        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButtonELEkleActionPerformed

    private void jButtonELGörüntülemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELGörüntülemeActionPerformed

        try {
            //veriGetir4() metodunu çağırma ve JTable modelini ayarlama
            DefaultTableModel model4 = veriGetir4();
            jTableELTablo.setModel(model4);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButtonELGörüntülemeActionPerformed

    private void jButtonELSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELSilActionPerformed
        try {
            // Kullanıcının seçtiği satırı al
            int selectedRow = jTableELTablo.getSelectedRow();
            // Eğer satır seçilmemişse kullanıcıya uyarı mesajı göster
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Lütfen silinecek satırı seçin.");
            } else {
                // Veritabanına bağlantı kurulması
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
                Statement s = c.createStatement();
                // Seçilen satırdaki veriyi al
                Object ikinciTakimObject = jTableELTablo.getModel().getValueAt(selectedRow, 5);
                String ikinciTakimToDelete;
                if (ikinciTakimObject instanceof String) {
                    ikinciTakimToDelete = (String) ikinciTakimObject;
                } else {
                    throw new IllegalArgumentException("Değişken tipi hatası oluştu.");
                }

                // Veritabanından ilgili kaydı sil
                String sql = "DELETE FROM proje.efelerLig WHERE ikinciTakim = '" + ikinciTakimToDelete + "'";
                s.executeUpdate(sql);

                // JTable'den satırı kaldır
                ((DefaultTableModel) jTableELTablo.getModel()).removeRow(selectedRow);

                s.close();
                c.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            // SQL hatası durumunda hata mesajını yazdırma
            JOptionPane.showMessageDialog(null, "Veritabanı işlemi sırasında bir hata oluştu.");
        } catch (IllegalArgumentException ex) {
            // IllegalArgumentException hatası durumunda hata mesajını yazdırma
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Sütun hatalı türde veri içeriyor.");
        }

    }//GEN-LAST:event_jButtonELSilActionPerformed

    private void jButtonLig2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLig2ActionPerformed

        try {
            // veriGetir5() metodunu çağırarak tablo modelini elde etme
            DefaultTableModel model5 = veriGetir5();
            // JTable'a oluşturulan tablo modelini ekleme
            jTableLig2.setModel(model5);
        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonLig2ActionPerformed

    private void jButtonLig2EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLig2EkleActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        try {
            //DriverManager.getConnection metodu ile veritabanına bağlanılır.
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
            // lig2 tablosuna veri eklemek için INSERT sorgusu oluşturulur.
//PreparedStatement nesnesi kullanılarak SQL sorgusu hazırlanır.
            String insertQuery = "INSERT INTO lig2 (date, saat, ilkTakim, ilkSkor, ikinciSkor, ikinciTakim) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = c.prepareStatement(insertQuery);
// TextField'lardan girilen verileri alma
            String date = jTextField18.getText();
            String saat = jTextField19.getText();
            String ilkTakim = jTextField20.getText();
            String ilkSkor = jTextField21.getText();
            String ikinciSkor = jTextField22.getText();
            String ikinciTakim = jTextField23.getText();

// TextField'ların boş olup olmadığını kontrol et
            if (date.isEmpty() || saat.isEmpty() || ilkTakim.isEmpty() || ilkSkor.isEmpty() || ikinciSkor.isEmpty() || ikinciTakim.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                return; // İşlemi sonlandır
            }
// SQL sorgusu için parametreleri ayarlama
            st.setString(1, date);
            st.setString(2, saat);
            st.setString(3, ilkTakim);
            st.setString(4, ilkSkor);
            st.setString(5, ikinciSkor);
            st.setString(6, ikinciTakim);
            // SQL sorgusunu çalıştırma
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla eklendi.");
            // Kaynakları kapatma
            st.close();
            c.close();
// TextField'ları temizleme
            jTextField18.setText("");
            jTextField19.setText("");
            jTextField20.setText("");
            jTextField21.setText("");
            jTextField22.setText("");
            jTextField23.setText("");
        } catch (SQLException ex) {
            // SQL hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButtonLig2EkleActionPerformed

    private void jButtonL2SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonL2SilActionPerformed
        try {
            // Kullanıcının seçtiği satırı al
            int selectedRow = jTableLig2.getSelectedRow();
            // Eğer satır seçilmemişse kullanıcıya uyarı mesajı göster
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Lütfen silinecek satırı seçin.");
                return; // İşlemi sonlandır
            } else {
                // DriverManager.getConnection metodu ile veritabanına bağlanılır. createStatement metodu ile bir Statement nesnesi oluşturulur.
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
                Statement s = c.createStatement();
// Seçilen satırdaki veriyi al
                Object ilkTakimObject = jTableLig2.getModel().getValueAt(selectedRow, 2);
                String ilkTakimToDelete;
                if (ilkTakimObject instanceof String) {
                    ilkTakimToDelete = (String) ilkTakimObject;
                } else {
                    throw new IllegalArgumentException("Değişken tipi hatası oluştu.");
                }

                // Veritabanından ilgili kaydı sil
                String sql = "DELETE FROM proje.lig2 WHERE ilkTakim = '" + ilkTakimToDelete + "'";
                int affectedRows = s.executeUpdate(sql);
//Eğer veritabanında kayıt başarıyla silinmişse, JTable'dan da ilgili satır kaldırılır ve kullanıcıya başarı mesajı gösterilir.
                if (affectedRows > 0) {
                    DefaultTableModel model5 = (DefaultTableModel) jTableLig2.getModel();
                    model5.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla silindi.");
                } else {
                    //Eğer silme işlemi başarısız olmuşsa, kullanıcıya hata mesajı gösterilir.
                    JOptionPane.showMessageDialog(null, "Silme işlemi başarısız oldu.", "Hata", JOptionPane.ERROR_MESSAGE);
                }

                s.close();
                c.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // SQL hatası durumunda hata mesajını yazdırma
            JOptionPane.showMessageDialog(null, "Veritabanı işlemi sırasında bir hata oluştu.");
        } catch (IllegalArgumentException ex) {
            // IllegalArgumentException hatası durumunda hata mesajını yazdırma
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sütun hatalı türde veri içeriyor.");
        }
    }//GEN-LAST:event_jButtonL2SilActionPerformed

    private void jButtonPTSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPTSilActionPerformed
        try {
            // Kullanıcının seçtiği satırı al
            int selectedRow = jTablePuanTablosu.getSelectedRow();
            // Eğer satır seçilmemişse kullanıcıya uyarı mesajı göster
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Lütfen silinecek satırı seçin.");
                return; // İşlemi sonlandır
            } else {
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588");
                Statement s = c.createStatement();
                // Seçilen satırdaki veriyi al
                Object takimObject = jTablePuanTablosu.getModel().getValueAt(selectedRow, 0);
                String takimToDelete;
                if (takimObject instanceof String) {
                    takimToDelete = (String) takimObject;
                } else {
                    throw new IllegalArgumentException("Değişken tipi hatası oluştu.");
                }

                // Veritabanından ilgili kaydı sil
                String sql = "DELETE FROM proje.puanTablosu WHERE takim = '" + takimToDelete + "'";
                int affectedRows = s.executeUpdate(sql);

                if (affectedRows > 0) {
                    // JTable'den satırı kaldır
                    DefaultTableModel model3 = (DefaultTableModel) jTablePuanTablosu.getModel();
                    model3.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Seçilen kullanıcı başarıyla silindi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Silme işlemi başarısız oldu.", "Hata", JOptionPane.ERROR_MESSAGE);
                }

                s.close();
                c.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // SQL hatası durumunda hata mesajını yazdırma
            JOptionPane.showMessageDialog(null, "Veritabanı işlemi sırasında bir hata oluştu.");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            // IllegalArgumentException hatası durumunda hata mesajını yazdırma
            JOptionPane.showMessageDialog(null, "Sütun hatalı türde veri içeriyor.");
        }
    }//GEN-LAST:event_jButtonPTSilActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       adminEkran ekran = new adminEkran();
       ekran.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      adminEkran ekran = new adminEkran();
       ekran.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       adminEkran ekran = new adminEkran();
       ekran.setVisible(true);
       dispose();
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
            java.util.logging.Logger.getLogger(adminLigler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLigler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLigler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLigler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLigler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonELEkle;
    private javax.swing.JButton jButtonELGörüntüleme;
    private javax.swing.JButton jButtonELSil;
    private javax.swing.JButton jButtonL2Sil;
    private javax.swing.JButton jButtonLSEkle;
    private javax.swing.JButton jButtonLSSİL;
    private javax.swing.JButton jButtonLig2;
    private javax.swing.JButton jButtonLig2Ekle;
    private javax.swing.JButton jButtonLigSonuclari;
    private javax.swing.JButton jButtonPTEkle;
    private javax.swing.JButton jButtonPTSil;
    private javax.swing.JButton jButtonPuanTablosu;
    private javax.swing.JButton jButtonYKEkle;
    private javax.swing.JButton jButtonYKSil;
    private javax.swing.JButton jButtonYesilKartSayisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableELTablo;
    private javax.swing.JTable jTableLig2;
    private javax.swing.JTable jTablePuanTablosu;
    private javax.swing.JTable jTableSLigSonuclari;
    private javax.swing.JTable jTableYesilKartSayisi;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
