public class Main {
    public static void main(String[] args) {
        
        Cliente danielle = new Cliente();
        danielle.setNome("Danielle");
        
        Conta cc = new ContaCorrente(danielle);
        Conta cp = new ContaPoupanca(danielle);
       
        cc.depositar(250);
        cc.imprimirExtrato();

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
