public class Main {

    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        cliente.setNome("Matheus");

        Conta cc = new contaCorrente(cliente);
        cc.depositar(300);

        Conta poupanca = new contaPoupanca(cliente);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
