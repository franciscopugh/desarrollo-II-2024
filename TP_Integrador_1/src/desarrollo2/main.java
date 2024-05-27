package desarrollo2;

public class main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", "600", "Blanco", "ABC 123", 5, 4);
        auto1.setModelo("147");
        System.out.println("El modelo del auto es: " + auto1.getModelo());
        System.out.println("El color del auto es: " + auto1.getColor());
        System.out.println("La marca del auto es: " + auto1.getMarca());
        System.out.println("La patente del auto es: " + auto1.getPatente());
        System.out.println("La cantidad de puertas del auto es: " + auto1.getCantPuertas());
        System.out.println("La cantidad de ruedas del auto es: " + auto1.getCantRuedas());
    }
}
