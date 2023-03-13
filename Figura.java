package Figuras;

public class Figura {

    private String color;
    private Integer numLados;

    public Figura(String color, Integer numLados){
        this.color=color;
        this.numLados=numLados;

    }
    public Figura(String color){
        this.color=color;
    }

    public Figura(){}
    
    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setNumLados(Integer numLados){
        this.numLados = numLados;
    }

    public Integer getNumLados(){
        return numLados;
    }
    
    @Override
    public String toString() {
        return "{" +" color='" + getColor() + "'" +", numLados='" + getNumLados() + "'" +"}";
    }

  
}
