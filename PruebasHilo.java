public class PruebasHilo {
    public static void main(String[] args) {
        Hilo hilo = new Hilo();

        Thread tA = new Thread(hilo);
        Thread tB = new Thread(hilo);

        tA.setName("Hilo A");
        tB.setName("Hilo B");

        tA.setPriority(1);
        tB.setPriority(10);

        tA.start();
        try {
            tB.join();
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tB.start();

    }

}