package co.edu.uniquindio.poo.Bridge;

public class PersonajePersonalizado extends Personaje{
    
    PersonajePersonalizado(ColorDePelo colorDePelo, Atuendo atuendo, Habilidad habilidad){
        super(colorDePelo, atuendo, habilidad);
    }

    @Override
    void personalizar() {
        System.out.println("Personaje creado correctamente con:");
        atuendo.cambiarAtuendo();
        colorDePelo.cambiarColor();
        habilidad.ejecutar();
    }
}
