public class HiloRunnable implements Runnable {
    private Contador contador;
    private boolean isSynchronized;

    public HiloRunnable(Contador contador, boolean isSynchronized) {
        this.contador = contador;
        this.isSynchronized = isSynchronized;
    }
    @Override
    public void run(){
        for(int i = 0; i < 5000; i++){
            if (isSynchronized) {
                contador.incrementarSincronizado();
            } else {
                contador.incrementar();
            }
        }
    }

}
