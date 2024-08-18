
import java.io.*;
import java.util.*;
//HERENCIA DE PERSONA
class Rector extends Persona {
    private String profesion;
    private int sueldo;

    //CONSTRUCTOR
    public Rector(int cedula, String nombre, String lugarNacimiento, String fechaNacimiento, String profesion, int sueldo) {
        super(cedula, nombre, lugarNacimiento, fechaNacimiento);
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    //GUETTERS Y SETTERS
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Rector  nombre='" + getNombre() + "', id='" + getCedula() + "  ";
    }
}