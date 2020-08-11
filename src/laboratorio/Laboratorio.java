package laboratorio;

public class Laboratorio {

  
    public static void main(String[] args) {
        //Secuencia
        System.out.println("ID del Proceso: " + Thread.currentThread().getId() 
        + " Cuyo nombre es " + Thread.currentThread().getName());
        
        System.out.println("Ejecutando el proceso 1");
        Hilo h = new Hilo();
        h.run();
        System.out.println("Finalizando Proceso ");


        //Hilo
        Hilo h2 = new Hilo();
        h2.start();
        System.out.println("Otro proceso #2");
    }
    
}
