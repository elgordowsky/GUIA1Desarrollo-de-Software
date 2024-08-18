import java.util.List;
//HERENCIA DE PERSONA
class Estudiante extends Persona {
    private String colegioBachillerato;
    private String fechaIngreso;
    private Carrera carrera;


    public Estudiante(String nombre, int cedula, String fechaNacimiento, String lugarNacimiento,
                      String colegioBachillerato, String fechaIngreso) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.colegioBachillerato = colegioBachillerato;
        this.fechaIngreso = fechaIngreso;
        this.carrera = carrera;
    }


    //METODO UNICO CLASE ESTUDIANTE
    // Lógica para matricular al estudiante
    public void matricular() {
        if (carrera != null) {
            carrera.insertarEstudiante(this); //  Facultad tiene un método insertarProfesor()
            System.out.println("El profesor " + getNombre() + " ha sido agregado a la facultad " + carrera.getNombre());
        } else {
            System.out.println("Este profesor no está asociado a ninguna facultad.");
        }

    }
    // GUETTERS Y SETTERS

    public String getColegioBachillerato() {
        return colegioBachillerato;
    }

    public void setColegioBachillerato(String colegioBachillerato) {
        this.colegioBachillerato = colegioBachillerato;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}