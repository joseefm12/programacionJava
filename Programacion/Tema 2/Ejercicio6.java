import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Nota del primer examen");
    double nota1 = teclado.nextDouble();
    System.out.println("Dime la nota que quieres sacar");
    double notaFinal = teclado.nextDouble();
    double nota2 = ((notaFinal * 100) - (nota1 * 40))/60;
    if(nota2 <= 10 && nota2 >= 0){
    System.out.println("La nota que tienes que sacar en el siguiente examen es:" + nota2);
    }else{System.out.println("La nota no es correcta");

    }
    
    }
}
