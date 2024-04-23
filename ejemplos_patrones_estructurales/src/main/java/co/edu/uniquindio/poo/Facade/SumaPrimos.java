package co.edu.uniquindio.poo.Facade;

public class SumaPrimos implements PrimosInterface {
    private int numero1;
    private int numero2;

    public SumaPrimos(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }



    @Override
    public boolean comprobrarPrimos(int a) {
            if (a < 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
    }

    public int SumarPrimos(int numero1, int numero2){
        if (comprobrarPrimos(numero1) == true && comprobrarPrimos(numero2) == true){
            return numero1 + numero2;
        }
        else{
            throw new IllegalArgumentException("Al menos uno de los números no es primo");
        }
    }
}
