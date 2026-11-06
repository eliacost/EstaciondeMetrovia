
<<<<<<< HEAD
package proyecto_g6;

public abstract class Bus implements ISistemaEstacion {

    protected  String placa;
    protected  int numero;
    protected String marca;
    protected  String conductor;
    protected  int pasajeros;
    protected int capacidadMaxima;
    
    public Bus(String placa, int numero, String marca, String conductor, int pasajeros) {
=======
package javaapplication22;

abstract class Bus implements ISistemaEstacion{
    private String placa;
    private int numero;
    private String marca;
    private String conductor;
    private int pasajeros;
    private int capacidadMaxima;

    public Bus(String placa, int numero, String marca, String conductor, int pasajeros, int capacidadMaxima) {
>>>>>>> e4e5ac17f61da2bbb107c0ac15972d0a337b8e02
        this.placa = placa;
        this.numero = numero;
        this.marca = marca;
        this.conductor = conductor;
        this.pasajeros = pasajeros;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumero() {
        return numero;
    }

    public String getMarca() {
        return marca;
    }

    public String getConductor() {
        return conductor;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

<<<<<<< HEAD
    
=======
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    

    @Override
    public String LimiteDePersonas() {
        if (pasajeros > capacidadMaxima){
            return "Se ha excedido la cantidad de pasajeros, enviando bus de apoyo";
        
        }
        else{
            return "El bus se encuentra trabajando en perfecto estado";
        }
    }
>>>>>>> e4e5ac17f61da2bbb107c0ac15972d0a337b8e02
    
    @Override
    public String toString(){
        return "Bus [numero: " + numero + 
               ", Placa del bus: " + placa + 
               ", Marca del bus: " + marca + 
               ", Conductor del bus: " + conductor+ 
               ", Numero de pasajeros: " + pasajeros +
               ", Capacidad de pasajeros: " + capacidadMaxima +
               ", Estado del bus " + LimiteDePersonas() + "]";
    }
   
}
