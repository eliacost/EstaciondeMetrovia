
package proyecto_g6;

public class UsuarioGeneral extends Usuario {

    public UsuarioGeneral(String idTarjeta) {
        super(idTarjeta);
    }

    @Override
    public double calcularTarifa() {
        return 0.45;
    }
    
}
