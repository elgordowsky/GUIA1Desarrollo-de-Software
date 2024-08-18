
import java.io.*;
import java.util.*;

public class Universidad {
    private String nombre;
    private String nombreRector;
    private String nombreCiudad;
    private List<Facultad> facultades = new ArrayList<>();
    // CONSTRUCTOR
    public Universidad(String nombre, String nombreCiudad) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.nombreCiudad = nombreCiudad;
        this.facultades = new ArrayList<>();
    }
    //INSERTAR
    public void insertarFacultad(Facultad facultad) {
        facultades.add(facultad);
        System.out.println("Facultad añadida");
    }
    //ELIMINAR
    public void eliminarFacultad(Facultad facultad) {
        facultades.remove(facultad);
        System.out.println("Facultad eliminada");
    }
    //MODIFICAR
    public void modificarFacultad(Facultad facultad, String nuevoNombre, int nuevoCodigo) {
        facultad.setNombre(nuevoNombre);
        facultad.setCodigoNumerico(nuevoCodigo);
        System.out.println("Facultad modificada: " + nuevoNombre);
    }

//GUETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }
}