
package proyecto_g6;


public abstract class Usuario {
    private String idTarjeta;

    public Usuario(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }
    
    public abstract double calcularTarifa();
    
}
