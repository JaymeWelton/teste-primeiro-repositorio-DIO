package banco.model;

public class Cliente {
	protected String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
