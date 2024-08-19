import java.sql.SQLOutput;

public class Cartesiano {

    public static double fDistancia(double xuno, double yuno, double xdos, double ydos) {
        return Math.sqrt(((ydos - yuno) * (ydos - yuno)) + ((xdos - xuno) * (xdos - xuno)));

    }

    public static double fPendiente(double xuno, double yuno, double xdos, double ydos) {
        return (ydos-yuno)/(xdos-xuno);
    }

    public static String fDisPen(double xuno, double yuno, double xdos, double ydos) {

         double distancia = fDistancia(xuno, yuno, xdos, ydos);
         double pendiente = fPendiente(xuno, yuno, xdos, ydos);
         System.out.println("punto x1,y1: "+ xuno + " , " + yuno + "\npunto x2,y2: " + xdos +" , "+ ydos + "\ndistancia: " + distancia + "\npendiente: " + pendiente);

         return "distancia: "+ distancia + "pendiente: " + pendiente;

    }

}
