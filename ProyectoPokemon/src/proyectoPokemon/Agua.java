package proyectoPokemon;

import java.util.Random;
import java.util.Scanner;

public abstract class Agua extends Pokemon {
	private int damHidrobomba;
	private int damTorbellino;
	private int multiplicador = 1;
	
	public Agua(String nombre, int nivel, int vida, int ataque, int damHidrobomba, int damTorbellino) {
		super(nombre, nivel, vida, ataque, "Agua");
		this.damHidrobomba = damHidrobomba;
		this.damTorbellino = damTorbellino;
	}
	
	public void hidrobomba(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Hidrobomba.");
	     if(enemigo.getTipo() == "Fuego" ) {
	        	multiplicador = 2;
	     } else if(enemigo.getTipo() == "Electrico") {
	        	multiplicador = 0;
	     }
	     enemigo.recibirDaño(getDamHidrobomba() * getNivel() * multiplicador);
	     aplicarEfecto(enemigo, 40);
	}

	public void torbellino(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Torbellino.");
	     if(enemigo.getTipo() == "Fuego" ) {
	        	multiplicador = 2;
	     } else if(enemigo.getTipo() == "Electrico") {
	        	multiplicador = 0;
	     }
	     enemigo.recibirDaño(getDamTorbellino()* getNivel() * multiplicador);
	     aplicarEfecto(enemigo, 20);
	}

	@Override
	public void atacar(Pokemon enemigo, String ataque) {
		if (ataque.equals("Hidrobomba")) {
           hidrobomba(enemigo);
       } else if (ataque.equals("Torbellino")) {
           torbellino(enemigo);
       } else {
       	ataqueBase(enemigo);
       }
		
	}
	
	@Override
	public String elegirAtaque() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador, eliga tu ataque:");
        System.out.println("1. Hidrobomba");
        System.out.println("2. Torbellino");
        System.out.println("3. Ataque Base");
        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                return "Hidrobomba";
            case 2:
                return "Torbellino";
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
	    	 if(enemigo.getTipo() != "Electrico" && enemigo.getTipo() != "Agua") {
	    		 enemigo.setEstado("Corrosion");
		         System.out.println(enemigo.getNombre() + " ha sido corroido.");
	    	 } else {
	    		 System.out.println(enemigo.getNombre() + " no ha sido afectado por corrosion.");
	    	 }    
	     } else {
	            System.out.println(enemigo.getNombre() + " no ha sido afectado por corrosion.");
	      }
    }
	
	public int getDamHidrobomba() {
        return damHidrobomba;
    }

    public void setDamHidrobomba(int damHidrobomba) {
        this.damHidrobomba = damHidrobomba;
    }

    public int getDamTorbellino() {
        return damTorbellino;
    }

    public void setDamTorbellino(int damTorbellino) {
        this.damTorbellino = damTorbellino;
    }

}
