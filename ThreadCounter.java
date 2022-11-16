
package demoiterat;


public class ThreadCounter implements Runnable {
    
    private Thread self;
    private int counter;
    private volatile boolean canWork;

    public ThreadCounter() {
        self = new Thread(this);
    }
    
    public int start(){
        canWork = true;
        self.start();
        return counter;
    }
    
    public int interrupt(){
        System.out.println("sending interrupt, counter = " + counter);
        self.interrupt();
        return counter;
    }
    
    public int join(int ms) throws InterruptedException{
        System.out.println("Join invoked, counter = " + counter);
        self.join(ms);
        return counter;
    }
    
    public int stop(){
        canWork = false;
        return counter;
    }

    @Override
    public void run() {
     //   while(true){
      //      counter++;
       //     try {
       //     Thread.sleep(100);
      //  }catch (InterruptedException ex){
       //        // System.out.println("You will not stop me!");
       //        break;
      //  }
      //  }
      
      while(canWork){//это флаг
          counter++;
          
      }
    }
       
    
    
}
