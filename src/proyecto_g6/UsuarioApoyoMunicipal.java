
package proyecto_g6;


public class UsuarioApoyoMunicipal extends Usuario {

    public UsuarioApoyoMunicipal(String idTarjeta) {
        super(idTarjeta);
    }

    @Override
    public double calcularTarifa() {
        return 0.30;
    }
    
}
