package proyectoPokemon;

import java.util.Random;
import java.util.Scanner;

public abstract class Fuego extends Pokemon {
	private int damLlamarada;
	private int damInfierno;
	private int multiplicador = 1;
	
    public Fuego(String nombre, int nivel, int vida, int ataque, int damLlamarada, int damInfierno) {
        super(nombre, nivel, vida, ataque, "Fuego");
        this.damInfierno = damInfierno;
        this.damLlamarada = damLlamarada;
    }

    public void llamarada(Pokemon enemigo) {
        System.out.println(getNombre() + " usa Llamarada.");
        if(enemigo.getTipo() == "Tierra" ) {
        	multiplicador = 2;
        } else if(enemigo.getTipo() == "Agua") {
        	multiplicador = 0;
        }
       
        enemigo.recibirDaño(getDamLlamarada() * getNivel() * multiplicador);
        aplicarEfecto(enemigo, 30);
    }

    public void infierno(Pokemon enemigo) {
        System.out.println(getNombre() + " usa Infierno.");
        if(enemigo.getTipo() == "Tierra" ) {
        	multiplicador = 2;
        } else if(enemigo.getTipo() == "Agua") {
        	multiplicador = 0;
        }
        
        enemigo.recibirDaño(getDamInfierno() * getNivel() * multiplicador);
        aplicarEfecto(enemigo, 50);
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
    
    @Override
    public void aplicarEfecto(Pokemon enemigo, int probabilidad) {
    	Random random = new Random();

	     if (random.nextInt(100) < probabilidad) {
	    	 System.out.println(enemigo.getTipo());
	    	 if(enemigo.getTipo() != "Agua" && enemigo.getTipo() != "Fuego") {
	    		 enemigo.setEstado("Quemado");
		         System.out.println(enemigo.getNombre() + " ha sido quemado.");
	    	 } else {
	    		 System.out.println(enemigo.getNombre() + " no ha sido afectado por quemaduras.");
	    	 }
	     } else {
	            System.out.println(enemigo.getNombre() + " no ha sido afectado por quemaduras.");
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