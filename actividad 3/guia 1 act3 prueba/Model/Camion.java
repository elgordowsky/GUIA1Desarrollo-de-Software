
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalDate;
/**
 * 
 */
public class Camion extends Vehiculo {   //clase que hereda de vehiculos la mayoria de atributos

    public double capacidadCarga;     // Atributo propio



    public Camion(String placa, String marca, String modelo,String tipo, double capacidadCarga) {
        super(placa, marca, modelo, tipo);
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * @return
     */
    //GUETTERS SETTERS
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


}