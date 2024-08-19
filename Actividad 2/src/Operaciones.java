import java.util.Scanner;

public class Operaciones {

   public static double calcOperaciones(int num1, int num2, String operador) {
            switch (operador) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 != 0) {
                        return (double) num1 / num2;
                    } else {
                        System.out.println("Error ( División por cero )");
                        return Double.NaN;
                    }
                case "%":
                    if (num2 != 0) {
                        return num1 % num2;
                    } else {
                        System.out.println("Error ( División por cero )");
                        return Double.NaN;
                    }
                case "**":
                    return Math.pow(num1, num2);
                default:
                    System.out.println("Operador no válido.");
                    return Double.NaN;
            }
        }

        public static void operando() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Ingrese un operador (+, -, *, /, %, **): ");
            String operador = scanner.next();

            double resultado = calcOperaciones(num1, num2, operador);

            System.out.println("Resultado: " + resultado);
        }


}
