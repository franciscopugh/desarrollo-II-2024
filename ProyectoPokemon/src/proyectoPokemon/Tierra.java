package proyectoPokemon;

public abstract class Tierra extends Pokemon {
	private int damFisura;
	private int damTerremoto;
	
	public Tierra(String nombre, int nivel, int vida, int ataque, int defensa, int velocidad, String tipo, int damFisura, int damTerremoto) {
		super(nombre, nivel, vida, ataque, defensa, velocidad, tipo);
		this.damFisura = damFisura;
		this.damTerremoto = damTerremoto;
	}
	
	public void fisura(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Fisura.");
	     enemigo.recibirDaño(getDamFisura() * getNivel());
	}

	public void terremoto(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Terremoto.");
	     enemigo.recibirDaño(getDamTerremoto() * getNivel());
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