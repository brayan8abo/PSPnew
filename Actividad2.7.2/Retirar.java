public class Retirar extends Thread {

    private CuentaSync cuenta1;

    public Retirar(String nombre, CuentaSync cuenta1) {
        super(nombre);
        this.cuenta1 = cuenta1;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            cuenta1.retirarDinero(getName(), 10);
        }
    }

}
