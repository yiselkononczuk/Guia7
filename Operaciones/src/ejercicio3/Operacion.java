
package ejercicio3;

import static java.util.Locale.US;
import java.util.Scanner;

/* 
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
*/
public class Operacion {
   
    private int numero1;
    private int numero2; 
    
    public Operacion(){
        
    }
    public Operacion (int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperación(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        
        System.out.println("Ingrese el primer número");
        this.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        this.setNumero2(leer.nextInt());
    }
    
    public int sumar(){
        int suma= numero1 + numero2; 
        return suma;
    }
    
    public int restar(){
        int resta= numero1 - numero2; 
        return resta;
    }
    
    public int multiplicar(){
        if (this.getNumero2()== 0 || this.getNumero1() == 0 ){
            System.out.println(" LA MULTIPLICACIÓN ES 0- SE PRODUJO UN ERROR");
            return 0;
        }
        else {
        int multiplicacion = this.getNumero1() * this.getNumero2(); 
        return multiplicacion; 
        }
    }
    
    public int dividir(){
        if (this.getNumero2()== 0 || this.getNumero1() == 0 ){
            System.out.println(" LA DIVISIÓN ES 0 - SE PRODUJO UN ERROR");
            return 0;
        }
        else {
        int division = this.getNumero1() / this.getNumero2(); 
        return division; 
        }
    }
}
