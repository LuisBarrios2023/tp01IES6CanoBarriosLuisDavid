package ejercicio04;

public class Calculadora {
	public void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            int triple = numero * 3;
            System.out.println("El número es par. El triple del número es: " + triple);
        } else {
            int doble = numero * 2;
            System.out.println("El número es impar. El doble del número es: " + doble);
        }
    }
}
