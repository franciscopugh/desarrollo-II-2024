package proyectoPokemon;

import java.util.Scanner;

public abstract class Fuego extends Pokemon {
	private int damLlamarada;
	private int damInfierno;
	
    public Fuego(String nombre, int nivel, int vida, int ataque, int damLlamarada, int damInfierno) {
        super(nombre, nivel, vida, ataque, "Fuego");
        this.damInfierno = damInfierno;
        this.damLlamarada = damLlamarada;
    }

    public void llamarada(Pokemon enemigo) {
        System.out.println(getNombre() + " usa Llamarada.");
        enemigo.recibirDaño(getDamLlamarada() * getNivel());
    }

    public void infierno(Pokemon enemigo) {
        System.out.println(getNombre() + " usa Infierno.");
        enemigo.recibirDaño(getDamInfierno() * getNivel());
    }

    @Override
    public void atacar(Pokemon enemigo, String ataque) {
        if (ataque.equals("Llamarada")) {
            llamarada(enemigo);
        } else if (ataque.equals("Infierno")) {
            infierno(enemigo);
        } else {
        	ataqueBase(enemigo);
        }
    }
    
    @Override
	public String elegirAtaque() {
    	 Scanner scanner = new Scanner(System.in);
         System.out.println("Jugador 1, eliga tu ataque:");
         System.out.println("1. Llamarada");
         System.out.println("2. Infierno");
         System.out.println("3. Ataque Base");
         int eleccion = scanner.nextInt();

         switch (eleccion) {
             case 1:
                 return "Llamarada";
             case 2:
                 return "Infierno";
             case 3:
	             return "Ataque Base";
             default:
                 System.out.println("Opción inválida, se usará Ataque Base por defecto.");
                 return "Ataque base";
         }
	}
    
    public int getDamLlamarada() {
        return damLlamarada;
    }

    public void setDamAtaqueRapido(int damLlamarada) {
        this.damLlamarada = damLlamarada;
    }

    public int getDamInfierno() {
        return damInfierno;
    }

    public void setDamInfierno(int damInfierno) {
        this.damInfierno = damInfierno;
    }
}