package demo;

public class Libro
{
    private String titulo;
    private String isbn;
    private String autor;

    @Override
    public String toString() { return titulo + " - " + isbn + " - " + autor; }

    public Libro() {}

    public Libro(String titulo, String isbn, String autor)
    {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }
}





//    Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo
//        debe ser: public String toString(). Este método debe retornar una cadena que
//        represente al objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una
//        cadena que represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling,
//        J. K.”. La clase contendrá un constructor por defecto, un constructor con parámetros y
//        los métodos de acceso.
//        ● Agregar la línea @Override justo arriba del encabezado del método toString. Luego,
//        cambiar el nombre del método por: tostring (todo en minúscula). ¿Qué sucede?
