/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midterm;

/**
 *
 * @author rsexton17
 */
public class UserInterface extends javax.swing.JFrame {
    Users u = new Users();
    UnderOverGame uog = new UnderOverGame();
    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
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

        txtUserName = new javax.swing.JTextField();
        lblCash = new javax.swing.JLabel();
        lblBet = new javax.swing.JLabel();
        txtBetAmount = new javax.swing.JTextField();
        lblResponse = new javax.swing.JLabel();
        userNameActivate = new javax.swing.JButton();
        betActivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUserName.setText("Enter User Name");

        lblCash.setText("Cash");

        lblBet.setText("Bet");

        txtBetAmount.setText("Bet Amount");

        lblResponse.setText("...");

        userNameActivate.setText("OK");
        userNameActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActivateActionPerformed(evt);
            }
        });

        betActivate.setText("OK");
        betActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betActivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResponse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCash))
                            .addComponent(userNameActivate))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(betActivate)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCash)
                    .addComponent(lblBet)
                    .addComponent(txtBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameActivate)
                    .addComponent(betActivate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //Due to a complete failure of file IO I've made the program do what
        //it's supposed to to the best of my abilities, it kind of does what it's 
        //supposed to
    private void userNameActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActivateActionPerformed
        String userName = (txtUserName.getText());
        u.setUserName(userName);
        u.setCash();
        String f = String.format("$ %d", u.getCash());
        lblCash.setText(f);
    }//GEN-LAST:event_userNameActivateActionPerformed

    private void betActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betActivateActionPerformed
        u.getCash();
        int b = Integer.parseInt(txtBetAmount.getText());
        String f = u.bet(b);
        lblResponse.setText(f);
        if (f.contains("Con")) {
            u.addCash(b);
            lblCash.setText(String.format("$ %d", u.getCash()));
        }
        if (f.contains("Sor")) {
            u.subtractCash(b);
            lblCash.setText(String.format("$ %d", u.getCash()));
        }
    }//GEN-LAST:event_betActivateActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton betActivate;
    private javax.swing.JLabel lblBet;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblResponse;
    private javax.swing.JTextField txtBetAmount;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JButton userNameActivate;
    // End of variables declaration//GEN-END:variables
}
