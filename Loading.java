/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JPanal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayesh
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    
    public Loading() {
        initComponents();
        this.setBounds(300,100,750,510);
        
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        loadingnum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(742, 486));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel3.setText("Welcome to POS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 50, 440, 50);

        ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        getContentPane().add(ProgressBar);
        ProgressBar.setBounds(220, 344, 290, 30);

        loadingnum.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        loadingnum.setText("100");
        getContentPane().add(loadingnum);
        loadingnum.setBounds(330, 310, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPanal/icon/Loading.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Loading load=new Loading();
                load.setVisible(true);
//                for(int i=0;i<=100;i++){
//                    try{
//                        Thread.sleep(50);
//                    }
//                    catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    load.loadingnum.setText(String.valueOf(i));
//                    load.ProgressBar.setValue(i);
//               }
                  
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel loadingnum;
    // End of variables declaration//GEN-END:variables
}
