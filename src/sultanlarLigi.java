
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rahimecalik
 */
public class sultanlarLigi extends javax.swing.JFrame {

    /**
     * Creates new form sultanlarLigi
     */
    public sultanlarLigi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSlig = new javax.swing.JTable();
        jButtonGeri = new javax.swing.JButton();
        jButtonSlig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableYesilKart = new javax.swing.JTable();
        jButtonYesilKart = new javax.swing.JButton();
        jButtonYKGeri = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePuan = new javax.swing.JTable();
        jButtonPuan = new javax.swing.JButton();
        jButtonPuanGeri = new javax.swing.JButton();

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableSlig.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableSlig);

        jButtonGeri.setText("Geri");
        jButtonGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeriActionPerformed(evt);
            }
        });

        jButtonSlig.setText("Ligleri görüntüle");
        jButtonSlig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSligActionPerformed(evt);
            }
        });

        jLabel1.setText("VODAFONE SULTANLAR LIGI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonGeri)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonSlig))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGeri)
                    .addComponent(jButtonSlig))
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Fikstür", jPanel1);

        jTableYesilKart.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableYesilKart);

        jButtonYesilKart.setText("Tabloyu Görüntüle");
        jButtonYesilKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYesilKartActionPerformed(evt);
            }
        });

        jButtonYKGeri.setText("Geri");
        jButtonYKGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYKGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButtonYesilKart)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonYKGeri)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonYesilKart)
                    .addComponent(jButtonYKGeri))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Yeşil Kart Tablosu", jPanel3);

        jTablePuan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablePuan);

        jButtonPuan.setText("Puan Durumunu Görüntüle");
        jButtonPuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuanActionPerformed(evt);
            }
        });

        jButtonPuanGeri.setText("Geri");
        jButtonPuanGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuanGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButtonPuan)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonPuanGeri)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPuan)
                    .addComponent(jButtonPuanGeri))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Puan Tablosu", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeriActionPerformed
        // Üye ekranına geri dönme
        uyeEkran ekran = new uyeEkran();
        dispose();
        ekran.setVisible(true);
    }//GEN-LAST:event_jButtonGeriActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonSligActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSligActionPerformed
        // Sultanlar Ligi bilgilerini görüntüleme
         try {
             // Veritabanına bağlantı kurulması
            Connection c =DriverManager.getConnection("jdbc:mysql://127.0.01:3306/proje","root","Rahime4588");
            Statement s = c.createStatement();
            // Sultanlar Ligi bilgilerini sorgulama
            ResultSet resultSet = s.executeQuery("SELECT * FROM proje.sultanLigi");
          
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int sütunSayısı= metaData.getColumnCount();
            // Tablo modelini oluşturma ve sütun isimlerini ekleme
            DefaultTableModel model = new DefaultTableModel();
             for (int i = 1; i <= sütunSayısı; i++) {
                 model.addColumn(metaData.getColumnName(i));
                 
             }
             // Veritabanı sonuçlarını tabloya ekleme
            while (resultSet.next()){
                Object[]row = new Object[sütunSayısı];
                for (int i = 1; i <= sütunSayısı; i++) {
                    row [i-1]=resultSet.getObject(i);
                }
                model.addRow(row);
            }
          // JTable'a model ekleme          
          jTableSlig.setModel(model);
          // Kaynakları kapatma
          resultSet.close();
          s.close();
          c.close();
        }
        catch (SQLException ex) {
           ex.printStackTrace();
        }
    
        
    }//GEN-LAST:event_jButtonSligActionPerformed

    private void jButtonYesilKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYesilKartActionPerformed
        // Yeşil Kart Sayısı bilgilerini görüntüleme
        try {
            // Veritabanına bağlantı kurulması
            Connection c =DriverManager.getConnection("jdbc:mysql://127.0.01:3306/proje","root","Rahime4588");
            Statement s = c.createStatement();
            ResultSet resultSet = s.executeQuery("SELECT * FROM proje.yesilKartSayisi");
          
            // Yeşil Kart Sayısı bilgilerini sorgulama
            ResultSetMetaData metaData = resultSet.getMetaData();
            int sütunSayısı= metaData.getColumnCount();
            // Tablo modelini oluşturma ve sütun isimlerini ekleme
            DefaultTableModel model = new DefaultTableModel();
             for (int i = 1; i <= sütunSayısı; i++) {
                 model.addColumn(metaData.getColumnName(i));
                 
             }
             // Veritabanı sonuçlarını tabloya ekleme
            while (resultSet.next()){
                Object[]row = new Object[sütunSayısı];
                for (int i = 1; i <= sütunSayısı; i++) {
                    row [i-1]=resultSet.getObject(i);
                }
                model.addRow(row);
            }
          // JTable'a model ekleme         
          jTableYesilKart.setModel(model);
          // Kaynakları kapatma
          resultSet.close();
          s.close();
          c.close();
        }
        catch (SQLException ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonYesilKartActionPerformed

    private void jButtonPuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuanActionPerformed
 // Puan Tablosu bilgilerini görüntüleme
        try {
            // Veritabanına bağlantı kurulması
            Connection c =DriverManager.getConnection("jdbc:mysql://127.0.01:3306/proje","root","Rahime4588");
            Statement s = c.createStatement();
             // Puan Tablosu bilgilerini sorgulama
            ResultSet resultSet = s.executeQuery("SELECT * FROM proje.puanTablosu");
          
            // ResultSetMetaData nesnesi oluşturma, 'ResultSetMetaData' SQL sorgusunun sonuç kümesini işlerken, sütun adlarını, sütun türlerini ve diğer sütun özelliklerini öğrenmek için kullanılır.
            ResultSetMetaData metaData = resultSet.getMetaData();
            // Sütun sayısını elde etme
            int sütunSayısı= metaData.getColumnCount();
            // Tablo modelini oluşturma ve sütun isimlerini ekleme
            DefaultTableModel model = new DefaultTableModel();
            // Sütun bilgilerini yazdırma
             for (int i = 1; i <= sütunSayısı; i++) {
                 model.addColumn(metaData.getColumnName(i));
                 
             }
             // Veritabanı sonuçlarını tabloya ekleme
            while (resultSet.next()){
                Object[]row = new Object[sütunSayısı];
                for (int i = 1; i <= sütunSayısı; i++) {
                    row [i-1]=resultSet.getObject(i);
                }
                model.addRow(row);
            }
          // JTable'a model ekleme          
          jTablePuan.setModel(model);
          // Kaynakları kapatma
          resultSet.close();
          s.close();
          c.close();
        }
        catch (SQLException ex) {
           ex.printStackTrace();
        }       
    }//GEN-LAST:event_jButtonPuanActionPerformed

    private void jButtonYKGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYKGeriActionPerformed
        // Üye ekranına geri dönme
        uyeEkran ekran = new uyeEkran();
        dispose();
        ekran.setVisible(true);
    }//GEN-LAST:event_jButtonYKGeriActionPerformed

    private void jButtonPuanGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuanGeriActionPerformed
  // Üye ekranına geri dönme
        uyeEkran ekran = new uyeEkran();
        dispose();
        ekran.setVisible(true);    }//GEN-LAST:event_jButtonPuanGeriActionPerformed

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
            java.util.logging.Logger.getLogger(sultanlarLigi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sultanlarLigi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sultanlarLigi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sultanlarLigi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sultanlarLigi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGeri;
    private javax.swing.JButton jButtonPuan;
    private javax.swing.JButton jButtonPuanGeri;
    private javax.swing.JButton jButtonSlig;
    private javax.swing.JButton jButtonYKGeri;
    private javax.swing.JButton jButtonYesilKart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePuan;
    private javax.swing.JTable jTableSlig;
    private javax.swing.JTable jTableYesilKart;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
