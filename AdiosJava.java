public class AdiosJava {
    public static void main(String[] args) {
        //System.out.println("Adios, Java!");
        //System.out.println("comenzaremos a usar python");

        int numero1, numero2;
        Scanner scanner = new Scanner();
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);


    

    }
}