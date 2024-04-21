package co.edu.uniquindio.poo.Decorator;

public class LlantasDecorator extends CarroDecorator {
    
    public LlantasDecorator(CarroInterface carroDecorado){
        super(carroDecorado);
    }

    @Override 
    public void abrirPuerta(Carro carro){
        carroDecorado.abrirPuerta(carro);
        cambiarLlantas(carro);
    }

    public void cambiarLlantas (Carro carro){
        System.out.println("Se cambiaron las llantas al carro");
    }
}
