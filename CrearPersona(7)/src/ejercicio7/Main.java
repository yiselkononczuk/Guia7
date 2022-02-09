package ejercicio7;

public class Main {

    /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.*/
    public static void main(String[] args) {

        System.out.println("Persona1");
        Persona persona1 = new Persona();
        persona1.crearPersona();

        System.out.println("Persona2");
        Persona persona2 = new Persona();
        persona2.crearPersona();

        System.out.println("Persona3");
        Persona persona3 = new Persona();
        persona3.crearPersona();

        System.out.println("Persona4");
        Persona persona4 = new Persona();
        persona4.crearPersona();
        //contadores
        int contMayorEdad = 0;
        int contMenorEdad=0;
        int contPesoOk = 0;
        int contPesoBajo = 0;
        int contPesoElevado = 0;
        int imc;
        
        System.out.println("****Persona1****");
        imc = persona1.calcularIMC();
        switch (imc) {
            case -1:
                contPesoBajo = contPesoBajo + 1;
                break;
            case 0:
                contPesoOk = contPesoOk + 1;
                break;
            case 1:
                contPesoElevado = contPesoElevado + 1;
        }
        
        if (persona1.esMayorDeEdad() == true) {
            System.out.println("La persona es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        }

        System.out.println("****Persona2****");
        imc = persona2.calcularIMC();
        switch (imc) {
            case -1:
                contPesoBajo = contPesoBajo + 1;
                break;
            case 0:
                contPesoOk = contPesoOk + 1;
                break;
            case 1:
                contPesoElevado = contPesoElevado + 1;
                break; 
        }
                
        if (persona2.esMayorDeEdad() == true) {
            System.out.println("La persona es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        }

        System.out.println("****Persona3****");
        imc= persona3.calcularIMC();
        switch (imc) {
            case -1:
                contPesoBajo = contPesoBajo + 1;
                break;
            case 0:
                contPesoOk = contPesoOk + 1;
                break;
            case 1:
                contPesoElevado = contPesoElevado + 1;
                break;
        }
        if (persona3.esMayorDeEdad() == true) {
            System.out.println("La persona es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        }

        System.out.println("****Persona4****");
        imc= persona4.calcularIMC();
        switch (imc) {
            case -1:
                contPesoBajo = contPesoBajo + 1;
                break;
            case 0:
                contPesoOk = contPesoOk + 1;
                break;
            case 1:
                contPesoElevado = contPesoElevado + 1;
                break;
        }
        if (persona4.esMayorDeEdad() == true) {
            System.out.println("La persona es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        }
        System.out.println("***************************************");
        System.out.println("Hay " + contMayorEdad + " mayor de edad");
        System.out.println("***************************************");
   
        
        System.out.println("la cantidad de personas en peso ideal: " + contPesoOk);
        System.out.println("la cantidad de personas en peso bajo: " + contPesoBajo);
        System.out.println("la cantidad de personas en peso elevado: " + contPesoElevado);
        System.out.println("***************************************");
        System.out.println("El porcentaje de personas con un peso ideal es: " + (contPesoOk * 100 / 4)+ " %");
        System.out.println("El porcentaje de personas con un peso bajo  es: " + (contPesoBajo * 100 / 4) + " %");
        System.out.println("El porcentaje de personas con un peso elevado es: " + (contPesoElevado * 100 / 4)+" %");
        System.out.println("*********************************************");
        contMenorEdad= (4 - contMayorEdad);
        System.out.println("El porcentaje de personas mayor de edad es: " + (contMayorEdad * 100 /4)+ " % y menor de edad: " + (contMenorEdad * 100 / 4) + " %");
        
    }
        }
    


  