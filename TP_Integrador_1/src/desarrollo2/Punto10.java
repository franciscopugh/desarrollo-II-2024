package desarrollo2;

public class Punto10 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Masculino", "22/05/2000", "Fernando", "Acosta", 1231233);

        System.out.println("El genero de esta persona es: " + persona1.getGenero());
        System.out.println("La fecha de nacimiento de mi usuario es: " + persona1.getFechaNacimiento());
        System.out.println("El nombre de esta persona es: " + persona1.getNombre());
        System.out.println("El apellido de esta persona es: " + persona1.getApellido());
        System.out.println("El dni de esta persona es: " + persona1.getDni());
    }

}
