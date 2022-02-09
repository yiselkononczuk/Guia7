package ejercicio7;

import static java.util.Locale.US;
import java.util.Scanner;

public class Persona {

    /* 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.*/
    private String nombre;
    private byte edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, byte edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return this.edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase();
        System.out.println("--" + this.sexo);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        System.out.println("Nombre:");
        this.setNombre(leer.nextLine());
        System.out.println("Sexo : H-M-O(otro)");
        this.setSexo(leer.nextLine());
        boolean bandera = true;
        do {
            if (this.getSexo().equals("H") || this.getSexo().equals("M") || this.getSexo().equals("O")) {
                bandera = true;
            } else {
                System.out.println("Ingrese una opcion correcta ");
                this.setSexo(leer.nextLine());
                bandera = false;
            }
        } while (bandera == false);
        
        
        System.out.println("Edad");
        this.setEdad(leer.nextByte());
        System.out.println("Altura");
        this.setAltura(leer.nextDouble());
        System.out.println("Peso");
        this.setPeso(leer.nextDouble());
       

    }

    public int calcularIMC() {
        double calculo = (this.peso / Math.pow(this.altura, 2));

        if (calculo < 20) {
            System.out.println("El peso se encuentra por debajo del peso ideal");
            return -1;
        } else if (calculo >= 20 && calculo <= 25) {
            System.out.println("El peso esta en los rangos correcto");
            return 0;
        } else {
            System.out.println("El peso esta fuera de sus valores normales");
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }
}
