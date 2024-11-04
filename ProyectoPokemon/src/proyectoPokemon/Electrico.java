package proyectoPokemon;

import java.util.Scanner;

public abstract class Electrico extends Pokemon {
	private int damImpactrueno;
	private int damOndaAnomala;
	
	public Electrico(String nombre, int nivel, int vida, int ataque, int damImpactrueno, int damOndaAnomala) {
		super(nombre, nivel, vida, ataque, "Electrico");
		this.damImpactrueno = damImpactrueno;
		this.damOndaAnomala = damOndaAnomala;
		// TODO Auto-generated constructor stub
	}
	
	public void impactrueno(Pokemon enemigo) {
	        System.out.println(getNombre() + " usa Impactrueno.");
	        enemigo.recibirDaño(getDamImpactrueno() * getNivel());
	 }

	 public void ondaAnomala(Pokemon enemigo) {
	        System.out.println(getNombre() + " usa Onda Anomala.");
	        enemigo.recibirDaño(getDamOndaAnomala() * getNivel());
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
