
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalDate;
/**
 * 
 */
public class Camion extends Vehiculo {

    public double capacidadCarga;



    public Camion(String placa, String marca, String modelo,String tipo, double capacidadCarga) {
        super(placa, marca, modelo, tipo);
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * @return
     */

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


}