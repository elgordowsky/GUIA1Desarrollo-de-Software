public class AreaCirculo {

    public static double aCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double coronaCirculo(double radio1, double radio2) {
        if (radio1 == radio2){
            return 0.0;
        }else if (radio1 > radio2) {
            System.out.println("El area de la corona circular es: " + (aCirculo(radio1) - aCirculo(radio2)));
            return aCirculo(radio1) - aCirculo(radio2);
        } else
            System.out.println("El area de la corona circular es: " + (aCirculo(radio2) - aCirculo(radio1)));
            return aCirculo(radio2) - aCirculo(radio1);

    }

}
