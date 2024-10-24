package proyectoPokemon;

public abstract class Normal extends Pokemon{
	private int damAtaqueRapido;
	private int damLatigo;
	
	public Normal(String nombre, int nivel, int vida, int ataque, int defensa, int velocidad, String tipo, int damAtaqueRapido, int damLatigo) {
		super(nombre, nivel, vida, ataque, defensa, velocidad, tipo);
		this.damAtaqueRapido = damAtaqueRapido;
		this.damLatigo = damLatigo;
	}
	
	public void ataqueRapido(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Ataque Rapido.");
	     enemigo.recibirDaño(getDamAtaqueRapido() * getNivel());
	}

	public void latigo(Pokemon enemigo) {
	     System.out.println(getNombre() + " usa Latigo.");
	     enemigo.recibirDaño(getDamLatigo() * getNivel());
	}

	@Override
	public void atacar(Pokemon enemigo, String ataque) {
		if (ataque.equals("Ataque Rapido")) {
            ataqueRapido(enemigo);
        } else if (ataque.equals("Latigo")) {
            latigo(enemigo);
        } else {
        	ataqueBase(enemigo);
        }
		
	}
	
	public int getDamAtaqueRapido() {
        return damAtaqueRapido;
    }

    public void setDamAtaqueRapido(int damAtaqueRapido) {
        this.damAtaqueRapido = damAtaqueRapido;
    }

    public int getDamLatigo() {
        return damLatigo;
    }

    public void setDamLatigo(int damLatigo) {
        this.damLatigo = damLatigo;
    }

}
