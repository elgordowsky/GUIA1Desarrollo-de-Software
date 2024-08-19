import java.util.Scanner;

public class Hermanos {

    public static String hermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        String nombreElMayor = nombre1;
        int mayorEdad = edad1;

        if (edad2 > mayorEdad) {
            nombreElMayor = nombre2;
            mayorEdad = edad2;
        }

        if (edad3 > mayorEdad) {
            nombreElMayor = nombre3;
        }

        return nombreElMayor;
    }

    public static void elMasGrande() {

        Scanner sc = new Scanner(System.in);

        // Leer los nombres y edades de los  hermanos
        System.out.print("Ingrese  nombre del primer hermano: ");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese edad del primer hermano: ");
        int edad1 = sc.nextInt();
        sc.nextLine(); // Limpiar buffer de entrada

        System.out.print("Ingrese nombre del segundo hermano: ");
        String nombre2 = sc.nextLine();
        System.out.print("Ingrese  edad del segundo hermano: ");
        int edad2 = sc.nextInt();
        sc.nextLine(); // Limpiar buffer de entrada

        System.out.print("Ingrese  nombre del tercer hermano: ");
        String nombre3 = sc.nextLine();
        System.out.print("Ingrese  edad del tercer hermano: ");
        int edad3 = sc.nextInt();

        String elHermanoMayor = hermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

        System.out.println("El hermano mayor es: " + elHermanoMayor);

        sc.close();
    }
}
