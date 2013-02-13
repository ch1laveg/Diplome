
package requestreciever;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Refresher implements Runnable {
    DBWorker DBW;
    WorkFrame WF;
    
    public Refresher(WorkFrame WF){
        this.WF = WF;
        DBW = new DBWorker();
    }
    @Override
    public void run() {  
        int i = 0;
        while(true){         
            DBW.getNamesForList();
            WF.listRefresher();
            System.out.println("Обновлено " + i);
            i++;            
            try {
                Thread.currentThread().sleep(10000);             
            } catch (InterruptedException ex) {
                System.out.println("Не уснули");
            }
        }        
    }
    
}
