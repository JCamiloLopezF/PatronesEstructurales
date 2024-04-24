package co.edu.uniquindio.poo.Composite;

import java.util.ArrayList;

public class Bolsa extends ItemBase{

    public Bolsa(String nombre) {
        super(nombre, 0);
        items = new ArrayList<>();
    }

    @Override
    public void agregar(ItemBase itemBase) {
        items.add(itemBase);
    }

    @Override
    public void eliminar(ItemBase itemBase) {
        items.remove(itemBase);
    }

    @Override
    public int getValor() {
        int resultado = valor;
        for (ItemBase item: items)
            resultado += item.getValor();
        return resultado;
    }
}


