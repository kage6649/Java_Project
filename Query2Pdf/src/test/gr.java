/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.io.File;
import javax.swing.JFileChooser;
import test.grSup;


/**
 *
 * @author eater48
 */
public class gr extends javax.swing.JFrame {

    /**
     * Creates new form gr
     */
    public gr() {
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

        sv = new javax.swing.JButton();
        err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sv.setText("Save As");
        sv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svActionPerformed(evt);
            }
        });
        getContentPane().add(sv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));
        getContentPane().add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void svActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svActionPerformed
        // TODO add your handling code here:
        grSup gs = new grSup();
//        try {
//            //make a file chooser
//            JFileChooser fc = new JFileChooser();
//            fc.showSaveDialog(null);
//            //get the dir
//            File f = fc.getCurrentDirectory();
//            //get and split name if equal .pdf in the name
//             String sp = fc.getSelectedFile().getName();
//            String[] ary = sp.split(".pdf",2);
//            //make a dir and file name
//            String file = f.getAbsolutePath()+"/"+ary[0]+".pdf";
//            //func for print file
//            gs.print(file);
//            err.setText("Data Berhasil Dicetak");
//        } catch (Exception e) {
//            err.setText("Data Gagal Dicetak");
//        }
        try {
            //make a file chooser
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(null);
            //get the dir
            File f = fc.getCurrentDirectory();
            //get and split name if equal .pdf in the name
             String sp = fc.getSelectedFile().getName();
            String[] ary = sp.split(".pdf",2);
            //make a dir and file name
            String file = f.getAbsolutePath()+"/"+ary[0]+".pdf";
            //func for print file
            gs.print(file);
            err.setText("Data Berhasil Dicetak");
        } catch (Exception e) {
            err.setText("Data Gagal Dicetak");
        }
    }//GEN-LAST:event_svActionPerformed

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
            java.util.logging.Logger.getLogger(gr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel err;
    private javax.swing.JButton sv;
    // End of variables declaration//GEN-END:variables
}