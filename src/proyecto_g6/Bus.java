
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
    

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setConductor(String Conductor) {
        this.conductor = Conductor;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    
    
    @Override
    public String toString(){
        return "Bus [Numero: " + numero + 
               ", Placa del bus: " + placa + 
               ", Marca del bus: " + marca + 
               ", Conductor del bus: " + conductor+ 
               ", Numero de pasajeros: " + pasajeros +
               ", Estado del bus: " + LimiteDePersonas() + "]";
    }
     
}
