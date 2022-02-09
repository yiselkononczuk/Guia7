
package ejercicio9;

public class Main {

    public static void main(String[] args) {
       Matematica matematica= new Matematica(Math.random(), Math.random());

        System.out.println("El valor random 1: " + matematica.getNumero1());
         System.out.println("El valor random 2: " + matematica.getNumero2());
         System.out.println("El mayor valor es: " + matematica.devolverMayor());
         System.out.println("La Potencia del mayor numero elevado al menor es: " + matematica.calcularPotencia());
         System.out.println("La raiz cuadrada del menor numero es: " + matematica.calcularRaiz());
      
    }
}
