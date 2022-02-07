package ejercicio1;

import static java.util.Locale.US;
import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas.
 */
public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numPag;

//CONSTRUCTOR VACIO
    public Libro() {
    }
//CONSTRUCTOR PARAMETRIZADO

    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.autor = autor;
        this.isbn = isbn;
        this.numPag = numPag;
        this.titulo = titulo;

    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return this.numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    //METODO PARA SOLICITAR DATOS AL USUARIO
    public void solicitarDatos() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);

        System.out.println("Ingrese los datos");
        System.out.println("nombre del Libro: ");
        this.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor:");
        this.setAutor(leer.nextLine());
        System.out.println("ISBN: ");
        this.setIsbn(leer.nextInt());

        System.out.println("Número de paginas");
        this.setNumPag(leer.nextInt());

    }

    public void mostrarDatos() {
        System.out.println("EL LIBRO SE LLAMA: " + this.getTitulo() + " Su ISBN es: " + this.getIsbn() + " la página a buscar es: " + this.getNumPag() + " Dicho relato pertenece al autor: " + this.getAutor());
    }

}
