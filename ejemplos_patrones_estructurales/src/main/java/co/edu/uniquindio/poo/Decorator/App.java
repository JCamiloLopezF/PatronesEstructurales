package co.edu.uniquindio.poo.Decorator;
/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("WSA234", "Verde", false);

        CarroInterface carroDeportivo = new CarroDeportivo();
        CarroInterface carroDeporConVidrios = new VidrioDecorator(carroDeportivo);

        carroDeporConVidrios.abrirPuerta(carro);
    }
}
