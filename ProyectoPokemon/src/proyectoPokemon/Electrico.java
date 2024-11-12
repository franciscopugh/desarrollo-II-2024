package proyectoPokemon;

import java.util.Scanner;
import java.util.Random;

public abstract class Electrico extends Pokemon {
	private int damImpactrueno;
	private int damOndaAnomala;
	private int multiplicador = 1;
	
	public Electrico(String nombre, int nivel, int vida, int ataque, int damImpactrueno, int damOndaAnomala) {
		super(nombre, nivel, vida, ataque, "Electrico");
		this.damImpactrueno = damImpactrueno;
		this.damOndaAnomala = damOndaAnomala;
		// TODO Auto-generated constructor stub
	}
	
	public void impactrueno(Pokemon enemigo) {
	        System.out.println(getNombre() + " usa Impactrueno.");
	        if(enemigo.getTipo() == "Agua" ) {
	        	multiplicador = 2;
	        } else if(enemigo.getTipo() == "Tierra") {
	        	multiplicador = 0;
	        }
	        
	        enemigo.recibirDaño(getDamImpactrueno() * getNivel() * multiplicador);
	        aplicarEfecto(enemigo, 40);
	 }

	 public void ondaAnomala(Pokemon enemigo) {
	        System.out.println(getNombre() + " usa Onda Anomala.");
	        if(enemigo.getTipo() == "Agua" ) {
	        	multiplicador = 2;
	        } else if(enemigo.getTipo() == "Tierra") {
	        	multiplicador = 0;
	        }
	        
	        enemigo.recibirDaño(getDamOndaAnomala() * getNivel() * multiplicador);
	        aplicarEfecto(enemigo, 20);
	  }

	  @Override
	  public void atacar(Pokemon enemigo, String ataque) {
	      if (ataque.equals("Impactrueno")) {
	            impactrueno(enemigo);
	      } else if (ataque.equals("Onda Anomala")) {
	            ondaAnomala(enemigo);
	      } else {
	        	ataqueBase(enemigo);
	      }
	    }
	  
	  @Override
		public String elegirAtaque() {
		  	Scanner scanner = new Scanner(System.in);
	        System.out.println("Jugador, eliga tu ataque:");
	        System.out.println("1. Impactrueno");
	        System.out.println("2. Onda Anomala");
	        System.out.println("3. Ataque Base");
	        int eleccion = scanner.nextInt();

	        switch (eleccion) {
	            case 1:
	                return "Impactrueno";
	            case 2:
	                return "Onda Anomala";
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
	    	 if(enemigo.getTipo() != "Tierra" && enemigo.getTipo() != "Electrico") {
	    		 enemigo.setEstado("Paralizado");
		         System.out.println(enemigo.getNombre() + " ha sido paralizado.");
	    	 } else {
	    		 System.out.println(enemigo.getNombre() + " no ha sido afectado por paralisis.");
	    	 }
	           
	     } else {
	            System.out.println(enemigo.getNombre() + " no ha sido afectado por paralisis.");
	      }
	}
	
	public int getDamImpactrueno() {
	    return damImpactrueno;
	}

	public void setDamImpactrueno(int damImpactrueno) {
	    this.damImpactrueno = damImpactrueno;
	}

	public int getDamOndaAnomala() {
	     return damOndaAnomala;
	}

	public void setDamOndaAnomala(int damOndaAnomala) {
	     this.damOndaAnomala = damOndaAnomala;
	 }
	
}
