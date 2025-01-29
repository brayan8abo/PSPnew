public class hiloVersion2 extends Thread {

    public static void main(String[] args) {
        hiloVersion2 h1 = new hiloVersion2();
        hiloVersion2 h2 = new hiloVersion2();
        hiloVersion2 h3 = new hiloVersion2();

        h1.start();
        h2.start();
        h3.start();

        System.out.println("3 Hilos iniciados...");
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo: " + getName() + " - Contador: " + i);
        }
    }
    
}
