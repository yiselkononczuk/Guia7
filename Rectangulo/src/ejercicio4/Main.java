
package ejercicio4;

public class Main {

    public static void main(String[] args) {
      
        Rectangulo rectangulo= new Rectangulo();
        rectangulo.solicitarMedidas();
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
        System.out.println("La superficie del rectangulo es: " + rectangulo.calcularSuperficie());
        
        rectangulo.dibujarRectangulo();
        
                
    }
    
}
