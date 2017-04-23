package readingcomp2;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author grant
 */
public class MapFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form mapFrame
     */
    public MapFrame() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        room1Btn = new javax.swing.JButton();
        room2Btn = new javax.swing.JButton();
        room3Btn = new javax.swing.JButton();
        room4Btn = new javax.swing.JButton();
        room5Btn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to Your Voyage");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 40, 441, 47);

        jLabel2.setText("Pick a room to explore!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 100, 131, 16);

        room1Btn.setText("room1");
        room1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room1BtnActionPerformed(evt);
            }
        });
        getContentPane().add(room1Btn);
        room1Btn.setBounds(110, 310, 67, 32);

        room2Btn.setText("room2");
        room2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room2BtnActionPerformed(evt);
            }
        });
        getContentPane().add(room2Btn);
        room2Btn.setBounds(260, 350, 67, 32);

        room3Btn.setText("room3");
        room3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room3BtnActionPerformed(evt);
            }
        });
        getContentPane().add(room3Btn);
        room3Btn.setBounds(430, 310, 67, 32);

        room4Btn.setText("room4");
        room4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room4BtnActionPerformed(evt);
            }
        });
        getContentPane().add(room4Btn);
        room4Btn.setBounds(620, 270, 67, 32);

        room5Btn.setText("room5");
        room5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room5BtnActionPerformed(evt);
            }
        });
        getContentPane().add(room5Btn);
        room5Btn.setBounds(800, 310, 67, 32);

        jProgressBar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jProgressBar1PropertyChange(evt);
            }
        });
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(10, 520, 990, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Dropbox\\MP5\\ReadingComp2\\ReadingComp2\\images\\sideview.png")); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ObjectProperty.create(), jLabel3, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 124, 1014, 306);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void room1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room1BtnActionPerformed
        RoomFrame room1 = new RoomFrame(this);
        room1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_room1BtnActionPerformed
    
    private void room2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room2BtnActionPerformed
        RoomFrame room2 = new RoomFrame(this);
        room2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_room2BtnActionPerformed
    
    private void room3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room3BtnActionPerformed
        RoomFrame room3 = new RoomFrame(this);
        room3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_room3BtnActionPerformed
    
    private void room4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room4BtnActionPerformed
        RoomFrame room4 = new RoomFrame(this);
        room4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_room4BtnActionPerformed

    private void room5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room5BtnActionPerformed
        RoomFrame room5 = new RoomFrame(this);
        room5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_room5BtnActionPerformed

    private void jProgressBar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jProgressBar1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jProgressBar1PropertyChange
    
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
            java.util.logging.Logger.getLogger(MapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton room1Btn;
    private javax.swing.JButton room2Btn;
    private javax.swing.JButton room3Btn;
    private javax.swing.JButton room4Btn;
    private javax.swing.JButton room5Btn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
