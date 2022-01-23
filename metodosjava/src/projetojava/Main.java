package projetojava;
import projetojava.Calculadora;
import projetojava.Mensagem;
import projetojava.Emprestimo;

//Código para o exercício 1 de métodos de Java...
public class Main {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		
		cal.soma(15, 25.5);
		cal.subtracao(13, 8);
		cal.multiplicacao(8, 3);
		cal.divisao(9, 3);
		
		Mensagem men = new Mensagem();
		men.mensagem(5);
		men.mensagem(10);
		men.mensagem(15);
		men.mensagem(20);
		men.mensagem(0);
		
		Emprestimo emp = new Emprestimo();
		emp.duasParcelas(100);
		emp.tresParcelas(100);
		
	}

}
