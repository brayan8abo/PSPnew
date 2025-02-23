public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldoInicial){
        this.saldo = saldoInicial;
    }

    public int getSaldo(){
        return saldo;
    }

    public void retirarDinero(int cantidad){
        if(saldo >= cantidad){
            try {
                Thread.sleep(100); // simula retraso 
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            saldo-=cantidad;
            System.out.println(Thread.currentThread().getName() + " retiró " + cantidad + " €. quedá un saldo de " + saldo);
        } else {
            System.out.println(Thread.currentThread().getName() + " intentó retirar " + cantidad + " €, pero no hay fondos suficientes");
        }
    }
    
}
