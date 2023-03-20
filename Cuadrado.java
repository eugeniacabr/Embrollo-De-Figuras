package Figuras;

public class Cuadrado extends Figura {
    
    private Float lado;

    public Cuadrado() { 
    }

    public Cuadrado(String color, Float lado) {
        super(color, 4);
        this.lado = lado;
    }

    public Float getLado() {
        return this.lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }

    @Override
    public Float calcularArea() {
        // TODO Auto-generated method stub
        return null;
    }

}