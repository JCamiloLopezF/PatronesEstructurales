package co.edu.uniquindio.poo.Bridge;

public class Main {
    public static void main(String[] args) {
        Habilidad hCurar = new HabilidadCurar();
        Atuendo aArmadura = new AtuendoArmadura();
        ColorDePelo cRubio = new ColorDePeloRubio();

        Personaje personaje1 = new PersonajePersonalizado(cRubio, aArmadura, hCurar);
        personaje1.personalizar();
    }
}
