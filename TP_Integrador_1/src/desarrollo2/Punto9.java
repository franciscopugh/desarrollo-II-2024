package desarrollo2;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = lectura.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double numero2 = lectura.nextDouble();

        lectura.close();

        double resultado = numero1 + numero2;
        System.out.println("La suma entre los dos numeros es: " + resultado);

    }

}
