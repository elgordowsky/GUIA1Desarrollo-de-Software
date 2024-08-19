import java.util.Scanner;

public class ElMayor {

    public static int numMayor(int a, int b) {
        int mayor = 0;
        if (a > b) {
            mayor = a;
            System.out.println("Elmayor  "+mayor);
            return mayor;
        }else if (b > a) {
            mayor = b;
            System.out.println("Elmayor  "+mayor);
            return mayor;
        }else
            System.out.println("Son iguales");
            return 0;
    }
    public static void elNumeroMayor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Usar la función para encontrar el mayor de los dos números
        int mayor = numMayor(numero1, numero2);
        scanner.close();
    }

}
