package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		if (numero < 0 || numero > 10) {
            System.out.println("Error: El número debe estar en el rango [0,10].");
        } else {
        Calculadora calculadora = new Calculadora();
        int factorial = calculadora.calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        }
	}

}
