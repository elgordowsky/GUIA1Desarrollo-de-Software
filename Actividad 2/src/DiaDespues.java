import java.util.Scanner;

public class DiaDespues {

    public static String elDia(String dia) {

        switch (dia) {
            case "lunes":
                return "martes";
            case "martes":
                 return "miercoles";
            case "miercoles":
                 return "jueves";
            case "jueves":
                  return "viernes";
            case "viernes":
                  return "sabado";
            case "sabado":
                  return "domingo";
            case "domingo":
                  return "lunes";
            default:
                  return "texto no valido";
        }
    }

    public static void mañana() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escoge un dia de la semana");
        String undia = scanner.nextLine();

        String manana = elDia(undia);
        System.out.println("Mañana es: " +manana);

        scanner.close();
    }

}
