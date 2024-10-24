package proyectoPokemon;

public abstract class Fuego extends Pokemon {
	private int damLlamarada;
	private int damInfierno;
	
    public Fuego(String nombre, int nivel, int vida, int ataque, int defensa, int velocidad, int damLlamarada, int damInfierno) {
        super(nombre, nivel, vida, ataque, defensa, velocidad, "Fuego");
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