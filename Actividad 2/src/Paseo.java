public class Paseo {

    public static double calcularBuses(int sillasBus, int estudiantesGordos, int estudiantesFlacos) {
        // Calcular sillas necesarias
        int estudiantes = (estudiantesGordos * 2) + estudiantesFlacos;

        // Calcular buses necesarios
        int busesNecesarios = estudiantes / sillasBus;

        // Si hay un residuo en la división, se necesita un bus adicional
        if (estudiantes % sillasBus != 0) {
            busesNecesarios++;
        }
        System.out.println();
        System.out.println("Los buses necesarios: " + busesNecesarios);


        return busesNecesarios;



    }




}
