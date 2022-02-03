package banco.model;

public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(this.getSaldo() >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}else {
			System.out.println("Saldo insuficiente...");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getCliente() {
		return this.cliente.getNome();
	}
	
	public void imprimirInfos() {
		System.out.println(String.format("Nome: %s", this.getCliente()));
		System.out.println(String.format("Agencia: %d", this.getAgencia()));
		System.out.println(String.format("Conta: %d", this.getConta()));
		System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
	}
}
