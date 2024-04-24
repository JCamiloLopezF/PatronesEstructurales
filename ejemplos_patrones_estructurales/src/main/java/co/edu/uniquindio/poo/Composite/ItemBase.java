package co.edu.uniquindio.poo.Composite;

import java.util.List;

public abstract class ItemBase {
 
    protected String nombre;
    protected int valor;
    protected List<ItemBase> items;

    public ItemBase(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public abstract void agregar(ItemBase itemBase);
    public abstract void eliminar(ItemBase itemBase);
    public abstract int getValor();
}

