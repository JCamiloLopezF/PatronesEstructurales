package co.edu.uniquindio.poo.Decorator;

public class PinturaDecorator extends CarroDecorator {

    public PinturaDecorator(CarroInterface carroDecorado){
        super(carroDecorado);
    }

    @Override 
    public void abrirPuerta(Carro carro){
        carroDecorado.abrirPuerta(carro);
        cambiarPintura(carro);
    }

    public void cambiarPintura (Carro carro){
        System.out.println("Se cambió la pintura al carro");
    }
}
