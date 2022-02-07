package ejercicio2;

public class Main {

    public static void main(String[] args) {

        Circunferencia circunferencia = new Circunferencia();
        circunferencia.solicitarDato();
        System.out.println(" EL AREA ES: ) " + circunferencia.calcularArea()); 
        System.out.println(" EL PERIMETRO ES: " + circunferencia.calcularPerimetro());

    }

}
