package proyecto_g6;

public abstract class Bus implements ISistemaEstacion {

    protected  String placa;
    protected  int numero;
    protected String marca;
    protected  String conductor;
    protected  int pasajeros;
    protected int capacidadMaxima;
    
    public Bus(String placa, int numero, String marca, String conductor, int pasajeros) {
        this.placa = placa;
        this.numero = numero;
        this.marca = marca;
        this.conductor = conductor;
        this.pasajeros = pasajeros;
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
