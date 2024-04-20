package co.edu.uniquindio.poo.Adapter;

/**
 * Hello world!
 *
 */
public class App {
    public void manejarCarroGasolina(){
        Carro carro = new CarroGasolina() ;
        carro.encender();
        carro.acelerar();
        carro.frenar();
        carro.apagar();
        carro.tanquear();
    }
    
    public void manejarCarroElectrico(){
        CarroElectrico carroElectrico = new CarroElectrico();
        Carro carro = new CarroElectricoAdapter(carroElectrico);
        carro.encender();
        carro.acelerar();
        carro.frenar();
        carro.apagar();
        carro.tanquear();
    }

}
