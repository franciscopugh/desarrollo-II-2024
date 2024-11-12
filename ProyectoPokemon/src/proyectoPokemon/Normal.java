package proyectoPokemon;

import java.util.Scanner;

public abstract class Normal extends Pokemon{
	private int damAtaqueRapido;
	private int damLatigo;
	
	public Normal(String nombre, int nivel, int vida, int ataque, int damAtaqueRapido, int damLatigo) {
		super(nombre, nivel, vida, ataque, "Normal");
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
	
	@Override
	public String elegirAtaque() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador, eliga tu ataque:");
        System.out.println("1. Ataque Rapido");
        System.out.println("2. Latigo");
        System.out.println("3. Ataque base");
        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                return "Ataque Rapido";
            case 2:
                return "Latigo";
            case 3:
                return "Ataque Base";   
            default:
                System.out.println("Opción inválida, se usará Ataque Base por defecto.");
                return "Ataque base";
        }
	}
	
	@Override
    public void aplicarEfecto(Pokemon enemigo, int probabilidad) {
       
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
