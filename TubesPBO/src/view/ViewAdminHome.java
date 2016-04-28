/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import tubespbo.Kelas;
/**
 *
 * @author tinodau
 */
public class ViewAdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public ViewAdminHome() {
        initComponents();
        setTitle("Panel Admin");
        setLocationRelativeTo(null);
        setHeader();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        btnKeluar = new javax.swing.JButton();
        labelAdmin = new javax.swing.JLabel();
        btnHapusKelas = new javax.swing.JButton();
        btnTambahMK = new javax.swing.JButton();
        btnTambahKelas = new javax.swing.JButton();
        btnTambahMKKelas = new javax.swing.JButton();
        btnTambahDosenKelas = new javax.swing.JButton();
        btnHapusDosenKelas = new javax.swing.JButton();
        textNip = new javax.swing.JTextField();
        labelNip = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        labelDaftarKelas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelDaftarKelas = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKeluar.setText("Exit");

        labelAdmin.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        labelAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdmin.setText("ADMIN");

        btnHapusKelas.setText("Hapus Kelas");
        btnHapusKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKelasActionPerformed(evt);
            }
        });

        btnTambahMK.setText("Tambah Mata Kuliah");

        btnTambahKelas.setText("Tambah Kelas");

        btnTambahMKKelas.setText("Tambah Mata Kuliah Kelas");

        btnTambahDosenKelas.setText("Tambah Dosen Kelas");
        btnTambahDosenKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDosenKelasActionPerformed(evt);
            }
        });

        btnHapusDosenKelas.setText("Hapus  Dosen Kelas");
        btnHapusDosenKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDosenKelasActionPerformed(evt);
            }
        });

        textNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNipActionPerformed(evt);
            }
        });

        labelNip.setText("NIP");

        labelNama.setText("Nama");

        textNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaActionPerformed(evt);
            }
        });

        labelDaftarKelas.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        labelDaftarKelas.setText("Daftar Kelas");

        tabelDaftarKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelDaftarKelas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnTambahMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTambahMKKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHapusDosenKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTambahDosenKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnHapusKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNama)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textNip, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnTambahKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDaftarKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDaftarKelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambahKelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusKelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambahMK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambahMKKelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambahDosenKelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusDosenKelas)
                        .addGap(40, 40, 40)
                        .addComponent(btnKeluar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusKelasActionPerformed

    private void btnTambahDosenKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDosenKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahDosenKelasActionPerformed

    private void btnHapusDosenKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDosenKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusDosenKelasActionPerformed

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaActionPerformed

    private void textNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNipActionPerformed

        public JButton getBtnHapusDosenKelas() {
        return btnHapusDosenKelas;
    }
        
    public JButton getBtnHapusKelas() {
        return btnHapusKelas;
    }
    
    public JButton getBtnTambahMKKelas() {
        return btnTambahMKKelas;
    }
    
    public JButton getBtnTambahDosenKelas() {
        return btnTambahDosenKelas;
    }
    
    public JButton getBtnTambahKelas() {
        return btnTambahKelas;
    }
    
    public JButton getBtnTambahMK() {
        return btnTambahMK;
    }
    
    public Object getBtnKeluar(){
        return btnKeluar;
    }
    
    
    
    public void addListener(ActionListener a) {
        btnHapusDosenKelas.addActionListener(a);
        btnHapusKelas.addActionListener(a);
        btnKeluar.addActionListener(a);
        btnTambahDosenKelas.addActionListener(a);
        btnTambahKelas.addActionListener(a);
        btnTambahMK.addActionListener(a);
        btnTambahMKKelas.addActionListener(a);
    }
    
    public void setHeader() {
        String[] header = {"No","Kelas","Matakuliah","Dosen"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        tabelDaftarKelas.setModel(model);
    }
    
    public void setTextNip(String Nip) {
        textNip.setText(Nip);
    }
    
    public void setTextNama(String Nama) {
        textNama.setText(Nama);
    }
    
    public void inputData(ArrayList<Kelas> daftarKelas) {
        DefaultTableModel tabelModel = (DefaultTableModel) tabelDaftarKelas.getModel();
        for (int i = 0; i < daftarKelas.size(); i++) {
            if(daftarKelas.get(i).getMK()!=null) {
                if(daftarKelas.get(i).getDosen()!=null) {
                    tabelModel.addRow(
                        new String[] {
                            (i+1)+"",
                            daftarKelas.get(i).getKelasnya(),    
                            daftarKelas.get(i).getMK().getMKnya(),
                            daftarKelas.get(i).getDosen().getNama()
                        }
                    );
                } 
                else {
                    tabelModel.addRow(
                        new String[] {
                            (i+1)+"",
                            daftarKelas.get(i).getKelasnya(),
                            daftarKelas.get(i).getMK().getMKnya(),
                            ""
                        }
                    );
                }
            } 
            
            else if(daftarKelas.get(i).getDosen()!=null) {
                tabelModel.addRow(
                    new String[] {
                        (i+1)+"",
                        daftarKelas.get(i).getKelasnya(),
                        "",
                        daftarKelas.get(i).getDosen().getNama()
                    }
                );
            } 
            
            else {
                tabelModel.addRow(
                    new String[] {(i+1)+"",
                        daftarKelas.get(i).getKelasnya(),
                    "",
                    ""
                    }
                );
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusDosenKelas;
    private javax.swing.JButton btnHapusKelas;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambahDosenKelas;
    private javax.swing.JButton btnTambahKelas;
    private javax.swing.JButton btnTambahMK;
    private javax.swing.JButton btnTambahMKKelas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelDaftarKelas;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNip;
    private javax.swing.JTable tabelDaftarKelas;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNip;
    // End of variables declaration//GEN-END:variables
}
