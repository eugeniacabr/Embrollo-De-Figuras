package Figuras;



public class Proyect1 {
    public static void main(String[] args) {
        Figura nuevaFigura = new Figura();

        nuevaFigura.setColor("naranja");
        

    
        if(esTriangulo(nuevaFigura)==true){
            System.out.println("Es un triangulo.");  
        }else if(esCuadrado(nuevaFigura)==true){
            System.out.println("Es un cuadrado.");
        }else{
            System.out.println("No es triangulo ni cuadrado.");
        }
        System.out.println("-----------------------------------");
        Triangulo triangulo= new Triangulo("gris",2.5d,5.6d);
        System.out.println(triangulo.toString());

        
    }

    public static boolean esTriangulo(Figura t) {
        if (t.getNumLados() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esCuadrado(Figura c){
        if (c.getNumLados() == 4){
            return true;
        }else{
            return false;
        }
    }
}
