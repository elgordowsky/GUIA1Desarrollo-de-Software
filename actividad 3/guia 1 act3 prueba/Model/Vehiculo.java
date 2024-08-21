import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Date.*;
import java.io.*;
import java.time.Duration;

 public class Vehiculo {
    public String placa;
    public String marca;
    public String modelo;
    public LocalDateTime horaEntrada =  LocalDateTime.now();
    public String tipo;

    public Vehiculo(String placa, String marca, String modelo, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = LocalDateTime.now();
        this.tipo = tipo.toLowerCase(Locale.ROOT);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDate horaEntrada) {
        this.horaEntrada = LocalDateTime.now();
    }

     public String getTipo() {
         return tipo;
     }

     public void setTipo(String tipo) {
         this.tipo = tipo;
     }
 }