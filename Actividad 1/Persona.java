
import java.io.*;
import java.util.*;

public class Persona {
    private int cedula;
    private String nombre;
    private String lugarNacimiento;
    private String fechaNacimiento;

    //CONSTRUCTOR
    public Persona(int cedula, String nombre, String lugarNacimiento, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNacimiento = fechaNacimiento;
    }


    //GUETTERS Y SETTERS

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}