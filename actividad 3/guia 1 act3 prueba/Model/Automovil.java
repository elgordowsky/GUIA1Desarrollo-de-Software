
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 
 */
public class Automovil extends Vehiculo {   //clase que hereda de vehiculos la mayoria de atributos

    public String tipoCombustible;      // Atributo propio


    public Automovil(String placa, String marca, String modelo, String tipo, String tipoCombustible) {
        super(placa, marca, modelo, tipo);
        this.tipoCombustible = tipoCombustible;
    }
    //GUETTERS SETTERS
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


}