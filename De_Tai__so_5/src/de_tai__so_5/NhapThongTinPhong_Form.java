/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phuon
 */
public class NhapThongTinPhong_Form extends javax.swing.JFrame {

    /**
     * Creates new form NhapThongTinPhong_Form
     */
    DefaultTableModel tableModel;
    List<Phong> danhPhong = new ArrayList<>();
    DocGhiFile dc = new DocGhiFile();
    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";
    File f = new File(PATH_FILE_CSV_Phong);
    int id = 0;

    public NhapThongTinPhong_Form() {
        initComponents();
        this.setLocationRelativeTo(null); // center for in the screen
        tableModel = (DefaultTableModel) tblPhong.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTrangThai = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoTang = new javax.swing.JTextField();
        txtGiaPhong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        buttunLuu = new javax.swing.JButton();
        loaiPhong = new javax.swing.JComboBox<>();
        ButunReset6 = new javax.swing.JButton();
        ButunReset = new javax.swing.JButton();
        ButunReset4 = new javax.swing.JButton();
        ButunReset2 = new javax.swing.JButton();
        ButunReset1 = new javax.swing.JButton();
        ButunReset5 = new javax.swing.JButton();

        txtTrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTrangThai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTrangThai.setToolTipText("");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nh???p Th??ng Tin Ph??ng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(42, 62, 80));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("S??? T???ng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lo???i Ph??ng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gi?? Ph??ng:");

        txtSoTang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSoTang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoTang.setToolTipText("");

        txtGiaPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGiaPhong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGiaPhong.setToolTipText("");

        tblPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? Ph??ng", "S??? T???ng ", "Lo???i Ph??ng", "Gi?? Ph??ng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPhong);

        buttunLuu.setBackground(new java.awt.Color(204, 204, 204));
        buttunLuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttunLuu.setIcon(new javax.swing.ImageIcon("D:\\img\\th??m.png")); // NOI18N
        buttunLuu.setText("Th??m Ph??ng");
        buttunLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttunLuuMouseClicked(evt);
            }
        });
        buttunLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttunLuuActionPerformed(evt);
            }
        });

        loaiPhong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        ButunReset6.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset6.setIcon(new javax.swing.ImageIcon("D:\\img\\save.png")); // NOI18N
        ButunReset6.setText("L??u ");
        ButunReset6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButunReset6MouseClicked(evt);
            }
        });
        ButunReset6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunReset6ActionPerformed(evt);
            }
        });

        ButunReset.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset.setIcon(new javax.swing.ImageIcon("D:\\img\\new.png")); // NOI18N
        ButunReset.setText("Reset");
        ButunReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunResetActionPerformed(evt);
            }
        });

        ButunReset4.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset4.setIcon(new javax.swing.ImageIcon("D:\\img\\hienthi.png")); // NOI18N
        ButunReset4.setText("Hi???n th???");
        ButunReset4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButunReset4MouseClicked(evt);
            }
        });
        ButunReset4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunReset4ActionPerformed(evt);
            }
        });

        ButunReset2.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset2.setIcon(new javax.swing.ImageIcon("D:\\img\\chinhSua.png")); // NOI18N
        ButunReset2.setText("Ch???nh s???a");
        ButunReset2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButunReset2MouseClicked(evt);
            }
        });
        ButunReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunReset2ActionPerformed(evt);
            }
        });

        ButunReset1.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset1.setIcon(new javax.swing.ImageIcon("D:\\img\\timkiem1.png")); // NOI18N
        ButunReset1.setText("T??m ki???m");
        ButunReset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButunReset1MouseClicked(evt);
            }
        });
        ButunReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunReset1ActionPerformed(evt);
            }
        });

        ButunReset5.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset5.setIcon(new javax.swing.ImageIcon("D:\\img\\chinhSua.png")); // NOI18N
        ButunReset5.setText("X??a");
        ButunReset5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButunReset5MouseClicked(evt);
            }
        });
        ButunReset5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunReset5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(txtSoTang, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(loaiPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(buttunLuu)
                .addGap(72, 72, 72)
                .addComponent(ButunReset6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(ButunReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButunReset1)
                .addGap(53, 53, 53)
                .addComponent(ButunReset2)
                .addGap(68, 68, 68)
                .addComponent(ButunReset4)
                .addGap(89, 89, 89)
                .addComponent(ButunReset5)
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoTang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttunLuu)
                    .addComponent(ButunReset6)
                    .addComponent(ButunReset)
                    .addComponent(ButunReset4)
                    .addComponent(ButunReset2)
                    .addComponent(ButunReset1)
                    .addComponent(ButunReset5))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttunLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttunLuuActionPerformed
        try {
            if (!f.exists()) {
                id = id++;
            } else {
                List list = dc.docFilePhong();
                id = list.size();
            }
        } catch (CsvValidationException ex) {
            Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        int maPhong = id++;
        int soTang = Integer.parseInt(txtSoTang.getText());
        int sucChua = Integer.parseInt(loaiPhong.getSelectedItem().toString());
        double giaPhong = Double.parseDouble(txtGiaPhong.getText());
        Phong phong = new Phong(maPhong, soTang, sucChua, giaPhong);
        if (!f.exists()) {
            danhPhong.add(phong);
        } else {
            try {
                danhPhong = dc.docFilePhong();
            } catch (CsvValidationException ex) {
                Logger.getLogger(NhapThongTinKhachHangForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            danhPhong.add(phong);

        }

    }//GEN-LAST:event_buttunLuuActionPerformed

    private void buttunLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttunLuuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttunLuuMouseClicked

    private void ButunReset6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButunReset6MouseClicked
        System.out.println("seve");
        if (!f.exists()) {
            dc.ghiFilePhong(danhPhong);

        } else {
            f.delete();
            dc.ghiFilePhong(danhPhong);
        }

    }//GEN-LAST:event_ButunReset6MouseClicked

    private void ButunReset6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunReset6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButunReset6ActionPerformed

    private void ButunResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunResetActionPerformed
        txtSoTang.setText("");
        loaiPhong.setSelectedIndex(0);
        txtGiaPhong.setText("");
    }//GEN-LAST:event_ButunResetActionPerformed

    private void ButunReset4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButunReset4MouseClicked
        try {
            //hi???n th??? th??ng tin
            List<Phong> list = dc.docFilePhong();
            for (Phong item : list) {
                int maPhong = item.getMaPhong();
                int SoTang = item.getSoTang();
                int sucChua = item.getLoaiPhong();
                double giaPhong = item.getGiaPhong();

                tableModel.addRow(new Object[]{maPhong, SoTang, sucChua, giaPhong});

            }

        } catch (CsvValidationException ex) {
            Logger.getLogger(NhapThongTinKhachHangForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ButunReset4MouseClicked

    private void ButunReset4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunReset4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButunReset4ActionPerformed

    private void ButunReset2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButunReset2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ButunReset2MouseClicked

    private void ButunReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunReset2ActionPerformed
        // ch???nh s???a
        ChinhSuaPhongForm.main();
    }//GEN-LAST:event_ButunReset2ActionPerformed

    private void ButunReset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButunReset1MouseClicked
        //        Ph????ng th???c t??m ki???m
        TimKiemPhongForm.main();
    }//GEN-LAST:event_ButunReset1MouseClicked

    private void ButunReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunReset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButunReset1ActionPerformed

    private void ButunReset5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButunReset5MouseClicked
        // TODO add your handling code here:
        XoaPhongForm.main();
    }//GEN-LAST:event_ButunReset5MouseClicked

    private void ButunReset5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunReset5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButunReset5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapThongTinPhong_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButunReset;
    private javax.swing.JButton ButunReset1;
    private javax.swing.JButton ButunReset2;
    private javax.swing.JButton ButunReset4;
    private javax.swing.JButton ButunReset5;
    private javax.swing.JButton ButunReset6;
    private javax.swing.JButton buttunLuu;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> loaiPhong;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JTextField txtSoTang;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
