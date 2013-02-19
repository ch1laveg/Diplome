
package requestreciever;


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
            break;
        }
            try {
                Thread.sleep(10000);
                this.run();
            } catch (InterruptedException ex) {
                System.out.println("Не уснули");
            }                
    }
    
}
