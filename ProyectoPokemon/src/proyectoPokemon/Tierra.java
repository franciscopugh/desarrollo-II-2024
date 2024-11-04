package proyectoPokemon;

import java.util.Scanner;

public abstract class Tierra extends Pokemon {
	private int damFisura;
	private int damTerremoto;
	
	public Tierra(String nombre, int nivel, int vida, int ataque, int damFisura, int damTerremoto) {
		super(nombre, nivel, vida, ataque,"Tierra");
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
	
	@Override
	public String elegirAtaque() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador, eliga tu ataque:");
        System.out.println("1. Fisura");
        System.out.println("2. Terremoto");
        System.out.println("3. Ataque Base");
        
        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                return "Fisura";
            case 2:
                return "Terremoto";
            case 3:
                return "Ataque Base";
            default:
                System.out.println("Opción inválida, se usará Ataque Base por defecto.");
                return "Ataque base";
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