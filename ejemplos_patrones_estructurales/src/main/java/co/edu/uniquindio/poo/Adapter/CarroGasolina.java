package co.edu.uniquindio.poo.Adapter;

public class CarroGasolina extends Carro{

    @Override
    public void encender() {
        System.out.println("Encendiendo el motor...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando gasolina...");
    }

}
