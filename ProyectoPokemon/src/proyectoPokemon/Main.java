package proyectoPokemon;

public class Main {

	public static void main(String[] args) {
		Blastoise blastoise1 = new Blastoise("Cañoncito", 1, 100, 20, 10, 5, 30, 40);
		Rapidash rapidash1 = new Rapidash("Caballito", 1, 1020, 25, 10, 5, 40, 50);

		blastoise1.ganarExperiencia(100);
		System.out.println(blastoise1.getExperiencia());
		System.out.println(blastoise1.getNivel());
		
		blastoise1.ganarExperiencia(90);
		System.out.println(blastoise1.getExperiencia());
		System.out.println(blastoise1.getNivel());
		
		blastoise1.ganarExperiencia(20);
		System.out.println(blastoise1.getExperiencia());
		System.out.println(blastoise1.getNivel());
		
		rapidash1.infierno(blastoise1);
		rapidash1.ataqueBase(blastoise1);
		rapidash1.ataqueBase(blastoise1);
		rapidash1.infierno(blastoise1);
	}

}
