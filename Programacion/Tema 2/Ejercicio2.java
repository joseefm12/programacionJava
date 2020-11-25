import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el numero A:");
    int a = teclado.nextInt();
    System.out.println("Introduce el numero B:");
    int b = teclado.nextInt();
    int aux = a;
    a = b;
    b = aux;

    System.out.println("A = " + a + "\nb = " + b);




    }
}