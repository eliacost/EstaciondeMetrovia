
package proyecto_g6;

public class UsuarioEstudiante extends Usuario{

    public UsuarioEstudiante(String idTarjeta) {
        super(idTarjeta);
    }

    @Override
    public double calcularTarifa() {
        return 0.15;
    }
    
}
