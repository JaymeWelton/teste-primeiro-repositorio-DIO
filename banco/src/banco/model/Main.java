package banco.model;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João");
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(101, poupanca); //Testando transferência inválida.
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
