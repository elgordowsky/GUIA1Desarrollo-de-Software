import java.util.Scanner;

public class GenerosaSA {

    public static double calcAumento(double sueldo) {
        double aumento;
        if (sueldo <= 1200000 && sueldo > 800000) {
            aumento = 0.08;
        } else if (sueldo <= 800000) {
            aumento = 0.1;
        }else {
            aumento = 0.05;
        }
        return aumento * sueldo ;

    }

    public static double calcSueldo() {

        Scanner sc = new Scanner(System.in);
        double sueldo;
        System.out.println("Ingrese el valor del sueldo: ");
        sueldo = sc.nextDouble();

        double nuevoAumento = calcAumento(sueldo);
        double nuevoSueldo = nuevoAumento+sueldo;
        System.out.println("El nuevo salario es de: "+nuevoSueldo);
        System.out.println("El aumento es de: " + nuevoAumento);
        sc.close();
        return nuevoAumento;

    }

}
