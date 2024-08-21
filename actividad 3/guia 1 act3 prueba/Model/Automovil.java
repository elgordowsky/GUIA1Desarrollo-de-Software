
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 
 */
public class Automovil extends Vehiculo {

    public String tipoCombustible;


    public Automovil(String placa, String marca, String modelo, String tipo, String tipoCombustible) {
        super(placa, marca, modelo, tipo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


}