package ejercicio4;

import static java.util.Locale.US;
import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private double base;
    private double altura;
//constructor vacio

    public Rectangulo() {

    }
//constructor parametrizado

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//get & set

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
// metodos 

    public void solicitarMedidas() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);

        System.out.println("Ingrese los daatos para modelar el rectángulo");
        System.out.println("Ingrese la base");
        this.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura");
        this.setAltura(leer.nextDouble());

    }

    public double calcularSuperficie() {

     double superficie = this.getBase() * this.getAltura();
     return superficie;
    }

    public double calcularPerimetro() {
    double perimetro = (this.getBase() + this.getAltura()) * 2 ; 
    return perimetro; 
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < this.getAltura(); i++) {
            for (int j = 0; j < this.getBase(); j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
