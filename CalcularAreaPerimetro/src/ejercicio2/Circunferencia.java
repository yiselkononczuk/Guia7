
package ejercicio2;

import static java.util.Locale.US;
import java.util.Scanner;

/**
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class Circunferencia {
    
    private double radio; 
  //constructor por parametro (A)  
    
 public Circunferencia (){
     
 }   
 public Circunferencia (double radio){
     
 } 
// (B)
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //(C)
    public void solicitarDato(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        System.out.println("Ingrese el radio de la circunferencia");
        this.setRadio(leer.nextDouble());
    }
    //(D)
    public double calcularArea(){
        double area=  3.14 * this.getRadio(); // buscar como escribir el valor de piii..
        return area;       
    }
    //(E)
    public double calcularPerimetro(){
        double perimetro= 2 * 3.14 * this.getRadio(); // agregar ell valor de pii.
        return perimetro;
    }
 
 
 
}
