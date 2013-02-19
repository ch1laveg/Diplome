
package requestreciever;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JScrollPane;


public class AddRequestForm extends javax.swing.JDialog {
    DBWorker DBW;
    int reqType;
    public AddRequestForm() {        // Если новая заявка
        this.setModal(true);
        initComponents();
        java.awt.Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        jTextArea1.requestFocus(); 
        jTextArea1.setLineWrap(true);
        DBW = new DBWorker();
        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                jTextField1.setText("Имя");
                buttonGroup1.clearSelection();
                jTextArea1.setText("");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                jTextField1.setText("Имя");
                buttonGroup1.clearSelection();
                jTextArea1.setText("");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                jTextField1.setText("Имя");
                buttonGroup1.clearSelection();
                jTextArea1.setText("");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                jTextField1.setText("Имя");
                buttonGroup1.clearSelection();
                jTextArea1.setText("");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                jTextField1.setText("Имя");
                buttonGroup1.clearSelection();
                jTextArea1.setText("");
            }
        });// TODO возможно надо будет переделать, нагружает проц, обновление полей по открытию
    }
    public AddRequestForm(int reqType, String username, String addInfo) {     // Если редактируем заявку   
        this.setModal(true);
        initComponents();
        this.reqType = reqType;
        jButton1.setText("Применить");
        jTextField1.setText(username);
        jTextArea1.setText(addInfo);
        this.setFieldsIfEdit();
        java.awt.Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        jTextArea1.requestFocus(); 
        jTextArea1.setLineWrap(true);
        DBW = new DBWorker();
        this.setFieldsIfEdit();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jTextField1.setText("Имя");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Станки");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Пилы");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Сервис");

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Отмена");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Сброс");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (DBWorker.id == 0){
            if (jRadioButton1.isSelected()){ // Если станки
                DBW.setRequest(jTextField1.getText(), 1, jTextArea1.getText());
            }
            if (jRadioButton3.isSelected()){ // Если пилы
                DBW.setRequest(jTextField1.getText(), 2, jTextArea1.getText());
            }
            if (jRadioButton4.isSelected()){ // Если сервис
                DBW.setRequest(jTextField1.getText(), 3, jTextArea1.getText());
            }
        }
        else{
            if (jRadioButton1.isSelected()){ // Если станки
                DBW.changeRequest(DBWorker.id, jTextField1.getText(), 1, jTextArea1.getText());
            }
            if (jRadioButton3.isSelected()){ // Если пилы
                DBW.changeRequest(DBWorker.id, jTextField1.getText(), 2, jTextArea1.getText());
            }
            if (jRadioButton4.isSelected()){ // Если сервис
                DBW.changeRequest(DBWorker.id, jTextField1.getText(), 3, jTextArea1.getText());
            }
        }
        jTextField1.setText("Имя");
        buttonGroup1.clearSelection();
        jTextArea1.setText("");
        DBWorker.id = 0;
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (DBWorker.id == 0){
            jTextField1.setText("");
        }        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (DBWorker.id == 0){
            if(jTextField1.getText().equals("")){
                jTextField1.setText("Имя");
            }
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("Имя");
        buttonGroup1.clearSelection();
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("Имя");
        buttonGroup1.clearSelection();
        jTextArea1.setText("");
        DBWorker.id = 0;
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public final void setFieldsIfEdit(){       
            if (reqType == 1){
                jRadioButton1.setSelected(true);
            }
            if (reqType == 2){
                jRadioButton3.setSelected(true);
            }
            if (reqType == 3){
                jRadioButton4.setSelected(true);
            }                                     
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
