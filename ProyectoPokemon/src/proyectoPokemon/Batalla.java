package proyectoPokemon;

public class Batalla {

    private Pokemon p1;
    private Pokemon p2;

    public Batalla(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciarBatalla() {
        System.out.println("Comienza la batalla entre " + p1.getNombre() + " y " + p2.getNombre());
        
        boolean turnoP1 = true; // Alterna los turnos
        while (p1.estaVivo() && p2.estaVivo()) {
            if (turnoP1) {
                turno(p1, p2);
            } else {
                turno(p2, p1);
            }
            turnoP1 = !turnoP1; // Alterna el turno
        }

        // Determina el ganador
        if (p1.estaVivo()) {
            System.out.println(p1.getNombre() + " ha ganado la batalla!");
            p1.ganarExperiencia(100);
            p2.ganarExperiencia(50);
        } else {
            System.out.println(p2.getNombre() + " ha ganado la batalla!");
            p2.ganarExperiencia(100);
            p1.ganarExperiencia(50);
        }
    }

    // Ejecuta un turno de ataque de un Pokémon hacia su oponente
    private void turno(Pokemon atacante, Pokemon defensor) {
        atacante.atacar(defensor, atacante.elegirAtaque());
        if (!defensor.estaVivo()) {
            System.out.println(defensor.getNombre() + " ha sido derrotado.");
        }
    }
}
