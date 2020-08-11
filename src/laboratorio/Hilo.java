package laboratorio;

public class Hilo extends Thread{
    
    @Override
    public void run(){
        System.out.println("ID del proceso Run: " + Thread.currentThread().getId() 
                + " Curyo nombre es: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
    
}
