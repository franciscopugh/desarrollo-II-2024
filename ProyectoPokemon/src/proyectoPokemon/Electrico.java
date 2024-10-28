package proyectoPokemon;

public abstract class Electrico extends Pokemon {
	private int damImpactrueno;
	private int damOndaAnomala;
	
	public Electrico(String nombre, int nivel, int vida, int ataque, int defensa, int velocidad, int damImpactrueno, int damOndaAnomala) {
		super(nombre, nivel, vida, ataque, defensa, velocidad, "Electrico");
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
