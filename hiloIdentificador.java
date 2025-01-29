public class hiloIdentificador extends Thread {

    public void run () {
        System.out.println(
            "Dentro del HILO: " + Thread.currentThread().getName() + "\n\tprioridad: " + Thread.currentThread().getPriority() + "\n\tID: " + Thread.currentThread().getId()+ "\n\tHilos activos: " + Thread.currentThread().activeCount();
            );
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("Principal"); //Nombre a main
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().toString());

        hiloIdentificador h = null;

        for (int i = 0; i < 3; i++) {
            h = new hiloIdentificador(); //creamos el hilo
            h.setName("HILO"+i); //damos nombre al hilo
            h.setPriority(i+1); //damos prioridad
            h.start(); //iniciamos el hilo 

            System.out.println("Información del " + h.getName() + ": " + h.toString());
        }
    }

}
