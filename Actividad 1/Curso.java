
import java.io.*;
import java.util.*;

class Curso {
    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private String numeroSalon;
    private String nombreEdificio;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    //CONSTRUCTOR
    public Curso(int codigo, String nombre, int numeroCreditos, String numeroSalon, String nombreEdificio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroSalon = numeroSalon;
        this.nombreEdificio = nombreEdificio;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();

    }
    // CONSTRUCTOR ARRAYS
    public Curso(ArrayList<Profesor> profesores, ArrayList<Estudiante> estudiantes) {
        this.profesores = profesores;
        this.estudiantes = estudiantes;
    }
    //INSERTAR PROFESOR
    public void asignarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    //INSERTAR ESTUDIANTE
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    //CONSULTAR
    public ArrayList<Estudiante> consultarEstudiantes() {
        return estudiantes;
    }

    //GUETTERS Y SETTERS

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(String numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}