import conta.Movimento;

public class App {
    public static void main(String[] args) throws Exception {
        Movimento movimento = new Movimento();

        movimento.depositar(100.00);
        movimento.sacar(30.00);
        movimento.transferir(20.00);

        System.out.println(movimento.getSaldo());
    }
}
