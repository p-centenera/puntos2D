package aplicacion;
import dominio.Punto2D;
public class Principal {

    public static void main(String [] args){
        Punto2D p1= new Punto2D(1,5);
        Punto2D p2=new Punto2D();

        System.out.println("Punto1: "+p1);
        System.out.println("Punto2: "+p2);
        System.out.println("Distancia: "+p1.distancia(p2));



    }

}
