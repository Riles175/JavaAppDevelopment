/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_6;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
/**
 *
 * @author rsexton17
 */
public class HomeworkInterface extends javax.swing.JFrame {
    
    HomeworkTracker ht = new HomeworkTracker();
    /**
     * Creates new form HomeworkInterface
     */
    public HomeworkInterface() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        HomeworkList = new javax.swing.JList();
        lblHomeworkScores = new javax.swing.JLabel();
        HomeworkMax = new javax.swing.JLabel();
        HomeworkMin = new javax.swing.JLabel();
        HomeworkAverage = new javax.swing.JLabel();
        txtScores = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomeworkList.setModel(new DefaultListModel<Integer>() {
            public int getSize() { return ht.getScores().size(); }

            public Integer getElementAt(int i) { return ht.getScore(i); }

            public void addElement(int i) {super.addElement(i); ht.getScores().add(i); }

            public void add(int i, int j) { super.add(i, j); ht.getScores().add(i,j); }
        });
        HomeworkList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                HomeworkListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(HomeworkList);

        lblHomeworkScores.setText("Homework Scores");

        HomeworkMax.setText("Max");

        HomeworkMin.setText("Min");

        HomeworkAverage.setText("Average");

        txtScores.setText("UserInput");
        txtScores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtScoresKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblHomeworkScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeworkMax)
                    .addComponent(HomeworkMin)
                    .addComponent(HomeworkAverage))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomeworkScores)
                    .addComponent(txtScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HomeworkMax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeworkMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeworkAverage)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtScoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtScoresKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            ((DefaultListModel)HomeworkList.getModel()).addElement(Integer.parseInt(txtScores.getText()));
            
        String fMax = String.format("%d", (int)ht.Max(ht.getScores()));
        HomeworkMax.setText(fMax);
        String fMin = String.format("%d", (int)ht.Min(ht.getScores()));
        HomeworkMin.setText(fMin);
        String fAverage = String.format("%f", (double)ht.Average(ht.getScores()));
        HomeworkAverage.setText(fAverage);
        }
            
    }//GEN-LAST:event_txtScoresKeyPressed

    private void HomeworkListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_HomeworkListValueChanged
    
        String fMax = String.format("%d", (int)ht.Max(ht.getScores()));
        HomeworkMax.setText(fMax);
        String fMin = String.format("%d", (int)ht.Min(ht.getScores()));
        HomeworkMin.setText(fMin);
        String fAverage = String.format("%f", (double)ht.Average(ht.getScores()));
        HomeworkAverage.setText(fAverage);
        
        
    }//GEN-LAST:event_HomeworkListValueChanged

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
            java.util.logging.Logger.getLogger(HomeworkInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeworkInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeworkInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeworkInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeworkInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeworkAverage;
    private javax.swing.JList HomeworkList;
    private javax.swing.JLabel HomeworkMax;
    private javax.swing.JLabel HomeworkMin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHomeworkScores;
    private javax.swing.JTextField txtScores;
    // End of variables declaration//GEN-END:variables
}
