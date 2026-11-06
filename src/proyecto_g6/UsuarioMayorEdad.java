
package proyecto_g6;


public class UsuarioMayorEdad extends Usuario {

    public UsuarioMayorEdad(String idTarjeta) {
        super(idTarjeta);
    }

    @Override
    public double calcularTarifa() {
         return 0.15;
    }
}
