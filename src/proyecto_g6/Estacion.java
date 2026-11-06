
package proyecto_g6;

public class Estacion implements ISistemaEstacion{
    private String codigoIdentificacion;
    private String dueno;
    private int ciudadanos;

    public Estacion(String codigoIdentificacion, String dueno, int ciudadanos) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.dueno = dueno;
        this.ciudadanos = ciudadanos;
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

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setCiudadanos(int ciudadanos) {
        this.ciudadanos = ciudadanos;
    }


    @Override
    public String LimiteDePersonas() {
        int personas = 102;
        if (ciudadanos > personas){
            return "Se ha excedido la cantidad de pasajeros, enviando bus de apoyo";

        }
        else{
            return "La estacion se encuentra trabajando en perfecto estado";

        }

    }
    
    public void abordarBus(Bus bus) {
    int capacidadMaximaBus = 60; 
    int espacioDisponible = capacidadMaximaBus - bus.getPasajeros();

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
               ", Estado de la estacion " + LimiteDePersonas() + "]";
    }
  
    
}
