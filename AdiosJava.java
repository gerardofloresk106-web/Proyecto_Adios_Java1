import java.util.Scanner;

public class AdiosJava {
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; // Retorna 0 o podrías lanzar una excepción
        }
    }
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
        scanner.close();
    }
    //Metodo para restar dos números
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }
}

class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}