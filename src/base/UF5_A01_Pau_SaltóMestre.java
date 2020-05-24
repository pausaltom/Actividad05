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
                radio = aleatorio();

                listaRadios.add(radio);
                Circulo circulo1 = new Circulo(radio);
                listaCirculos.add(circulo1);

            } while (radio >= 0.01);


           
            
            for (Circulo lista : listaCirculos) {
               
                System.out.println(lista.toString());
                
            }

            

        

    }

    public static double aleatorio() {
        return Math.random();
    }

}
