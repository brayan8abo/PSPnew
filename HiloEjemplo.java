public class HiloEjemplo extends Thread {

    //Propiedades
    private int c;
    private int hilo;

    //Constructor
    Public HiloEjemplo(int hilo){
        this.hilo = hilo;
        System.out.println("CREANDO HILO " + hilo);
    }

    public void run(){
        c =0;
        while (c<=5) {
            System.out.println("Hilo: " + hilo + "C = " + c);
            c++;
        }
    }//fin del run
    
}
