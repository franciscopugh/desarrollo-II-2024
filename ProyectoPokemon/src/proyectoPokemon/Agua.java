package proyectoPokemon;

public abstract class Agua extends Pokemon {
	private int damHidrobomba;
	private int damTorbellino;
	
	public Agua(String nombre, int nivel, int vida, int ataque, int defensa, int velocidad, String tipo, int damHidrobomba, int damTorbellino) {
		super(nombre, nivel, vida, ataque, defensa, velocidad, tipo);
		this.damHidrobomba = damHidrobomba;
		this.damTorbellino = damTorbellino;
	}
	
	public void hidrobomba(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Hidrobomba.");
	     enemigo.recibirDaño(getDamHidrobomba() * getNivel());
	}

	public void torbellino(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Torbellino.");
	     enemigo.recibirDaño(getDamTorbellino()* getNivel());
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
