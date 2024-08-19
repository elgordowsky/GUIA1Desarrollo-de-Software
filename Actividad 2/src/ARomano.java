import java.util.Scanner;

public class ARomano {

        // Función para convertir decenas a números romanos
        public static String DecenasARomano(int decenas) {
            String[] numerosRomanosd = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String resultado = "";

            if (decenas > 0 && decenas <= 9) {
                resultado = numerosRomanosd[decenas - 1];
            }

            return resultado;
        }

        // Función para convertir unidades a números romanos
        public static String UnidadesARomano(int unidades) {
            String[] numerosRomanosU = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String resultado = "";

            if (unidades > 0 && unidades <= 9) {
                resultado = numerosRomanosU[unidades - 1];
            }

            return resultado;
        }

        // Función principal para convertir un número entre 1 y 99 a números romanos
        public static String convertirNumeroARomano(int numero) {
            if (numero < 1 || numero > 99) {
                return "Error: El número debe estar entre 1 y 99.";
            }

            int decenas = numero / 10;   // Obtener decenas
            int unidades = numero % 10;  // Obtener unidades

            String romanoDecenas = DecenasARomano(decenas);
            String romanoUnidades = UnidadesARomano(unidades);

            return romanoDecenas + romanoUnidades;
        }

        public static void convRomano() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero entre 1 y 99: ");
            int numero = scanner.nextInt();

            String resultado = convertirNumeroARomano(numero);
            System.out.println("El número " + numero + " en números romanos es: " + resultado);

            scanner.close();

        }


}
