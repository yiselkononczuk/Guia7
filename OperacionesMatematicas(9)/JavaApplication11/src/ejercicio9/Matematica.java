
package ejercicio9;

/**
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. 
* 
* En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Matematica {
    private double numero1;
    private double numero2;
    
    public Matematica(){
    }
    
    public Matematica(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        }

    public double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor(){
        return Math.max(this.getNumero1(), this.getNumero2());
    }
    
    public double devolverMenor(){
       return Math.min(this.getNumero1(), this.getNumero2());
    }
   

    public double calcularPotencia(){
        return Math.pow( Math.round(this.devolverMayor()), Math.round(this.devolverMenor()));
    }
    
    public double calcularRaiz(){
        //raiz cuadrada, valor absoluto y redondeo de numero
        return Math.sqrt(Math.abs(Math.round(this.devolverMenor())));
    }

}
