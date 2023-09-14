package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellidos = "cano barrios";
        String nombres = "luis david";
        String mail = "correo@gmail.com";
        int edad = 24;
        double ingresosMensuales = 20000.0;
        double gastosMensuales = 12000.0;

        Usuario usuario = new Usuario(apellidos, nombres, mail, edad, ingresosMensuales, gastosMensuales);

        System.out.println("Apellidos: " + usuario.getApellidos());
        System.out.println("Nombres: " + usuario.getNombres());
        System.out.println("Correo: " + usuario.getMail());
        System.out.println("Edad: " + usuario.getEdad());

        if (usuario.esMayorDeEdad()) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

        if (usuario.puedeAhorrar()) {
            System.out.println("El usuario puede ahorrar.");
        } else {
            System.out.println("El usuario no puede ahorrar.");
        }
	}

}
