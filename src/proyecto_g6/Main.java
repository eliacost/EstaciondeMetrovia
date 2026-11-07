package proyecto_g6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacion estacionPrincipal = new Estacion("EST-CENTRAL", "Municipio de Guayaquil", 0, 200);

        int opcion = 0; 
        
        do {
            System.out.println("=======================================================");
            System.out.println("     SISTEMA DE CONTROL DE ESTACION DE METROVIA       ");
            System.out.println("=======================================================");
            System.out.println("                ++ Menu Principal  ++                  ");
            System.out.println("1. Registrar unidad de transporte");
            System.out.println("2. Registrar ingreso de pasajero");
            System.out.println("3. Aforo actual en la estacion");
            System.out.println("4. Listado actual de buses registrados");
            System.out.println("5. Recaudacion actual");
            System.out.println("6. Cierre de operaciones");
            System.out.print("Seleccione una opcion [1-6]: ");
        
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    System.out.println("--- Registrar unidad de transporte ---");
                    sc.nextLine();
                    System.out.print("Ingrese la placa del bus: ");
                    String placa = sc.nextLine();
    
                    System.out.print("Ingrese el numero del bus: ");
                    int numero = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Ingrese la marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Ingrese el nombre del conductor: ");
                    String conductor = sc.nextLine();

                    System.out.print("Ingrese la cantidad de pasajeros actuales: ");
                    int pasajeros = sc.nextInt();
                    System.out.println("Elija el tipo de Bus a registrar (ingrese el número de la opción):");
                    System.out.println("1. Bus Articulado");
                    System.out.println("2. Bus Alimentador");
                    int tipoBus = sc.nextInt();
                    sc.nextLine();
                    
                    Bus nuevoBus = null;
                    if(tipoBus == 1){
                        nuevoBus = new BusArticulado(placa, numero, marca, conductor, pasajeros);
                        estacionPrincipal.agregarBus(nuevoBus);
                    } else if(tipoBus == 2){
                        nuevoBus = new BusAlimentador(placa, numero, marca, conductor, pasajeros);
                        estacionPrincipal.agregarBus(nuevoBus);
                    } else {
                        System.out.println("Ingrese una opción correcta");
                    }
    
                    System.out.println("");
                    System.out.println("Bus registrado con exito!");
                    
                    if (nuevoBus != null) {
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
                    }
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.println("--- Ingreso de Pasajero ---");
                    System.out.println("1. General");
                    System.out.println("2. Apoyo Municipal");
                    System.out.println("3. Estudiante");
                    System.out.println("4. Mayor de Edad");
                    System.out.println("5. No vidente");
                    System.out.print("Seleccione el tipo de usuario [1-5]: ");
                    int tipo = sc.nextInt();
                    System.out.print("Inscriba el codigo de la tarjeta: ");
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
                            System.out.println("Opcion no valida"); 
                            break;
                    }
                    
                    if (usuario != null) {
			double tarifaCobrada = usuario.calcularTarifa();
                        estacionPrincipal.sumarRecaudacion(tarifaCobrada);

                        int ciudadanosActuales = estacionPrincipal.getCiudadanos();
                        estacionPrincipal.setCiudadanos(ciudadanosActuales + 1);

                        System.out.println("Pasajero registrado con exito!");
                        
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
                    System.out.println("Codigo de la estacion: " + estacionPrincipal.getCodigoIdentificacion()); 
                    System.out.println("Administrador de la estacion: " + estacionPrincipal.getDueno()); 
                    System.out.println("Cantidad de ciudadanos dentro de la estacion: " + estacionPrincipal.getCiudadanos());
                    System.out.println("Estado del aforo: " + estacionPrincipal.LimiteDePersonas());
                    System.out.println("");
                    break;
                    
                case 4:
		    System.out.println("");
                    System.out.println("--- Listado actual de buses registrados ---");
                    System.out.println("Estado general de la estación:");
                    System.out.println(estacionPrincipal.toString());
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("--- Recaudacion actual ---");
                    System.out.println("La recaudación total hasta el momento es: $" + estacionPrincipal.getRecaudacionTotal());
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("--- Cierre de operaciones ---");
                    System.out.println("Resumen final de la jornada:");
                    System.out.println(" -> Estación: " + estacionPrincipal.getCodigoIdentificacion());
                    System.out.println(" -> Administrador: " + estacionPrincipal.getDueno());
                    System.out.println(" -> Ciudadanos en andén al cierre: " + estacionPrincipal.getCiudadanos());
                    System.out.println(" -> Estado del aforo: " + estacionPrincipal.LimiteDePersonas());
                    System.out.println("Cerrando operaciones... ¡Hasta pronto!");
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
        } while (opcion != 6);
    }
}