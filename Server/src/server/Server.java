
package server;


public class Server {
    

   
    public static void main(String[] args) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
            
        });
        
        
    }
    
   
    
    
}
