package proyecto_g6;


import java.util.ArrayList;

public class Estacion implements ISistemaEstacion{
    private String codigoIdentificacion;
    private String dueno;
    private int ciudadanos;
    private ArrayList<Bus> listaBuses=new ArrayList<>();
    private int capacidadMaxima;

    public Estacion(String codigoIdentificacion, String dueno, int ciudadanos, int capacidadMaxima) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.dueno = dueno;
        this.ciudadanos = ciudadanos;
        this.capacidadMaxima = capacidadMaxima;
    }
 
    public void agregarBus( Bus bus) {
        listaBuses.add(bus);
    }
    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public String getDueno() {
        return dueno;
    }

    public int getCiudadanos() {
        return ciudadanos;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setCiudadanos(int ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }



    @Override
    public String LimiteDePersonas() {
        if (ciudadanos > capacidadMaxima){
            return "Se ha excedido la cantidad de pasajeros, enviando bus de apoyo";

        }
        else{
            return "El bus se encuentra trabajando en perfecto estado";

        }

    }
    
    public void abordarBus(Bus bus) { 
    int espacioDisponible = bus.capacidadMaxima - bus.getPasajeros();

    if (espacioDisponible <= 0) {
        System.out.println("El bus: " + bus.getNumero() + " está lleno. Ningún ciudadano del andén puede abordar.");
        return; 
    }

    int ciudadanosEnEstacion = getCiudadanos();

    if (ciudadanosEnEstacion <= 0) {
        System.out.println("El andén está vacío. Nadie abordó el bus.");
        return;
    }

    
    int personasQueAbordan = 0;
    
    if (ciudadanosEnEstacion >= espacioDisponible) {
        personasQueAbordan = espacioDisponible;
    } else {
        personasQueAbordan = ciudadanosEnEstacion;
    }

    setCiudadanos(ciudadanosEnEstacion - personasQueAbordan); 
    bus.setPasajeros(bus.getPasajeros() + personasQueAbordan);  

    System.out.println("");
    System.out.println("--- REPORTE DE ABORDAJE ---");
    System.out.println("Han abordado " + personasQueAbordan + " pasajeros al bus #" + bus.getNumero() + ".");
    System.out.println("Ciudadanos restantes en la estación: " + getCiudadanos());
    System.out.println("");
}

    @Override
    public String toString(){
        return "Estacion [Identificacion: " + codigoIdentificacion + 
               ", Dueno del local: " + dueno + 
               ", Cantidad de ciudadanos " + ciudadanos + 
               ", Capacidad de ciudadnos: " + capacidadMaxima +
               ", Estado de la estacion " + LimiteDePersonas() + "]";
    }
  
    
}
