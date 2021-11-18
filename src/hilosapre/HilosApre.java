/*
 */
package hilosapre;

/**
 *
 * @author sendo
 */
public class HilosApre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        HiloHerencia hilo1;
        HiloHerencia hilo2;
        
        hilo1=new HiloHerencia("ton",33);
        hilo2=new HiloHerencia("tin",100);      
         
       hilo1.setPriority(10);
        hilo2.setPriority(5);
        hilo1.start();
        hilo1.join();
        hilo2.start();
        hilo2.join();
        System.out.println(hilo1.getPriority());
        System.out.println(hilo2.getPriority());
        System.out.println(hilo1.getName());
        System.out.println(hilo2.getName());
        hilo1.setName("hilo numero 1");
        hilo2.setName("hilo numero 2");
        System.out.println(hilo1.getName());
        System.out.println(hilo2.getName());       
        System.out.println(hilo1.isAlive());       
        System.out.println(hilo2.isAlive());  }
    
}
