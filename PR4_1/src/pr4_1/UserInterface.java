/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

/**
 *
 * @author rsexton17
 */
public class UserInterface extends javax.swing.JFrame {
    //PT -- I don't see where you read from the file. -10
    RestaurantReviewer r = new RestaurantReviewer();
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

        txtTextArea = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        lblRestaurantName = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        lblRestaurantAddress = new javax.swing.JLabel();
        txtRestaurantAddress = new javax.swing.JTextField();
        AddNotes = new javax.swing.JButton();
        lblRating = new javax.swing.JLabel();
        txtRating = new javax.swing.JTextField();
        addName = new javax.swing.JButton();
        addAddress = new javax.swing.JButton();
        addRating = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        txtTextArea.setViewportView(txtNotes);

        lblRestaurantName.setText("Restaurant Name");

        txtRestaurantName.setText("Enter Name");

        lblRestaurantAddress.setText("Restaurant Address");

        txtRestaurantAddress.setText("Enter Address");

        AddNotes.setText("Add Notes");
        AddNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNotesActionPerformed(evt);
            }
        });

        lblRating.setText("jLabel1");

        txtRating.setText("Rating from 1 to 5");

        addName.setText("Add Name");
        addName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNameActionPerformed(evt);
            }
        });

        addAddress.setText("Add Address");
        addAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAddressActionPerformed(evt);
            }
        });

        addRating.setText("Add Rating");
        addRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRestaurantName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addName))
                            .addComponent(lblRestaurantAddress)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addAddress))
                            .addComponent(lblRating)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addRating))))
                    .addComponent(AddNotes))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRestaurantName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRestaurantAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRating)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addRating))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNotes)
                .addGap(0, 130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNameActionPerformed
        r.setName(txtRestaurantName.getText());
        r.writeToFile(r.getName());
    }//GEN-LAST:event_addNameActionPerformed

    private void addAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAddressActionPerformed
        r.setAddress(txtRestaurantAddress.getText());
        r.writeToFile(r.getAddress());
    }//GEN-LAST:event_addAddressActionPerformed

    private void addRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRatingActionPerformed
        r.setRating(Integer.parseInt(txtRating.getText()));
        r.writeToFile(String.format("%d", r.getRating()));
    }//GEN-LAST:event_addRatingActionPerformed

    private void AddNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNotesActionPerformed
        r.setNotes(txtNotes.getText());
        r.writeToFile(r.getNotes());
    }//GEN-LAST:event_AddNotesActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNotes;
    private javax.swing.JButton addAddress;
    private javax.swing.JButton addName;
    private javax.swing.JButton addRating;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblRestaurantAddress;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JScrollPane txtTextArea;
    // End of variables declaration//GEN-END:variables
}
