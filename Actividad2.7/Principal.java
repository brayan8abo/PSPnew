public class Principal {
    public static void main(String[] args) {
        isSynchronized(true);
    }

    public static void isSynchronized(boolean isSinchronized) {
        Contador contador = new Contador();
        Thread[] hilos = new Thread[5];

        for (int i = 0; i < 5; i++) {
            hilos[i] = new Thread(new HiloRunnable(contador, isSinchronized));
            hilos[i].start();
        }
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Resultado con Thread (sincronizado: " + isSinchronized + " --- " + contador.getValor());
    }
}
