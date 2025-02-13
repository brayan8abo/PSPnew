public class HiloPrioridad extends Thread {
    private int n;

    public HiloPrioridad(String nom, int n) {
        super(nom);
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
        }
        System.out.println("Fin Bucle" + getName());
    }

    public static void main(String[] args) {
        HiloPrioridad h1 = new HiloPrioridad("Hilo1", 4);
        HiloPrioridad h2 = new HiloPrioridad("Hilo2", 2);
        HiloPrioridad h3 = new HiloPrioridad("Hilo3", 6);

        h1.setPriority(Thread.NORM_PRIORITY);
        h2.setPriority(Thread.MAX_PRIORITY);
        h3.setPriority(Thread.MIN_PRIORITY);

        h1.start();
        h2.start();
        h3.start();
    }
    
    
}
