package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "alumno";
		CalculadoraDeCadenas calculadora = new CalculadoraDeCadenas();
		int cantidadDeVocales = calculadora.contadorDeVocales(cadena);
		System.out.println("La palabra "+cadena+" tiene "+cantidadDeVocales+" vocales");
	}

}
