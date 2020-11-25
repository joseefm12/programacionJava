import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el valor de x");
    double x = teclado.nextDouble();
    System.out.println("Introduce el valor de y");
    double y = teclado.nextDouble();

    double elevado_a2 = Math.pow(x, 2);
    double elevado_a3 = Math.pow(x, 3);
    double z = (1+(elevado_a2 / y)) / (elevado_a3 / (1 + y)) ;

    System.out.printf("El resultado es: %f", z);
    
   

    
    }
}
