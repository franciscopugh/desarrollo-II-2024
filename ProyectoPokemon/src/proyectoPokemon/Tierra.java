package proyectoPokemon;

import java.util.Random;
import java.util.Scanner;

public abstract class Tierra extends Pokemon {
	private int damFisura;
	private int damTerremoto;
	private int multiplicador = 1;
	
	public Tierra(String nombre, int nivel, int vida, int ataque, int damFisura, int damTerremoto) {
		super(nombre, nivel, vida, ataque,"Tierra");
		this.damFisura = damFisura;
		this.damTerremoto = damTerremoto;
	}
	
	public void fisura(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Fisura.");
	     if(enemigo.getTipo() == "Electrico" ) {
	        	multiplicador = 2;
	        } else if(enemigo.getTipo() == "Fuego") {
	        	multiplicador = 0;
	        }
	     enemigo.recibirDaño(getDamFisura() * getNivel() * multiplicador);
	     
	}

	public void terremoto(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Terremoto.");
	     if(enemigo.getTipo() == "Electrico" ) {
	        	multiplicador = 2;
	        } else if(enemigo.getTipo() == "Fuego") {
	        	multiplicador = 0;
	     }
	     enemigo.recibirDaño(getDamTerremoto() * getNivel() * multiplicador);
	}

	@Override
	public void atacar(Pokemon enemigo, String ataque) {
		if (ataque.equals("Fisura")) {
          fisura(enemigo);
       } else if (ataque.equals("Terremoto")) {
          terremoto(enemigo);
       } else {
       	ataqueBase(enemigo);
       }
		
	}
	
	@Override
	public String elegirAtaque() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador, eliga tu ataque:");
        System.out.println("1. Fisura");
        System.out.println("2. Terremoto");
        System.out.println("3. Ataque Base");
        
        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                return "Fisura";
            case 2:
                return "Terremoto";
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
	    	 if(enemigo.getTipo() != "Fuego" && enemigo.getTipo() != "Tierra") {
	    		 enemigo.setEstado("Aplastado");
		         System.out.println(enemigo.getNombre() + " ha sido paralizado.");
	    	 } else {
	    		 System.out.println(enemigo.getNombre() + " no ha sido afectado por paralisis.");
	    	 }
	           
	     } else {
	            System.out.println(enemigo.getNombre() + " no ha sido afectado por paralisis.");
	      }
    }
	
	 public int getDamFisura() {
	     return damFisura;
	 }

	 public void setDamFisura(int damFisura) {
	     this.damFisura = damFisura;
	 }

	 public int getDamTerremoto() {
	     return damTerremoto;
	 }

	 public void setDamTerremoto(int damTerremoto) {
	     this.damTerremoto = damTerremoto;
	 }

}