package proyecto_g6;

public class Estacion implements ISistemaEstacion{
    private String codigoIdentificacion;
    private String dueno;
    private int ciudadanos;
    private int capacidadMaxima;

    public Estacion(String codigoIdentificacion, String dueno, int ciudadanos, int capacidadMaxima) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.dueno = dueno;
        this.ciudadanos = ciudadanos;
        this.capacidadMaxima = capacidadMaxima;
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

    @Override
    public String toString(){
        return "Estacion [Identificacion: " + codigoIdentificacion + 
               ", Dueno del local: " + dueno + 
               ", Cantidad de ciudadanos " + ciudadanos + 
               ", Capacidad de ciudadnos: " + capacidadMaxima +
               ", Estado de la estacion " + LimiteDePersonas() + "]";
    }
  
    
}
