package co.edu.uniquindio.poo.Composite;

public class Main {
    public static void main(String[] args) {
        ItemBase inventario = new Bolsa("inventario");
        ItemBase bolsaMonedas = new Bolsa("bolsa de monedas");
        ItemBase bolsaPosiones = new Bolsa("bolsa de posiones");

        ItemBase monedas = new Item("monedas", 6);
        bolsaMonedas.agregar(monedas);
        ItemBase posionMagica = new Item("posión mágica", 3);
        ItemBase posionCurativa = new Item("posión curativa", 3);
        bolsaPosiones.agregar(posionMagica);
        bolsaPosiones.agregar(posionCurativa);

        ItemBase espada = new Item("espada", 3);
        ItemBase escudo = new Item("escudo", 3);
        ItemBase armadura = new Item("armadura", 3);

        inventario.agregar(bolsaMonedas);
        inventario.agregar(bolsaPosiones);
        inventario.agregar(espada);
        inventario.agregar(escudo);
        inventario.agregar(armadura);

        System.out.println("Valor total del inventario: " + inventario.getValor());
    }
}
