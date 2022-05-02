public class ContaCorrente {


    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){

            this.saldo -= valor;
        

    }
    public void depositar(double valor){
        this.saldo += valor;
    }

}
