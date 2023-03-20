
package Figuras;

public class Circunferencia extends Figura {
    private Float radio;


    public Circunferencia() {
    }

    public Circunferencia(String color, Float radio) {
        super(color);
        this.radio = radio;
    }

    public Float getRadio() {
        return this.radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }
    //--------------
    
    public Float calcularArea(){
        // TODO Auto-generated method stub
        return null;
    }

}
