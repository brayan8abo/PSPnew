public class Contador {

    private int valor = 0;

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
    }

    public synchronized void incrementarSincronizado() {
        valor++;
    }
}
