import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el numero de euros que quieres convertir.");
    double euros = teclado.nextDouble();
    double pesetas = euros * 166.386;
    System.out.println( euros + "€ = " + pesetas + " pesetas");

    
    




    }
}