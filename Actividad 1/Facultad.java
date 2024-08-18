
import java.io.*;
import java.util.*;


class Facultad {
    private String nombre;
    private int codigoNumerico;
    private List<Profesor> profesores;
    private List<Carrera> carreras;

    //CONSTRUCTOR
    public Facultad(String nombre, int codigoNumerico) {
        this.nombre = nombre;
        this.codigoNumerico = codigoNumerico;
        this.profesores = new ArrayList<>();
        this.carreras = new ArrayList<>();

    }
    //INSERTAR CARRERA
    public void insertarCarrera(Carrera carrera) {
        carreras.add(carrera);
        System.out.println("Carrera insertada");
    }
    //ELIMINAR CARRERA
    public void eliminarCarrera(Carrera carrera) {
        carreras.remove(carrera);
        System.out.println("Carrera eliminada");
    }
    //MODIFICAR CARRERA
    public void modificarCarrera(Carrera carrera, String nuevoNombre, int nuevosCreditos) {
        carrera.setNombre(nuevoNombre);
        carrera.setCreditosTotales(nuevosCreditos);
        System.out.println("Carrera modificada");
    }
    //INSERTAR PROFESOR
    public void insertarProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("Profesor insertado");
    }
    //ELIMINAR PROFESOR
    public void eliminarProfesor(Profesor profesor) {
        profesores.remove(profesor);
        System.out.println("Profesor eliminado");
    }
    //MODIFICAR PROFESOR
    public void modificarProfesor(Profesor profesor, String nuevaProfesion, int nuevoSueldo) {
        profesor.setProfesion(nuevaProfesion);
        profesor.setSueldo(nuevoSueldo);
        System.out.println("Profesor modificado");
    }

    //GUETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    public List<Carrera> getCarreras() {
        return carreras;
    }
    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
}