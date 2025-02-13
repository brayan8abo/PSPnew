public class EjemploJoin {
    public static void main(String[] args) {
        HiloJoin h1 = new HiloJoin("Hilo1", 4);
        HiloJoin h2 = new HiloJoin("Hilo2", 2);
        HiloJoin h3 = new HiloJoin("Hilo3", 6);

      
         h1.start();
         h2.start();
         h3.start();

        try {
            h1.join();
             h2.join();
             h3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
