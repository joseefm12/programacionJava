import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Te ayudaremos a sacar el porcentaje de los nin@s. \nDime el numero de ninos");
    int ninos = teclado.nextInt();
    System.out.println("Dime el numero de ninas");
    int ninas = teclado.nextInt();
    int total = ninos + ninas;

    double pNinas = ninas * 100 / total; 
    double pNinos = ninos * 100 / total;
    System.out.println("Ninas:" + pNinas + " Por ciento" + "\nNinos:" + pNinos + " Por ciento");
    




    }
}