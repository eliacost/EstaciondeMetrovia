<<<<<<< HEAD
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

=======

package javaapplication22;

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
>>>>>>> e4e5ac17f61da2bbb107c0ac15972d0a337b8e02
