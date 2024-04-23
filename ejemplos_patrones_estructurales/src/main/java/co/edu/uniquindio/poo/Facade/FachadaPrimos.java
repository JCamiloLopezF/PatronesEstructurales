package co.edu.uniquindio.poo.Facade;

public class FachadaPrimos {
    private SumaPrimos suma;
    private RestaPrimos resta;
    private ProductoPrimos multiplicacion;

    public FachadaPrimos(){
        this.suma = new SumaPrimos(0, 0);
        this.resta = new RestaPrimos(0, 0);
        this.multiplicacion = new ProductoPrimos(0, 0);
    }

    public int sumar (int numero1, int numero2){
        return suma.SumarPrimos(numero1, numero2);
    }

    public int restar (int numero1, int numero2){
        return resta.RestarPrimos(numero1, numero2);
    }

    public int multiplicar (int numero1, int numero2){
        return multiplicacion.MultiplicarPrimos(numero1, numero2);
    }
    
}
