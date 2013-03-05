
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
        RequestTextArea.requestFocus(); 
        RequestTextArea.setLineWrap(true);
        DBW = new DBWorker();
        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                RequestNameField.setText("Имя");
                RequestsTypeButtonGroup.clearSelection();
                RequestTextArea.setText("");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                RequestNameField.setText("Имя");
                RequestsTypeButtonGroup.clearSelection();
                RequestTextArea.setText("");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                RequestNameField.setText("Имя");
                RequestsTypeButtonGroup.clearSelection();
                RequestTextArea.setText("");
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
                RequestNameField.setText("Имя");
                RequestsTypeButtonGroup.clearSelection();
                RequestTextArea.setText("");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                RequestNameField.setText("Имя");
                RequestsTypeButtonGroup.clearSelection();
                RequestTextArea.setText("");
            }
        });// TODO возможно надо будет переделать, нагружает проц, обновление полей по открытию
    }
    public AddRequestForm(int reqType, String username, String addInfo) {     // Если редактируем заявку   
        this.setModal(true);
        initComponents();
        this.reqType = reqType;
        AddRequestButton.setText("Применить");
        RequestNameField.setText(username);
        RequestTextArea.setText(addInfo);
        this.setFieldsIfEdit();
        java.awt.Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        RequestTextArea.requestFocus(); 
        RequestTextArea.setLineWrap(true);
        DBW = new DBWorker();
        this.setFieldsIfEdit();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RequestsTypeButtonGroup = new javax.swing.ButtonGroup();
        RequestNameField = new javax.swing.JTextField();
        StankiRadioButton = new javax.swing.JRadioButton();
        PiliRadioButton = new javax.swing.JRadioButton();
        ServiceRadioButton = new javax.swing.JRadioButton();
        AddRequestButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        DiscardButton = new javax.swing.JButton();
        RequestTextAreaScrollPane = new javax.swing.JScrollPane();
        RequestTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        RequestNameField.setText("Имя");
        RequestNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RequestNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RequestNameFieldFocusLost(evt);
            }
        });

        RequestsTypeButtonGroup.add(StankiRadioButton);
        StankiRadioButton.setText("Станки");

        RequestsTypeButtonGroup.add(PiliRadioButton);
        PiliRadioButton.setText("Пилы");

        RequestsTypeButtonGroup.add(ServiceRadioButton);
        ServiceRadioButton.setText("Сервис");

        AddRequestButton.setText("Добавить");
        AddRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRequestButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Отмена");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        DiscardButton.setText("Сброс");
        DiscardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscardButtonActionPerformed(evt);
            }
        });

        RequestTextArea.setColumns(20);
        RequestTextArea.setRows(5);
        RequestTextAreaScrollPane.setViewportView(RequestTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RequestTextAreaScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RequestNameField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StankiRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PiliRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ServiceRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DiscardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddRequestButton, CancelButton, DiscardButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RequestNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StankiRadioButton)
                    .addComponent(PiliRadioButton)
                    .addComponent(ServiceRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RequestTextAreaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRequestButton)
                    .addComponent(CancelButton)
                    .addComponent(DiscardButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRequestButtonActionPerformed
        if (DBWorker.id == 0){ // добавляем запрос
            if (StankiRadioButton.isSelected()){ // Если станки
                DBW.setRequest(RequestNameField.getText(), 1, RequestTextArea.getText());
            }
            if (PiliRadioButton.isSelected()){ // Если пилы
                DBW.setRequest(RequestNameField.getText(), 2, RequestTextArea.getText());
            }
            if (ServiceRadioButton.isSelected()){ // Если сервис
                DBW.setRequest(RequestNameField.getText(), 3, RequestTextArea.getText());
            }
        }
        else{ // изменяем запрос
            if (StankiRadioButton.isSelected()){ // Если станки
                DBW.changeRequest(DBWorker.id, RequestNameField.getText(), 1, RequestTextArea.getText());
            }
            if (PiliRadioButton.isSelected()){ // Если пилы
                DBW.changeRequest(DBWorker.id, RequestNameField.getText(), 2, RequestTextArea.getText());
            }
            if (ServiceRadioButton.isSelected()){ // Если сервис
                DBW.changeRequest(DBWorker.id, RequestNameField.getText(), 3, RequestTextArea.getText());
            }
        }
        RequestNameField.setText("Имя");
        RequestsTypeButtonGroup.clearSelection();
        RequestTextArea.setText("");
        DBWorker.id = 0;
        this.dispose();
    }//GEN-LAST:event_AddRequestButtonActionPerformed

    private void RequestNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RequestNameFieldFocusGained
        if (DBWorker.id == 0){
            RequestNameField.setText("");
        }        
    }//GEN-LAST:event_RequestNameFieldFocusGained

    private void RequestNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RequestNameFieldFocusLost
        if (DBWorker.id == 0){
            if(RequestNameField.getText().equals("")){
                RequestNameField.setText("Имя");
            }
        }
    }//GEN-LAST:event_RequestNameFieldFocusLost

    private void DiscardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardButtonActionPerformed
        RequestNameField.setText("Имя");
        RequestsTypeButtonGroup.clearSelection();
        RequestTextArea.setText("");
    }//GEN-LAST:event_DiscardButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        RequestNameField.setText("Имя");
        RequestsTypeButtonGroup.clearSelection();
        RequestTextArea.setText("");
        DBWorker.id = 0;
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed
    
    public final void setFieldsIfEdit(){       
            if (reqType == 1){
                StankiRadioButton.setSelected(true);
            }
            if (reqType == 2){
                PiliRadioButton.setSelected(true);
            }
            if (reqType == 3){
                ServiceRadioButton.setSelected(true);
            }                                     
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRequestButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DiscardButton;
    private javax.swing.JRadioButton PiliRadioButton;
    private javax.swing.JTextField RequestNameField;
    private javax.swing.JTextArea RequestTextArea;
    private javax.swing.JScrollPane RequestTextAreaScrollPane;
    private javax.swing.ButtonGroup RequestsTypeButtonGroup;
    private javax.swing.JRadioButton ServiceRadioButton;
    private javax.swing.JRadioButton StankiRadioButton;
    // End of variables declaration//GEN-END:variables
}
