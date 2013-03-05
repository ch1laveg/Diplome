
package requestreciever;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;

public class AdminFrame extends javax.swing.JDialog {
    DBWorker DBW;
    DefaultListModel DLM;
    public AdminFrame() {
        initComponents();
        this.setModal(true);
        java.awt.Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);        
        DBW = new DBWorker();
        this.AddUserButton.requestFocus();
        this.ListRefresher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UserAddLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UserDeleteLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        AddUserButton = new javax.swing.JButton();
        UserTypeComboBox = new javax.swing.JComboBox();
        ClearDBButton = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersList = new javax.swing.JList();
        RefreshButton = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(369, 100));
        jDialog1.setModal(true);
        jDialog1.setResizable(false);

        jButton4.setText("Да");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Отмена");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("База данных будет полностью очищена. Продолжить?");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jDialog1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton4, jButton5});

        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        UserAddLabel.setText("Добавление пользователя:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        UserDeleteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserDeleteLabel.setText("Удаление пользователя:");

        NameTextField.setText("Введите имя...");
        NameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameTextFieldFocusLost(evt);
            }
        });

        PasswordField.setText("Пароль");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });

        AddUserButton.setText("Добавить");
        AddUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserButtonActionPerformed(evt);
            }
        });

        UserTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Выберите тип", "Станки", "Пилы", "Сервис", "Администратор" }));

        ClearDBButton.setText("Очистить БД");
        ClearDBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearDBButtonActionPerformed(evt);
            }
        });

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(UsersList);

        RefreshButton.setText("Обновить");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OkButton)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserDeleteLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClearDBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddUserButton, NameTextField, PasswordField, UserAddLabel, UserTypeComboBox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddUserButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserDeleteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OkButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearDBButton)
                            .addComponent(RefreshButton))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearDBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearDBButtonActionPerformed
        java.awt.Dimension dim = getToolkit().getScreenSize();
        jDialog1.setLocation(dim.width/2 - jDialog1.getWidth()/2, dim.height/2 - jDialog1.getHeight()/2);
        jDialog1.setVisible(true);        
    }//GEN-LAST:event_ClearDBButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DBW.clearRequests();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AddUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserButtonActionPerformed
        Pattern pwd_pat;
        Matcher pwd_matcher;
        boolean foundPwdMatch;
        String pwd_str = this.getPassword();
        pwd_pat = Pattern.compile("[a-zA-Z]+[0-9]+");
        pwd_matcher = pwd_pat.matcher(pwd_str);
        foundPwdMatch = pwd_matcher.matches();
        if ("Введите имя...".equals(NameTextField.getText()) || "".equals(NameTextField.getText())
                || UserTypeComboBox.getSelectedIndex() == 0 || !foundPwdMatch){
            System.out.println("Заполните все поля");
            System.out.println("Пароль должен состоять из латинских букв и цифр");
        }
        else{
            if (UserTypeComboBox.getSelectedIndex() == 4){
                DBW.setUser(NameTextField.getText(), pwd_str, 0);
                System.out.println("Пользователь " + NameTextField.getText() + " добавлен");
                this.dispose();
            }
            else {
                DBW.setUser(NameTextField.getText(), pwd_str, UserTypeComboBox.getSelectedIndex());
                System.out.println("Пользователь " + NameTextField.getText() + " добавлен");
                this.dispose();
            }
        }
    }//GEN-LAST:event_AddUserButtonActionPerformed

    private void NameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusGained
        NameTextField.setText("");
    }//GEN-LAST:event_NameTextFieldFocusGained

    private void NameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusLost
        if (NameTextField.getText().equals("")){
            NameTextField.setText("Введите имя...");
        }
    }//GEN-LAST:event_NameTextFieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if (this.getPassword().equals("")){
            PasswordField.setText("Пароль");
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        if (UsersList.isSelectionEmpty()){
            System.out.println("Выберите пользователя");
        }
        else{
            String user;
            user = String.valueOf(UsersList.getSelectedValue());
            if (!LoginFrame.CurrentUsername.equals(user)){
                DBW.DeleteUser(user);
                System.out.println(user + " удален");
            }
            else {
                System.out.println("Нельзя удалить себя");
            }
        }
    }//GEN-LAST:event_OkButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        this.ListRefresher();
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private String getPassword(){
        char[] pwd_array;
        String pwd_str ="";
        pwd_array = PasswordField.getPassword();
        for (int i = 0; i < pwd_array.length; i++){
            pwd_str = pwd_str + pwd_array[i];
        }
        return pwd_str;
    }
    
    private void ListRefresher(){
        DLM = new DefaultListModel();
        DBW.getAllUsers();
        for (int i = 0; i < DBWorker.userList.size(); i++){
            DLM.addElement(DBWorker.userList.get(i));
        }
        UsersList.setModel(DLM);
        DBWorker.userList.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserButton;
    private javax.swing.JButton ClearDBButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton OkButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JLabel UserAddLabel;
    private javax.swing.JLabel UserDeleteLabel;
    private javax.swing.JComboBox UserTypeComboBox;
    private javax.swing.JList UsersList;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
