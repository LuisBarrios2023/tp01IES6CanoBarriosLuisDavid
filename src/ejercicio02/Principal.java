package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA = 5;
		int numeroB = 0;
		
		Calculadora calculadora = new Calculadora();
		
		int suma = calculadora.sumar(numeroA, numeroB);
		int resta = calculadora.restar(numeroA, numeroB);
		int multiplicacion = calculadora.multiplicar(numeroA, numeroB);
		int dividir = calculadora.dividir(numeroA, numeroB);
		double potencia = calculadora.potenciar(numeroA, numeroB);
		double raiz = calculadora.radical(numeroA);
		
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicacion: "+multiplicacion);
		System.out.println("Division: "+dividir);
		System.out.println("Potencia: "+potencia);
		System.out.println("Raiz cuadrada de "+numeroA+": "+raiz);
	}

}
