package co.edu.uniquindio.poo.Decorator;
/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("WSA234", "Verde");

        CarroInterface carroDeportivo = new CarroDeportivo();
        CarroInterface carroDeporConVidrios = new VidrioDecorator(carroDeportivo);
        CarroInterface carroDeporPintadoConVidrios = new PinturaDecorator(carroDeporConVidrios);

        carroDeporPintadoConVidrios.abrirPuerta(carro);

        Carro carro2 = new Carro("HDT764", "Blanco");

        CarroInterface carroOffRoad = new CarroOffRoad();
        CarroInterface carroOffRoadLlantas = new LlantasDecorator(carroOffRoad);

        carroOffRoadLlantas.abrirPuerta(carro2);
    }
}
