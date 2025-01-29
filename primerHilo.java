public class primerHilo extends Thread {
    public primerHilo (String nombre) {
        super(nombre);
        System.out.println("Creando hilo: " + getName());
    }

    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("Hilo: " + getName() + " C = " + i);
        }
    }

    public static void main (String [] args ){
        primerHilo h1 = new primerHilo ("Hilo 1");
        primerHilo h2 = new primerHilo ("Hilo 2");
        primerHilo h3 = new primerHilo ("Hilo 3");

        h1.start();
        h2.start();
        h3.start();



        System.out.println("3 Hilos iniciados...\n");
    }
   
}

