import java.util.Scanner;

public class AdiosJava {
    public static void main(String[] args) {
       
        //System.out.println("Adios, Java!");
        //System.out.println("comenzaremos a usar python");
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        int resta = restar(numero1, numero2);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
    
    }
    public static int restar(int num1, int num2) {
        return num1 - num2;
 }
}