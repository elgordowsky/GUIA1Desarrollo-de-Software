
import java.io.*;
import java.util.*;
//HERENCIA DE PERSONA
class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private int sueldo;
    private Facultad facultad;

    //CONSTRUCTOR
    public Profesor(int cedula, String nombre, String lugarNacimiento, String fechaNacimiento, String profesion, String nacionalidad, int sueldo) {
        super(cedula,nombre, lugarNacimiento, fechaNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.facultad = facultad;
    }

    //METODO UNICO PROFESOR
    public void vinculacion() {
        if (facultad != null) {
            facultad.insertarProfesor(this); //  Facultad tiene un método insertarProfesor()
            System.out.println("El profesor " + getNombre() + " ha sido agregado a la facultad " + facultad.getNombre());
        } else {
            System.out.println("Este profesor no está asociado a ninguna facultad.");
        }
    }

    //GUETTERS Y SETTERS

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Facultad getFacultad() {
        return facultad;
    }
    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;

    }
}