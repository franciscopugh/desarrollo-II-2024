package proyectoPokemon;

public class Juego {
    public static void main(String[] args) {
        System.out.println("Jugador 1, selecciona tu Pokémon:");
        Pokemon pokemon1 = SeleccionPokemon.seleccionarPokemon();

        System.out.println("Jugador 2, selecciona tu Pokémon:");
        Pokemon pokemon2 = SeleccionPokemon.seleccionarPokemon();

        Batalla batalla = new Batalla(pokemon1, pokemon2);
        batalla.iniciarBatalla();
    }
}
