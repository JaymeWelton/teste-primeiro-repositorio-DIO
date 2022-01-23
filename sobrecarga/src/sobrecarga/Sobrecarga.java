package sobrecarga;

public class Sobrecarga {
	public static void calculaArea(double lado1) {
		System.out.println("A área do quadrado é: " + (lado1*lado1));
	}
	public static void calculaArea(double lado1, double lado2) {
		System.out.println("A área do retângulo é: " + (lado1*lado2));
	}
	public static void calculaArea(double lado1, double lado2, double altura) {
		System.out.println("A área do trapézio é: " + ((lado1+lado2)*altura)/2);
	}
}
