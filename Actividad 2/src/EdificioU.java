import java.util.Scanner;

public class EdificioU {

    public static int numSalones(int estudiantes, int capacidadSalon) {
        int numeroSalones = estudiantes / capacidadSalon;
        if (estudiantes % capacidadSalon != 0) {
            numeroSalones++;
        }
        return numeroSalones;
    }

    public static int numPisos(int numeroSalones, int salonesPiso) {
        int numeroPisos = numeroSalones / salonesPiso;
        if (numeroSalones % salonesPiso != 0) {
            numeroPisos++;
        }
        return numeroPisos;
    }

    public static void calcU() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        int salones = numSalones(estudiantes, capacidadSalon);
        int pisos = numPisos(salones, salonesPorPiso);

        System.out.println("\nResultados para el nuevo edificio:");
        System.out.println("Número de salones necesarios: " + salones);
        System.out.println("Número de pisos necesarios: " + pisos);

        scanner.close();
    }
}