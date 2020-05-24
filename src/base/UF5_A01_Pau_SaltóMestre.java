package base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class UF5_A01_Pau_SaltóMestre {

    private static ArrayList<Double> listaRadios = new ArrayList<Double>();
    private static ArrayList<Circulo> listaCirculos = new ArrayList<Circulo>();
    private static Scanner leerScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sino = 0;
        double radio;

        do {
            do {
                radio = aleatorio();

                listaRadios.add(radio);
                Circulo circulo1 = new Circulo(radio);
                listaCirculos.add(circulo1);

            } while (radio >= 0.01);

            System.out.println("De que manera desea ordenar los circulos: "
                    + "\n 1-ascendente \n 2-descendente");
            var respuesta = leerScanner.nextInt();

            switch (respuesta) {
                case 1:
                    listaCirculos.sort(Comparator.comparingDouble(Circulo::getRadio));
                    break;
                case 2:
                    listaCirculos.sort(Comparator.comparingDouble(Circulo::getRadio).reversed());
                    break;

            }
            int c = 0;
            for (Circulo lista : listaCirculos) {
                System.out.println("Circulo " + c + " :");
                System.out.println(lista.toString());
                c++;
            }

            System.out.println("Desea continuar: \n 1-si \n 2-no");
            sino = leerScanner.nextInt();

        } while (sino == 1);

    }

    public static double aleatorio() {
        return Math.random();
    }

}
