package ejercicio5;

import static java.util.Locale.US;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        Cuenta cuenta = new Cuenta();

        cuenta.solicitarDatos();
        int menu = 0;
        boolean validacionExtraccion;
        do {
            System.out.println(" MENU ");
            System.out.println("Digite el numero de la operación que sea realizar:");
            System.out.println("1-Ingresar Dinero");
            System.out.println("2-Retiro Express");
            System.out.println("3-Retiro");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar Datos de la cuenta");
            System.out.println("6-Terminar/Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Ingrese el monto de dinero: ");
                    cuenta.ingresarDinero(leer.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar - 20% de su saldo");
                    validacionExtraccion = cuenta.extraccionRapida(leer.nextDouble());

                    if (validacionExtraccion == false) {
                        System.out.println("El monto supera al 20% de su saldo actual");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto de dinero a retirar");
                    validacionExtraccion = cuenta.retirarDinero(leer.nextDouble());
                    
                    if( validacionExtraccion == false){
                        System.out.println("El monto ingresado es mayor a su saldo actual");
                    }
                    break;
                case 4: 
                    cuenta.consultarSaldo();
                    break;
                case 5: 
                    cuenta.consultarDatos();
                    break;
                case 6: 
                    System.out.println("Fin de sesión");
                //:
                   // System.out.println("Ingrese una opcion correcta");
            }

        } while (menu != 6 || menu>=7);

    }

}
