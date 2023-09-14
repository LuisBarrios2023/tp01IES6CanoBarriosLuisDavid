package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellidos = "cano barrios";
		String nombres = "luis david";
		
		Usuario usuario = new Usuario(apellidos, nombres);
		
		
		System.out.println("Datos de usuario: "+usuario.getApellidos()+" "+usuario.getNombres());
	}

}
