package ejercicio02;

public class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}
	public int restar(int a, int b) {
		return a - b;
	}
	public int multiplicar(int a, int b) {
		return a * b;
	}
	public int dividir(int a, int b) {
		if(b==0) {
			System.out.println("No se puede dividir entre cero");
			return 0;
		} else {
		return a / b;
		}
	}

	public double potenciar(int base, int exponente) {
		return Math.pow(base, exponente);
	}
	public double radical(int numero) {
		return Math.sqrt(numero);
	}
}
