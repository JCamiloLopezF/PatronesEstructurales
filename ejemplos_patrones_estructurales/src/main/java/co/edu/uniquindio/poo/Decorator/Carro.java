package co.edu.uniquindio.poo.Decorator;

public class Carro {

private String placa;
private String color;


public Carro(String placa, String color) {
    this.placa = placa;
    this.color = color;
}

public String getPlaca() {
    return placa;
}

public String getColor() {
    return color;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public void setColor(String color) {
    this.color = color;
}

}