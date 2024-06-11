package NhaHang.View.Form.Staff_Form;

import NhaHang.Controller.Service.ServiceStaff;
import NhaHang.Model.ModelNhanVien;
import NhaHang.Model.ModelNguoiDung;
import NhaHang.View.Dialog.MS_ChangePassword;
import NhaHang.View.Dialog.MS_ConfirmRename;
import NhaHang.View.Main_Frame.Main_Customer_Frame;
import NhaHang.View.Main_Frame.Main_Staff_Frame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AccountS_Form extends javax.swing.JPanel {

    private ModelNguoiDung user;
    private ModelNhanVien staff;
    private ServiceStaff service;
    private Icon hide;
    private Icon show;
    private char def;
private MS_ChangePassword changepass;
    public AccountS_Form() {
        service = new ServiceStaff();
        initComponents();
    }

    public AccountS_Form(ModelNguoiDung user) {
        this.user = user;
        initComponents();
        init();
    }

    public void init() {
        service = new ServiceStaff();
        changepass = new MS_ChangePassword(Main_Staff_Frame.getFrames()[0], true);
        hide = new ImageIcon(getClass().getResource("/Icons/hide.png"));
        show = new ImageIcon(getClass().getResource("/Icons/view.png"));
        def = txtmatkhau.getEchoChar();
        initUser_information();
        initStaff_information();
    }

    public void initUser_information() {
        txtemail.setText(user.getEmail());
        txtmatkhau.setText(user.getPassword());
        txtrole.setText(user.getRole());
        txtmatkhau.setSuffixIcon(hide);
    }

    public void initStaff_information() {
        try {
            staff= service.getStaff(user.getUserID());
            txtmaNV.setText(staff.getId_NV()+"");
            txttenNV.setText(staff.getTenNV());
            txtngVL.setText(staff.getNgayVL());
            txtSDT.setText(staff.getSdt());
            txtCvu.setText(staff.getChucvu());
            txtMaNQL.setText(staff.getId_NQL()+"");
        } catch (SQLException ex) {
            Logger.getLogger(AccountS_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

    private void confirmRename(String message) {
        MS_ConfirmRename obj = new MS_ConfirmRename(Main_Staff_Frame.getFrames()[0], true);
        obj.ConfirmReName(message, staff);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new NhaHang.View.Swing.PanelRound();
        lbmaNV = new javax.swing.JLabel();
        txtngVL = new NhaHang.View.Swing.MyTextField();
        titleKH = new javax.swing.JLabel();
        lbtenNV = new javax.swing.JLabel();
        txttenNV = new NhaHang.View.Swing.MyTextField();
        lbngVL = new javax.swing.JLabel();
        lbCvu = new javax.swing.JLabel();
        txtCvu = new NhaHang.View.Swing.MyTextField();
        lbNQL = new javax.swing.JLabel();
        txtMaNQL = new NhaHang.View.Swing.MyTextField();
        titleND = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbEmail = new javax.swing.JLabel();
        txtemail = new NhaHang.View.Swing.MyTextField();
        lbmk = new javax.swing.JLabel();
        txtmatkhau = new NhaHang.View.Swing.MyPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        cmdDMK = new NhaHang.View.Swing.Button();
        lbRole = new javax.swing.JLabel();
        txtrole = new NhaHang.View.Swing.MyTextField();
        txtSDT = new NhaHang.View.Swing.MyTextField();
        lbSDT = new javax.swing.JLabel();
        txtmaNV = new NhaHang.View.Swing.MyTextField();

        setBackground(new java.awt.Color(222, 222, 222));

        bg.setBackground(new java.awt.Color(247, 247, 247));
        bg.setPreferredSize(new java.awt.Dimension(846, 659));

        lbmaNV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbmaNV.setForeground(new java.awt.Color(89, 89, 89));
        lbmaNV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbmaNV.setText("Mã Nhân Viên");

        txtngVL.setEditable(false);
        txtngVL.setBackground(new java.awt.Color(204, 204, 204));
        txtngVL.setForeground(new java.awt.Color(93, 98, 101));
        txtngVL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtngVL.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        titleKH.setBackground(new java.awt.Color(255, 255, 255));
        titleKH.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        titleKH.setForeground(new java.awt.Color(108, 91, 123));
        titleKH.setText("THÔNG TIN NHÂN VIÊN");

        lbtenNV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbtenNV.setForeground(new java.awt.Color(89, 89, 89));
        lbtenNV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbtenNV.setText("Tên Nhân Viên");

        txttenNV.setBackground(new java.awt.Color(204, 204, 204));
        txttenNV.setForeground(new java.awt.Color(93, 98, 101));
        txttenNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttenNV.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txttenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenNVActionPerformed(evt);
            }
        });

        lbngVL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbngVL.setForeground(new java.awt.Color(89, 89, 89));
        lbngVL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbngVL.setText("Ngày vào làm");

        lbCvu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbCvu.setForeground(new java.awt.Color(89, 89, 89));
        lbCvu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCvu.setText("Chức vụ");

        txtCvu.setEditable(false);
        txtCvu.setBackground(new java.awt.Color(204, 204, 204));
        txtCvu.setForeground(new java.awt.Color(93, 98, 101));
        txtCvu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCvu.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        lbNQL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbNQL.setForeground(new java.awt.Color(89, 89, 89));
        lbNQL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNQL.setText("Mã Người Quản Lý");

        txtMaNQL.setEditable(false);
        txtMaNQL.setBackground(new java.awt.Color(204, 204, 204));
        txtMaNQL.setForeground(new java.awt.Color(93, 98, 101));
        txtMaNQL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaNQL.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        titleND.setBackground(new java.awt.Color(255, 255, 255));
        titleND.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        titleND.setForeground(new java.awt.Color(108, 91, 123));
        titleND.setText("TÀI KHOẢN");

        jSeparator1.setBackground(new java.awt.Color(76, 76, 76));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(89, 89, 89));
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEmail.setText("Email");

        txtemail.setEditable(false);
        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setForeground(new java.awt.Color(93, 98, 101));
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        lbmk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbmk.setForeground(new java.awt.Color(89, 89, 89));
        lbmk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbmk.setText("Mật Khẩu");

        txtmatkhau.setEditable(false);
        txtmatkhau.setBackground(new java.awt.Color(204, 204, 204));
        txtmatkhau.setForeground(new java.awt.Color(93, 98, 101));
        txtmatkhau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmatkhau.setFocusable(false);
        txtmatkhau.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtmatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmatkhauMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(76, 76, 76));

        cmdDMK.setBackground(new java.awt.Color(255, 102, 0));
        cmdDMK.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdDMK.setText("Đổi mật khẩu");
        cmdDMK.setFocusable(false);
        cmdDMK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmdDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDMKActionPerformed(evt);
            }
        });

        lbRole.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbRole.setForeground(new java.awt.Color(89, 89, 89));
        lbRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbRole.setText("Vai trò");

        txtrole.setEditable(false);
        txtrole.setBackground(new java.awt.Color(204, 204, 204));
        txtrole.setForeground(new java.awt.Color(93, 98, 101));
        txtrole.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrole.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        txtSDT.setBackground(new java.awt.Color(204, 204, 204));
        txtSDT.setForeground(new java.awt.Color(93, 98, 101));
        txtSDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSDT.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        lbSDT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(89, 89, 89));
        lbSDT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSDT.setText("Số Điện Thoại");

        txtmaNV.setEditable(false);
        txtmaNV.setBackground(new java.awt.Color(204, 204, 204));
        txtmaNV.setForeground(new java.awt.Color(93, 98, 101));
        txtmaNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmaNV.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbtenNV)
                                                    .addComponent(txtmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbmaNV)
                                                    .addComponent(txttenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCvu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(75, 75, 75)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lbNQL, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtngVL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtMaNQL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbSDT)
                                                    .addComponent(lbngVL)))
                                            .addComponent(lbCvu, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(80, 80, 80))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmdDMK, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleND)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(titleKH))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71)
                                .addComponent(lbmk)))
                        .addContainerGap())))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbngVL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngVL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCvu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNQL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(titleND)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbmk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDMK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void cmdDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDMKActionPerformed
        changepass.ChangePassword(user);
        txtmatkhau.setText(user.getPassword());
    }//GEN-LAST:event_cmdDMKActionPerformed

    private void txtmatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmatkhauMouseClicked
        if (txtmatkhau.getSuffixIcon().equals(hide)) {
            txtmatkhau.setSuffixIcon(show);
            txtmatkhau.setEchoChar((char) 0);

        } else {
            txtmatkhau.setSuffixIcon(hide);
            txtmatkhau.setEchoChar(def);
        }
    }//GEN-LAST:event_txtmatkhauMouseClicked

    private void txttenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenNVActionPerformed
        confirmRename(txttenNV.getText().trim());
    }//GEN-LAST:event_txttenNVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private NhaHang.View.Swing.PanelRound bg;
    private NhaHang.View.Swing.Button cmdDMK;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCvu;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNQL;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbmaNV;
    private javax.swing.JLabel lbmk;
    private javax.swing.JLabel lbngVL;
    private javax.swing.JLabel lbtenNV;
    private javax.swing.JLabel titleKH;
    private javax.swing.JLabel titleND;
    private NhaHang.View.Swing.MyTextField txtCvu;
    private NhaHang.View.Swing.MyTextField txtMaNQL;
    private NhaHang.View.Swing.MyTextField txtSDT;
    private NhaHang.View.Swing.MyTextField txtemail;
    private NhaHang.View.Swing.MyTextField txtmaNV;
    private NhaHang.View.Swing.MyPasswordField txtmatkhau;
    private NhaHang.View.Swing.MyTextField txtngVL;
    private NhaHang.View.Swing.MyTextField txtrole;
    private NhaHang.View.Swing.MyTextField txttenNV;
    // End of variables declaration//GEN-END:variables
}
