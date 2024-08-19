public class Sueldo {

    public static double gastoArriendo(double sueldo){

        double gasto1 = sueldo * 0.40;
        System.out.println(gasto1);
        return gasto1;

    }

    public static double gastoComida(double sueldo){

        double gasto2 = sueldo * 0.15;
        return gasto2;
    }

    public static double balance(double sueldo){

        double x = gastoArriendo(sueldo);
        double y = gastoComida(sueldo);
        double z = x + y ;
        double m = sueldo-z;

        System.out.println("sueldo: "+ sueldo + "\ngasto arriendo: "+ gastoArriendo(sueldo) + "\ngasto comida: "+ gastoComida(sueldo) + "\nsobrante de pedro: " + m );
        return m;
    }

}
