package Figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(){


    }

    public Triangulo(String color, double base, double altura){
        super(color, 3);
        this.base=base;
        this.altura=altura;
    }

    public void setBase(double base){
        this.base=base;
    }

    public void setAltura(double altura){
        this.altura=altura;}
    
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;}
        
        @Override
        public String toString() {
            return "{" +
                " color='" + getColor() + "'" +
                " base='" + getBase() + "'" +
                ", altura='" + getAltura() + "'" +
                "}";
        }
}
