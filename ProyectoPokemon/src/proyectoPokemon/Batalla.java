package proyectoPokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            registrarBatalla(p1.getNombre(), p2.getNombre(), p1.getNombre(), 100, 50);
        } else {
            System.out.println(p2.getNombre() + " ha ganado la batalla!");
            p2.ganarExperiencia(100);
            p1.ganarExperiencia(50);
            registrarBatalla(p1.getNombre(), p2.getNombre(), p2.getNombre(), 50, 100);
        }
    }

    // Ejecuta un turno de ataque de un Pokémon hacia su oponente
    private void turno(Pokemon atacante, Pokemon defensor) {
        atacante.atacar(defensor, atacante.elegirAtaque());
        if (!defensor.estaVivo()) {
            System.out.println(defensor.getNombre() + " ha sido derrotado.");
        }
    }
    
    // Registra los resultados de la batalla en la base de datos
    private void registrarBatalla(String nombreP1, String nombreP2, String ganador, int expP1, int expP2) {
        String insertSQL = "INSERT INTO batallas (nombre_pokemon1, nombre_pokemon2, ganador, experiencia_ganada_p1, experiencia_ganada_p2) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, nombreP1);
            pstmt.setString(2, nombreP2);
            pstmt.setString(3, ganador);
            pstmt.setInt(4, expP1);
            pstmt.setInt(5, expP2);
            pstmt.executeUpdate();
            System.out.println("La batalla ha sido registrada en la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
