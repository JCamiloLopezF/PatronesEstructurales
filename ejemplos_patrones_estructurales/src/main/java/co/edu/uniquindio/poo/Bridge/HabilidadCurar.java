package co.edu.uniquindio.poo.Bridge;

public class HabilidadCurar implements Habilidad{
    
    @Override
    public void ejecutar() {
        System.out.println("Habilidad: Curación");
    }
}
