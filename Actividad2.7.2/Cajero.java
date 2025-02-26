public class Cajero {
    public static void main(String[] args) {
        CuentaSync cuenta1 = new CuentaSync(50);

        Retirar c1 = new Retirar("Ana", cuenta1);
        Retirar c2 = new Retirar("Juan", cuenta1);

        c1.start();
        c2.start();

    }

}
