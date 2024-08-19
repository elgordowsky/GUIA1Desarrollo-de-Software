public class Escalera {

    public static double longEscalera(double altura, double angulo) {

        double calculo = altura / Math.sin(Math.toRadians(angulo));

        System.out.println(calculo);

        return calculo;
    }




}
