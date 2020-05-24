package base;


public class UF5_A01_Pau_SaltóMestre {

    public static void main(String[] args) {
            double radio = aleatorio();
            System.out.println(radio);
            Circulo circulo1 = new Circulo(radio);
            System.out.println(circulo1.area()+ "\n" +circulo1.perimetro());
        
    }
    public static double aleatorio(){
        return Math.random();
    }

}
