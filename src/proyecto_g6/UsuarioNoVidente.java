
package proyecto_g6;


public class UsuarioNoVidente extends Usuario {

    public UsuarioNoVidente(String idTarjeta) {
        super(idTarjeta);
    }

    @Override
    public double calcularTarifa() {
        return 0.00;
    }
    
}
