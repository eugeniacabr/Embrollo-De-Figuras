package Figuras;

public class Cuadrado extends Figura {
    

    private double lado;
   

    public Cuadrado(String color, double lado){
        super(color, 4);
        this.lado=lado;
    }

    public void setLado(double lado){
        this.lado=lado;
    }
    public double getLado(){
        return lado;}
        
    @Override
    public String toString() {
        return "{" +
                " color='" + getColor() + "'" +
                " lado='" + getLado() + "'" +
                ", figura='" + getClass().getName() + "'" +
            "}";
    }
}


