import java.time.LocalDate;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 
 */
public class Motocicleta extends Vehiculo {       //clase que hereda de vehiculos la mayoria de atributos

    public int cilindraje;   // Atributo propio

    public Motocicleta(String placa, String marca, String modelo,String tipo, int cilindraje) {
        super(placa, marca, modelo, tipo);
        this.cilindraje = cilindraje;
    }
    //GUETTERS SETTERS
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

}