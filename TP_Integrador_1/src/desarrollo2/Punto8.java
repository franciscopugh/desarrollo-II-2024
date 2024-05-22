package desarrollo2;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        double numero = lectura.nextDouble();
        lectura.close();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }

}
