
package ejercicio3;

public class Main {
    
    public static void main(String[] args) {
    
        Operacion operacion= new Operacion();
        operacion.crearOperación();
        System.out.println("La suma de los dos numeros es: " + operacion.sumar());
        System.out.println("La resta entre los dos numeros es: " + operacion.restar());
        System.out.println("La multiplicación entre los dos numeros es: " + operacion.multiplicar());
        System.out.println("La división de los dos numeros es: " + operacion.dividir());
    }
    
}
