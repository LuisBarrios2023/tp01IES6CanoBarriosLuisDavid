package ejercicio03;

public class CalculadoraDeCadenas {
	public String determinarLaexistenciaDeUnCaracterEnLaCadena(String cadena, char caracter) {
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (caracter == cadena.charAt(i)) {
				resultado = "el caracter SI esta en la cadena";
			}else {
				resultado = "el caracter NO esta en la cadena";
			}
		}
		return resultado;
	}
		public int contadorDeVocales(String cadena) {
			int contador = 0;
			for (int i = 0; i < cadena.length(); i++) {
				char letra = cadena.charAt(i);
				if (letra=='a'| letra=='e'|letra=='i'| letra=='o'|letra=='u'| letra=='A'|letra=='E'| letra=='I'|letra=='O'|letra=='U') {
					contador++;
				}
			}
			return contador;
		}
}