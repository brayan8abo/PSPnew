public class Cuenta {
    private int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void restar(int cantidad) {
        saldo -= cantidad;
    }

    public void retirarDinero(String nombre, int cantidad) {
        if (getSaldo() >= cantidad) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

            restar(cantidad);

            System.out.println("\t" + nombre + " a retirado: " + cantidad + " y ahora tienes: " + getSaldo());
        } else {
            System.err.println(nombre + " No puedes retirar dinero, [NO HAY FONDOS SUFICIENTES]" + getSaldo());
        }

        if (getSaldo() < 0) {
            System.err.println("[SALDO NEGATIVO] " + getSaldo());

        }
    }

}
