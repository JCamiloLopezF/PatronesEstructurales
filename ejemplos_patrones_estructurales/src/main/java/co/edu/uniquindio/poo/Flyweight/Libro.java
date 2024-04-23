package co.edu.uniquindio.poo.Flyweight;

public class Libro {
    private String titulo;
    private AutorFlyweight autor;
    private String genero;

    //Constructor
    public Libro(String titulo, AutorFlyweight autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    //Getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AutorFlyweight getAutor() {
        return autor;
    }

    public void setAutor(AutorFlyweight autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
