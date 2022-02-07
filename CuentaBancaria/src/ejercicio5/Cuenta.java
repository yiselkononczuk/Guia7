package ejercicio5;

import static java.util.Locale.US;
import java.util.Scanner;

/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.

• Agregar los métodos getters y setters correspondientes

• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.

• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.

• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.

• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Cuenta {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return this.dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = this.saldoActual + saldoActual;
    }

    public void solicitarDatos() {

        System.out.println("*****LOGIN****");
        System.out.println("Ingrese su numero de de cuenta");
        this.setNumeroCuenta(this.leer.nextInt());
        System.out.println("Ingrese su DNI: ");
        this.setDniCliente(this.leer.nextLong());
    }

    public void ingresarDinero(double pesosIngresar) {
        this.setSaldoActual(pesosIngresar); // esto suma, xq en el set suma, esta la operación. 
    }

    public boolean retirarDinero(double pesosRetirar) {

        if (this.getSaldoActual() < pesosRetirar) {
            return false;
        } else {
            this.saldoActual = this.saldoActual - pesosRetirar;
            return true;
        }
    }

    public boolean extraccionRapida(double montoRetirarExpress) {
        double retiroExpress = (this.getSaldoActual() * 20 / 100);
        if (montoRetirarExpress > retiroExpress) {
            return false;
        }
        else {
         this.retirarDinero(montoRetirarExpress);   
        return true;
    }      
}
  
    public void consultarSaldo(){
        System.out.println("El saldo actual es: " + this.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("DATOS DE LA CUENTA BANCARIA");
        System.out.println("Número de cuenta: " + this.getNumeroCuenta());
        System.out.println("Número de DNI: " + this.getDniCliente());
        System.out.println("El monto actual de la cuenta es: " + this.getSaldoActual());
    }
}
