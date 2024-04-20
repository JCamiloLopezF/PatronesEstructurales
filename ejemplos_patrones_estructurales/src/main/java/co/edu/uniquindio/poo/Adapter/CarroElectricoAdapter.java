package co.edu.uniquindio.poo.Adapter;

public class CarroElectricoAdapter extends Carro{
    private CarroElectrico carroElectrico;
    
    public CarroElectricoAdapter(CarroElectrico carroElectrico) {
        super();
        this.carroElectrico = carroElectrico;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
        this.carroElectrico.acelerar();
        }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
        this.carroElectrico.desconectar();
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor");
        this.carroElectrico.desbloquear();
        this.carroElectrico.iniciar();
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
        this.carroElectrico.frenar();
    }

    @Override
    public void recargar() {
        System.out.println("Recargando...");
        this.carroElectrico.conectar();
    }

}
