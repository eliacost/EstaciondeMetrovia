
package proyecto_g6;
import java.util.Scanner;
public class Main {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacion estacionPrincipal = new Estacion("EST-CENTRAL", "Municipio de Guayaquil", 200);

        int opcion = 0; 
        
        do {
            System.out.println("=======================================================");
            System.out.println("     SISTEMA DE CONTROL DE ESTACIÓN DE METROVÍA       ");
            System.out.println("=======================================================");
            System.out.println("|                   Menu Principal                    |");
            System.out.println(" 1. Registrar unidad de transporte");
            System.out.println(" 2. Registrar ingreso de pasajero");
            System.out.println(" 3. Aforo actual en la estación");
            System.out.println(" 4. Listado actual de buses registrados");
            System.out.println(" 5. Recaudación actual");
            System.out.println(" 6. Cierre de operaciones");
            System.out.println("Seleccione una opción [1-6]: ");
        
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    System.out.println("--- Registrar unidad de transporte ---");
                    sc.nextLine();
                    System.out.print("Ingrese la placa del bus: ");
                    String placa = sc.nextLine();
    
                    System.out.print("Ingrese el número del bus: ");
                    int numero = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Ingrese la marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Ingrese el nombre del conductor: ");
                    String conductor = sc.nextLine();

                    System.out.print("Ingrese la cantidad de pasajeros actuales: ");
                    int pasajeros = sc.nextInt();
                    Bus nuevoBus = new Bus(placa, numero, marca, conductor, pasajeros);
    
                    System.out.println("");
                    System.out.println("Bus registrado con éxito!");
                    System.out.println("");
                    
                    String estadoBus = nuevoBus.LimiteDePersonas();
                    if (estadoBus.contains("excedido")) {
                        System.out.println("");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("En el bus " + nuevoBus.getNumero() + ": " + estadoBus);
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("");
                    } else {
                        System.out.println("Estado del bus: " + estadoBus);
                    }
                    
                    estacionPrincipal.abordarBus(nuevoBus);
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.println("--- Ingreso de Pasajero ---");
                    System.out.println("1. General");
                    System.out.println("2. Apoyo Municipal");
                    System.out.println("3. Estudiante");
                    System.out.println("4. Mayor de Edad");
                    System.out.println("5. No vidente");
                    System.out.println("Seleccione el tipo de usuario [1-5]:");
                    int tipo = sc.nextInt();
                    System.out.println("Inscriba el código de la tarjeta: ");
                    sc.nextLine();
                    String id = sc.nextLine();
                    
                    Usuario usuario = null; 
                    switch(tipo){
                        case 1:
                            usuario = new UsuarioGeneral(id);
                            break;
                        case 2: 
                           usuario = new UsuarioApoyoMunicipal(id);
                           break;
                        case 3:
                            usuario = new UsuarioEstudiante(id);
                            break;
                        case 4: 
                            usuario = new UsuarioMayorEdad(id);
                            break;
                        case 5: 
                            usuario = new UsuarioNoVidente(id);
                            break;
                        default:
                           System.out.println("Opción no válida"); 
                           break;
                    }
                    
                    if (usuario != null) {
                        int ciudadanosActuales = estacionPrincipal.getCiudadanos();
                        estacionPrincipal.setCiudadanos(ciudadanosActuales + 1);
                        System.out.println("Pasajero registrado con éxito!");
                        String estadoAforo = estacionPrincipal.LimiteDePersonas();
                        if (estadoAforo.contains("excedido")) {
                            System.out.println("");
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            System.out.println(estadoAforo);
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            System.out.println("");
                        }
                    }
                break;
                case 3:
                    System.out.println("");
                    System.out.println("--- Aforo actual ---");
                    System.out.println(estacionPrincipal.toString());
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
            
        } while (opcion !=  6);


    }
    
}
