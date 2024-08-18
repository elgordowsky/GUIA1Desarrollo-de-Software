
import java.io.*;
import java.util.*;

class Carrera {
    private String nombre;
    private int creditosTotales;
    private int numeroSemestre;
    private String nivelCarrera;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;

    //CONSTRUCTOR
    public Carrera(String nombre, int creditosTotales, int numeroSemestre, String nivelCarrera) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.numeroSemestre = numeroSemestre;
        this.nivelCarrera = nivelCarrera;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    //INSERTAR CURSO
    public void insertarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso insertado");
    }
    //ELIMINAR CURSO
    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
        System.out.println("Curso eliminado");
    }
    //MODIFICAR CURSO
    public void modificarCurso(Curso curso, String nuevoNombre, int nuevosCreditos) {
        curso.setNombre(nuevoNombre);
        curso.setNumeroCreditos(nuevosCreditos);
        System.out.println("Curso modificado");
    }
    //INSERTAR ESTUDIANTE
    public void insertarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante insertado");
    }
    //ELIMINAR ESTUDIANTE
    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
        System.out.println("Estudiante eliminado");
    }
    //GUETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditosTotales() {
        return creditosTotales;
    }

    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public String getNivelCarrera() {
        return nivelCarrera;
    }

    public void setNivelCarrera(String nivelCarrera) {
        this.nivelCarrera = nivelCarrera;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


}