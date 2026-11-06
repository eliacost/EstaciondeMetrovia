
package proyecto_g6;

public class BusAlimentador extends Bus implements ISistemaEstacion {

    public BusAlimentador(String placa, int numero, String marca, String conductor, int pasajeros, int capacidadMaxima) {
        super(placa, numero, marca, conductor, pasajeros, capacidadMaxima);
    }
    

        @Override
    public String LimiteDePersonas() {
        if (getPasajeros() > getCapacidadMaxima()){
            return "Se ha excedido la cantidad de pasajeros, enviando bus de apoyo";
        
        }
        else{
            return "El bus se encuentra trabajando en perfecto estado";
        }
    }
     
}
