package co.edu.uniquindio.poo.Facade;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero2 = input2.nextInt();

        FachadaPrimos fachada = new FachadaPrimos();

        int suma = fachada.sumar(numero1, numero2);
        System.out.println("El resultado de la suma es:" + suma);
        int resta = fachada.restar(numero1, numero2);
        System.out.println("El resultado de la suma es:"+ resta );
        int multiplicacion = fachada.multiplicar(numero1, numero2);
        System.out.println("El resultado de la multiplicación es:" + multiplicacion);
    }
}
