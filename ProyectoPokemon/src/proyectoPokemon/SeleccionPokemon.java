package proyectoPokemon;

import java.util.Scanner;

public class SeleccionPokemon {
    private static final Scanner scanner = new Scanner(System.in);

    public static Pokemon seleccionarPokemon() {
        System.out.println("1. Arcanine (Fuego)");
        System.out.println("2. Blastoise (Agua)");
        System.out.println("3. Eevee (Normal)");
        System.out.println("4. Emolga (Electrico)");
        System.out.println("5. Groudon (Tierra)");
        System.out.println("6. Pachirisu (Electrico)");
        System.out.println("7. Pidgeot (Normal / Volador)");
        System.out.println("8. Rapidash (Fuego)");
        System.out.println("9. Sandslash (Tierra)");
        System.out.println("10. Suicune (Agua)");
        System.out.println("Ante cualquier otra opcion, se creara un Arcanine por defecto.");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingresa el nombre de tu Pokémon: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el nivel de tu Pokémon: ");
        int nivel = scanner.nextInt();

        System.out.print("Ingresa la vida de tu Pokémon: ");
        int vida = scanner.nextInt();

        System.out.print("Ingresa el ataque de tu Pokémon: ");
        int ataque = scanner.nextInt();
        
        System.out.print("Ingresa el ataque de habilidad 1 de tu Pokémon: ");
        int damHabilidad1 = scanner.nextInt();
        
        System.out.print("Ingresa el ataque de habilidad 2 de tu Pokémon: ");
        int damHabilidad2 = scanner.nextInt();
        
        // Crear el Pokémon seleccionado con los atributos proporcionados
        return switch (eleccion) {
            case 1 -> new Arcanine(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 2 -> new Blastoise(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 3 -> new Eevee(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 4 -> new Emolga(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 5 -> new Groudon(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 6 -> new Pachirisu(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 7 -> new Pidgeot (nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 8 -> new Rapidash(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 9 -> new Sandslash(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            case 10 -> new Suicune(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
            default -> new Arcanine(nombre, nivel, vida, ataque, damHabilidad1, damHabilidad2);
        };
    }
}
