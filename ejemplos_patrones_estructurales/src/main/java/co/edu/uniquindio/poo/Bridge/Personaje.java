package co.edu.uniquindio.poo.Bridge;

public abstract class Personaje {
    public ColorDePelo colorDePelo;
    public Atuendo atuendo;
    public Habilidad habilidad;

    public Personaje(ColorDePelo colorDePelo, Atuendo atuendo, Habilidad habilidad) {
        this.colorDePelo = colorDePelo;
        this.atuendo = atuendo;
        this.habilidad = habilidad;
    }

    abstract void personalizar();

}