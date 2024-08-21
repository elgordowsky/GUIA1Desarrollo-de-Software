import java.util.Date;
import java.io.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.Duration;
/**
 * 
 */
public class Parqueadero {

    private List<Vehiculo> vehiculos;
    //Array para almacenar los datos
    public Parqueadero() {
        this.vehiculos = new ArrayList<>();
    }

    /**
     * @param Vehiculo
     */
    public void registrarEntrada(Vehiculo Vehiculo) {     // este metodo utiliza LocalDateTime para establecer la hora de entrada
        vehiculos.add(Vehiculo);                          // añade los datos de lo vehiculos
        LocalDateTime laHora= LocalDateTime.now();
        System.out.println("Vehiculo con placa " + Vehiculo.getPlaca() + " registrado con exito\n" + laHora);
    }

    /**
     * @param
     * @return
     */
    public double registrarSalida(String placa) {         // Con el bucle busca los vehiculos almacenados para comprobar los datos
        Vehiculo vehiculoSalida = null;
        for (Vehiculo x : vehiculos) {
            if (x.getPlaca().equalsIgnoreCase(placa)) {
                vehiculoSalida = x;
                break;
            }
        }

        if (vehiculoSalida == null) {
            System.out.println("Vehículo no encontrado.");
            return 0.0;
        }

        vehiculos.remove(vehiculoSalida);

        // Calcula el tiempo de estadía en horas usando Duration
        LocalDateTime ahora = LocalDateTime.now();
        Duration duracion = Duration.between(vehiculoSalida.getHoraEntrada(), ahora);
        double horas = Math.ceil(duracion.toHours());

        // Calcular el costo según tipo de vehículo
        double costo = 0.0;
        switch (vehiculoSalida.getTipo().toLowerCase()) {  //calculo de costo dependiente de horas y tipo de carro
            case "automovil":
                costo = horas * 5000; // Cambia 5000  la tarifa
                if (horas==0 || horas==1) {
                    costo = 5000;
                }
                break;
            case "motocicleta":
                costo = horas * 2000; // Cambia 2000  la tarifa
                if (horas==0 || horas==1) {
                    costo = 2000;
                }
                break;
            case "camion":
                costo = horas * 10000; // Cambia 10000  la tarifa
                if (horas==0 || horas==1) {
                    costo = 10000;
                }
                break;
            default:
                System.out.println("Tipo de vehículo no reconocido.");
                return 0.0;
        }
        String saliendo= LocalDateTime.now().toString();
        System.out.println(saliendo);
        System.out.println("Vehículo con placa " + placa + "\nCosto: $" + costo + "\n¡ GRACIAS !");
        return costo;
    }

    //GUETTERS SETTERS

    public List<Vehiculo> consultarEstado() {

        return vehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}