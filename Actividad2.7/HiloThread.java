public class HiloThread extends Thread {

    private Contador contador;
    private boolean isSynchronized;

    public HiloThread(Contador contador, boolean isSynchronized) {
        this.contador = contador;
        this.isSynchronized = isSynchronized;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            if (isSynchronized) {
                contador.incrementarSincronizado();
            } else {
                contador.incrementar();
            }
        }
    }

}