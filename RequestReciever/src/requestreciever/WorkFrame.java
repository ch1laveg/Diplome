
package requestreciever;

import javax.swing.DefaultListModel;


public class WorkFrame extends javax.swing.JFrame {
    AddRequestForm ARF;
    DefaultListModel namesList;
    DBWorker DBW;
    AdminFrame AF;
    int rule;
    public WorkFrame(int rule) {
        this.rule = rule;
        initComponents();           
        this.setTitle("Текущие заявки");        
        RequestTextField.setLineWrap(true);
        RequestTextField.setEditable(false);
        java.awt.Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2); 
    }
    public void listRefresher(){
        namesList = new DefaultListModel();
        namesList.clear();        
        for (int i = 0; i < DBWorker.listNames.size(); i++){
            if (Integer.parseInt(DBWorker.reqTypeList.get(DBWorker.listNames.get(i))) == rule){
                namesList.addElement(DBWorker.listNames.get(i));
            }
            else if (rule == 0){
                namesList.addElement(DBWorker.listNames.get(i));
            }
        }
        DBWorker.listNames.clear();
        RequestsList.setModel(namesList);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RequestListScrollPane = new javax.swing.JScrollPane();
        RequestsList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        TitleLabel = new javax.swing.JLabel();
        RequstTextFieldScrollPane = new javax.swing.JScrollPane();
        RequestTextField = new javax.swing.JTextArea();
        AdminButton = new javax.swing.JButton();
        RequestDeleteButton = new javax.swing.JButton();
        RequestAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(582, 345));
        setResizable(false);

        RequestsList.setMaximumSize(new java.awt.Dimension(161, 323));
        RequestsList.setMinimumSize(new java.awt.Dimension(161, 323));
        RequestsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestsListMouseClicked(evt);
            }
        });
        RequestListScrollPane.setViewportView(RequestsList);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Текст заявки");

        RequestTextField.setColumns(20);
        RequestTextField.setRows(5);
        RequestTextField.setWrapStyleWord(true);
        RequestTextField.setMinimumSize(new java.awt.Dimension(104, 64));
        RequstTextFieldScrollPane.setViewportView(RequestTextField);

        AdminButton.setText("Админ. Панель");
        if (this.rule == 0){
            AdminButton.setEnabled(true);
            AdminButton.setVisible(true);
        }
        else {
            AdminButton.setEnabled(false);
        }
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        RequestDeleteButton.setText("Удалить заявку");
        RequestDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestDeleteButtonActionPerformed(evt);
            }
        });

        RequestAddButton.setText("Добавить заявку");
        RequestAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RequstTextFieldScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(AdminButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RequestDeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RequestAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RequestListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AdminButton, RequestAddButton, RequestDeleteButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RequestListScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RequstTextFieldScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdminButton)
                            .addComponent(RequestDeleteButton)
                            .addComponent(RequestAddButton)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RequestAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestAddButtonActionPerformed
        ARF = new AddRequestForm();
        ARF.setVisible(true);
    }//GEN-LAST:event_RequestAddButtonActionPerformed

    private void RequestsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestsListMouseClicked
        DBW = new DBWorker();
        String clickedName = String.valueOf(RequestsList.getSelectedValue());
        DBWorker.id = DBW.getID(clickedName);
        RequestTextField.setText(DBW.getAddInfoByID(DBWorker.id));
        DBWorker.id = 0;
        if (evt.getClickCount() == 2){
            DBWorker.id = DBW.getID(clickedName);
            int reqType = DBW.getReqTypeByID(DBWorker.id);
            String username = DBW.getNameByID(DBWorker.id);
            String addInfo = DBW.getAddInfoByID(DBWorker.id);
            ARF = new AddRequestForm(reqType, username, addInfo);
            ARF.setVisible(true);
        }
    }//GEN-LAST:event_RequestsListMouseClicked

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        AF = new AdminFrame();
        AF.setVisible(true);
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void RequestDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestDeleteButtonActionPerformed
        
    }//GEN-LAST:event_RequestDeleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton RequestAddButton;
    private javax.swing.JButton RequestDeleteButton;
    private javax.swing.JScrollPane RequestListScrollPane;
    private javax.swing.JTextArea RequestTextField;
    private javax.swing.JList RequestsList;
    private javax.swing.JScrollPane RequstTextFieldScrollPane;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
