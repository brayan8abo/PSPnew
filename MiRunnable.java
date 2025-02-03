public class MiRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            for (int i = 1; i <5; i++) {
                System.out.println(i);
        
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MiRunnable hilo = new MiRunnable();

        Thread thread = new Thread(hilo);

        thread.setName("BRAYAN");

        thread.start();
    }
}