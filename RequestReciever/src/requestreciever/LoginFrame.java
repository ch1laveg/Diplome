
package requestreciever;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginFrame extends javax.swing.JFrame {
    DBWorker DBW;
    WorkFrame WF;
    int rule; // Права доступа, 0 - админ
    public static String CurrentUsername; // Хранит имя текущего пользователя
    public LoginFrame() {
        initComponents();
        DBW = new DBWorker();        
        LoginButton.requestFocus(); 
        this.setTitle("Вход");
        java.awt.Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        LoginProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        NameTextField.setText("Введите имя");
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
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        LoginButton.setText("Войти");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LoginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButton)
                    .addComponent(LoginProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusLost
        if (NameTextField.getText().equals("")){
            NameTextField.setText("Введите имя");
        }        
    }//GEN-LAST:event_NameTextFieldFocusLost

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        char[] pwd = PasswordField.getPassword();
        String password = "";
        for (int i = 0; i < pwd.length; i++){
            password = password + pwd[i];
        }  
        if (password.equals("")){
            PasswordField.setText("Пароль");
        }        
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Pattern login = Pattern.compile("[a-zA-Z]+[0-9]+");
        Matcher log = login.matcher(NameTextField.getText());
        boolean found = log.matches();
        if (found) {
            this.LoginProgressBar.setIndeterminate(true);             
            this.Login();   
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void NameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusGained
        NameTextField.setText("");
    }//GEN-LAST:event_NameTextFieldFocusGained

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (evt.getKeyCode() == 10){
            this.LoginButtonActionPerformed(null);
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed
    
    private void Login(){
        char[] pwd;        
        pwd = PasswordField.getPassword();
        String password = "";        
        for (int i = 0; i < pwd.length; i++){
            password = password + pwd[i];            
        }
        String name = NameTextField.getText();        
        String[] user;
        user = DBW.getUser(name);
        rule = Integer.parseInt(user[2]);
        WF = new WorkFrame(rule);
        try{
            if (user[0].equals(NameTextField.getText()) && user[1].equals(password)){
                LoginFrame.CurrentUsername = NameTextField.getText();
                this.setVisible(false);                
                WF.setVisible(true);
                Thread t = new Thread(new Refresher(WF));
                t.start();
            }
        }        
        catch(NullPointerException e){
            System.out.println("Неверный логин или пароль");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JProgressBar LoginProgressBar;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    // End of variables declaration//GEN-END:variables
}
