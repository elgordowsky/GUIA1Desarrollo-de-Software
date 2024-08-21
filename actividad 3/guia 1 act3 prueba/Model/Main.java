import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        while (true) {
            System.out.println("\nIngrese un numero para continuar\n 1.entrada\n2.salida vehiculo\n3.salir programa\n:");
            int comando = scanner.nextInt();
            scanner.nextLine();

            if (comando == 3) {
                System.out.println("Saliendo del programa.");
                break;
            } else if (comando == 1) {
                System.out.println("Ingrese la placa del vehículo:");
                String placa = scanner.nextLine();

                System.out.println("Ingrese la marca del vehículo:");
                String marca = scanner.nextLine();

                System.out.println("Ingrese el modelo del vehículo:");
                String modelo = scanner.nextLine();

                System.out.println("Ingrese el tipo de vehículo (automovil/motocicleta/camion):");
                String tipo = scanner.nextLine().toLowerCase();

                Vehiculo vehiculo;
                switch (tipo) {
                    case "automovil":
                        System.out.println("Ingrese el tipo de combustible:");
                        String tipoCombustible = scanner.nextLine();
                        vehiculo = new Automovil(placa, marca, modelo, tipo, tipoCombustible);
                        break;
                    case "motocicleta":
                        System.out.println("Ingrese el cilindraje:");
                        int cilindraje = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        vehiculo = new Motocicleta(placa, marca, modelo, tipo, cilindraje);
                        break;
                    case "camion":
                        System.out.println("Ingrese la capacidad de carga:");
                        double capacidadCarga = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar el buffer
                        vehiculo = new Camion(placa, marca, modelo, tipo, capacidadCarga);
                        break;
                    default:
                        System.out.println("Tipo de vehículo no reconocido.");
                        continue;
                }
                parqueadero.registrarEntrada(vehiculo);
            } else if (comando==2) {
                System.out.println("Ingrese la placa del vehículo:");
                String placa = scanner.nextLine();
                parqueadero.registrarSalida(placa);
            } else {
                System.out.println("Comando no reconocido.");
            }
        }

        scanner.close();
    }
}
