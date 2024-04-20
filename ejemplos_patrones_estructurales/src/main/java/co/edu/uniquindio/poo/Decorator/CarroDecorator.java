package co.edu.uniquindio.poo.Decorator;

public abstract class CarroDecorator implements CarroInterface {

    protected CarroInterface carroDecorado;

    public CarroDecorator (CarroInterface carroDecorado){
        this. carroDecorado = carroDecorado;
    }

    @Override
    public void abrirPuerta(Carro carro){
        this.carroDecorado.abrirPuerta(carro);
    }
}