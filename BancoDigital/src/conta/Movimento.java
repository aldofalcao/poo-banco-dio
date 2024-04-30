package conta;

public class Movimento implements Conta {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

}
