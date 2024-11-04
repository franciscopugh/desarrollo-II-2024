package proyectoPokemon;

import java.util.Scanner;

public abstract class Agua extends Pokemon {
	private int damHidrobomba;
	private int damTorbellino;
	
	public Agua(String nombre, int nivel, int vida, int ataque, int damHidrobomba, int damTorbellino) {
		super(nombre, nivel, vida, ataque, "Agua");
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
