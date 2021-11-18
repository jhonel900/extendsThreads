/*
 */
package hilosapre;

/**
 *
 * @author sendo
 */
class HiloHerencia extends Thread {
    
    String palabra;
    long pausa;
   public HiloHerencia(String queDecir,long tiempoPausa){
   super();
  
   palabra=queDecir;
   pausa=tiempoPausa;
   }
public void run(){
    try {
           for(int i=0;i<100;i++){
          if(i==50){
          this.stop();
        }
        System.out.println(palabra+" "+i);
        Thread.sleep(pausa);
}     
    } catch (Exception e) {
    }
}
}
