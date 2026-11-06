package proyecto_g6;

public class BusAlimentador extends Bus {
    public BusAlimentador(String placa,int numero, String marca, String conductor, int pasajeros){
        super(placa, numero, marca, conductor, pasajeros);
        this.capacidadMaxima=91;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    @Override 
    public String LimiteDePersonas(){
        if (pasajeros > capacidadMaxima){
            return "Se ha excedido la cantidad de pasajeros, enviando bus de apoyo";
        
        }
        else{
            return "El bus se encuentra trabajando en perfecto estado";
        }
    }
        
    }

