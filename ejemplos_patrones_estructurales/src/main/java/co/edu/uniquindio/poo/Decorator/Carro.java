package co.edu.uniquindio.poo.Decorator;

public class Carro {

private String placa;
private String color;
private boolean pegatinas;

public Carro(String placa, String color, boolean pegatinas) {
    this.placa = placa;
    this.color = color;
    this.pegatinas = pegatinas;
}

public String getPlaca() {
    return placa;
}

public String getColor() {
    return color;
}

public boolean isPegatinas() {
    return pegatinas;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public void setColor(String color) {
    this.color = color;
}

public void setPegatinas(boolean pegatinas) {
    this.pegatinas = pegatinas;
} 

}