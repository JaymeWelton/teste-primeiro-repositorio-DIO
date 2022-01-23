package sobrecarga;
import sobrecarga.Sobrecarga;

public class Main {

	public static void main(String[] args) {
		Sobrecarga metodo = new Sobrecarga();
		
		metodo.calculaArea(5);
		metodo.calculaArea(7, 8);
		metodo.calculaArea(7, 8, 5);

	}

}
