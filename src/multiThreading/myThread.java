package multiThreading;

public class myThread extends Thread {
   public void run (){

       for (int i =0; i<5; i++){
//           System.out.println("thread is running");
           System.out.println(Thread.currentThread().getName()+" "+ i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }

    public myThread(String name) {
        super(name);
    }
}
