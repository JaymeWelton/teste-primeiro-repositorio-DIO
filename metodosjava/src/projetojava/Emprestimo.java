package projetojava;

public class Emprestimo {
	public static void duasParcelas(double valor) {
		System.out.println("O valor R$ " + valor + " em duas parcelas fica: " + valor + (valor*0.5));
	}
	
	public static void tresParcelas(double valor) {
		System.out.println("O valor R$ " + valor + " em tr�s parcelas fica: " + valor + (valor*0.75));
	}
}
