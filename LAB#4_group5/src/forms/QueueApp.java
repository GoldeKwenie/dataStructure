/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class QueueApp extends javax.swing.JFrame {
    private final int size = 5;
    private linearQueue lq;
    private circularQueue cq;
    public QueueApp() {
        initComponents();
        lq = new linearQueue(size);
        cq = new circularQueue(size);
        setUpdateTables();
    }

    private void setUpdateTables(){
        DefaultTableModel Lineartable = new DefaultTableModel(1, size);
        lineartable.setModel(Lineartable);
        lineartable.setTableHeader(null);
        
       DefaultTableModel Circulartable = new DefaultTableModel(1, size);
        circulartable.setModel(Circulartable);
        circulartable.setTableHeader(null);
    }
    
        private void updateLinearTable() {
            DefaultTableModel model = (DefaultTableModel) lineartable.getModel();
            for (int col = 0; col < size; col++) model.setValueAt("", 0, col);
            int[] data = lq.getContents();
            for (int i = 0; i < data.length; i++) model.setValueAt(data[i], 0, i);
        } 
            
            private void updateCircularTable() {
            DefaultTableModel model = (DefaultTableModel) circulartable.getModel();
            for (int col = 0; col < size; col++) model.setValueAt("", 0, col);
            int[] data = cq.getContents();
            for (int i = 0; i < data.length; i++) model.setValueAt(data[i], 0, i);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Value = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        type = new javax.swing.JLabel();
        jtype = new javax.swing.JComboBox<>();
        enqueue = new javax.swing.JButton();
        dequeue = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        circulartable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineartable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Value.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Value.setForeground(new java.awt.Color(0, 0, 0));
        Value.setText("Value:");

        txtValue.setBackground(new java.awt.Color(255, 204, 204));
        txtValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValue.setForeground(new java.awt.Color(0, 0, 0));

        type.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 0));
        type.setText("Queue Type:");

        jtype.setBackground(new java.awt.Color(255, 204, 153));
        jtype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtype.setForeground(new java.awt.Color(0, 0, 0));
        jtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linear Queue", "Circular Queue" }));

        enqueue.setBackground(new java.awt.Color(153, 255, 255));
        enqueue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enqueue.setForeground(new java.awt.Color(0, 0, 0));
        enqueue.setText("Enqueue");
        enqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enqueueActionPerformed(evt);
            }
        });

        dequeue.setBackground(new java.awt.Color(255, 204, 102));
        dequeue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dequeue.setForeground(new java.awt.Color(0, 0, 0));
        dequeue.setText("Dequeue");
        dequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequeueActionPerformed(evt);
            }
        });

        circulartable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(circulartable);

        lineartable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(lineartable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Value)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(enqueue)
                        .addGap(70, 70, 70)
                        .addComponent(dequeue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Value)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type)
                    .addComponent(jtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enqueue)
                    .addComponent(dequeue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enqueueActionPerformed
        try {
            int value = Integer.parseInt(txtValue.getText());
            if (jtype.getSelectedItem().equals("Linear Queue")) {
                if (!lq.enqueue(value)) {
                    JOptionPane.showMessageDialog(this, "Linear Queue Overflow!!!");
                }
                updateLinearTable();
            } else {
                if (!cq.enqueue(value)) {
                    JOptionPane.showMessageDialog(this, "Circular Queue Overfloe!!!");
                }
                updateCircularTable();
            }
            txtValue.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a valid number.");
        }
    }//GEN-LAST:event_enqueueActionPerformed

    private void dequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequeueActionPerformed
       Integer result;
       if (jtype.getSelectedItem().equals("Linear Queue")) {
           result = lq.dequeue();
           if (result == null) JOptionPane.showMessageDialog(this, "Linear Queue Underflow!!!");
           else JOptionPane.showMessageDialog(this, "Dequeued: " + result);
       } else {
           result = cq.dequeue();
           if (result == null) JOptionPane.showMessageDialog(this, "Circular Queue Underflow!!!");
           else JOptionPane.showMessageDialog(this, "Dequeued: " + result);
       }
       updateLinearTable();
       updateCircularTable();
    }//GEN-LAST:event_dequeueActionPerformed

    
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
            java.util.logging.Logger.getLogger(QueueApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueueApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueueApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueueApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueueApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Value;
    private javax.swing.JTable circulartable;
    private javax.swing.JButton dequeue;
    private javax.swing.JButton enqueue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jtype;
    private javax.swing.JTable lineartable;
    private javax.swing.JTextField txtValue;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
