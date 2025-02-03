public class Main {
    public static void main(String[] args) {
        HiloEjemplo h = null;

        for (int i = 0; i < 3; i++) {
            h = new HiloEjemplo(); // se crea hilo hijo
            h.start(); // se inicia el hijo

        }
    }

}
