package base;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
   public double area(){
       return Math.PI*Math.pow(radio, 2);
   }
   public double perimetro(){
       return Math.PI*radio*2;
   }

    @Override
    public String toString() {
        return String.format("%s%.4f%n%s%.4f%n", "Area: ",area(),"Perimetro: ",perimetro());
    }
   
   
}
