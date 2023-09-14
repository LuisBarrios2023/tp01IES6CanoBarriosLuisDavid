package ejercicio05;

public class Calculadora {
	public int calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
	}
}
