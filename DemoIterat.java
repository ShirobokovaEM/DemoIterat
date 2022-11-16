
package demoiterat;


public class DemoIterat {

   
    public static void main(String[] args) throws InterruptedException {
       
        ThreadCounter thread = new ThreadCounter();
        System.out.println(" start: " + thread.start());
        System.out.println("join: " + thread.join(2000));
       // System.out.println("interrupt: " + thread.interrupt());
        System.out.println("stop: " + thread.stop());
        
        System.out.println("end of main() ");
    }
    
}
