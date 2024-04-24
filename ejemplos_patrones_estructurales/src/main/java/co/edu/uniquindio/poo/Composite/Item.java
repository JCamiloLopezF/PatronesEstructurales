package co.edu.uniquindio.poo.Composite;

public class Item extends ItemBase {
   

    public Item(String nombre, int valor) {
        super(nombre, valor);
    }

    @Override
    public void agregar(ItemBase itemBase) {
        System.out.println("no se puede agregar item");
    }

    @Override
    public void eliminar(ItemBase itemBase) {
        System.out.println("no hay items que eliminar");
    }

    @Override
    public int getValor() {
        return valor;
    }
}

