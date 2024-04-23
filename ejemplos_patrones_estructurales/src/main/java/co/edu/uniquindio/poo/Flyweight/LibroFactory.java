package co.edu.uniquindio.poo.Flyweight;

import java.util.ArrayList;

public class LibroFactory {
    private ArrayList<AutorFlyweight> autores;


    public LibroFactory(AutorFlyweight[] autores) {
        this.autores = new ArrayList<>();
    }

    //Crea el libro
    public Libro crearLibro(String titulo, String nombreAutor, String genero, int numeroPaginas){
        //Busca si hay otro autor con el mismo nombre
        AutorFlyweight autor = getAutorNombre (nombreAutor);

        //Si no hay, lo crea y lo añade a la lista de autores, si ya existe, pues retorna el libro creado con el autor que ya está el la lista
        if(autor == null){
            autor = new AutorFlyweight(nombreAutor);
            autores.add(autor);
        }

        return new Libro(titulo, autor, genero);
    }

    //Valida si hay otro autor con el mismo nombre
    private AutorFlyweight getAutorNombre(String nombreAutor) {
        for(int i = 0; i < autores.size(); i++){
            //Obtiene el autor en la posición i del arraylist
            AutorFlyweight autor = autores.get(i);
            if(autor.getNombre().equals( nombreAutor)){
                return autor;
            }
        }
        return null;
    }
}
