package sobrecarga;

public class Sobrecarga {
	public static void calculaArea(double lado1) {
		System.out.println("A �rea do quadrado �: " + (lado1*lado1));
	}
	public static void calculaArea(double lado1, double lado2) {
		System.out.println("A �rea do ret�ngulo �: " + (lado1*lado2));
	}
	public static void calculaArea(double lado1, double lado2, double altura) {
		System.out.println("A �rea do trap�zio �: " + ((lado1+lado2)*altura)/2);
	}
}
