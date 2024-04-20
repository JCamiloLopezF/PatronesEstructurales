package co.edu.uniquindio.poo.Decorator;

public class VidrioDecorator extends CarroDecorator{

    public VidrioDecorator(CarroInterface carroDecorado){
        super(carroDecorado);
    }

    @Override 
    public void abrirPuerta(Carro carro){
        carroDecorado.abrirPuerta(carro);
        cambiarVidrios(carro);
    }

    public void cambiarVidrios (Carro carro){
        System.out.println("Se cambiaron los vidrios al carro");
    }
}