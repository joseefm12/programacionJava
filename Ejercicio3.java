import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Vamos a calcular con dos numeros \nIntroduce un numero:");
    int x = teclado.nextInt();
    System.out.println("Introduce otro numero");
    int y = teclado.nextInt();

    int suma = x + y;
    int resta = x - y;
    int mult = x * y;
    int div = x / y;
    int resto = x % y;
    
    System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + mult + "\nDivision: " + div + "\nResto: " + resto);


    }
}