import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DronLiviano dl = new DronLiviano();
        DronCarga dc = new DronCarga();
        DronEmergencia de = new DronEmergencia();


        System.out.println("===== INFORMACIÓN INICIAL DE DRONES =====");

        dl.mostrarInformacion();
        System.out.println();

        dc.mostrarInformacion();
        System.out.println();

        de.mostrarInformacion();

        System.out.println("\n===== INGRESO DE NUEVOS DATOS =====");

        System.out.println("¿Qué dron desea actualizar?");
        System.out.println("1. Dron Liviano");
        System.out.println("2. Dron Carga");
        System.out.println("3. Dron Emergencia");

        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        Dron dronSeleccionado = null;

        if (opcion == 1) {

            dronSeleccionado = dl;

        } else if (opcion == 2) {

            dronSeleccionado = dc;

        } else if (opcion == 3) {

            dronSeleccionado = de;

        } else {

            System.out.println("Opción invalida");
            return;
        }

        sc.nextLine();

        System.out.print("\nIngrese codigo: ");
        dronSeleccionado.setCodigo(sc.nextLine());

        System.out.print("Ingrese modelo: ");
        dronSeleccionado.setModelo(sc.nextLine());

        System.out.print("Ingrese distancia (km): ");
        dronSeleccionado.setDistanciaKm(sc.nextDouble());

        System.out.print("Ingrese peso del paquete (kg): ");
        dronSeleccionado.setPesoPaquete(sc.nextDouble());

        System.out.print("Ingrese horas de vuelo: ");
        dronSeleccionado.setHorasVuelo(sc.nextDouble());

        if (opcion == 3) {

            System.out.print("Ingrese nivel de prioridad (1-2): ");

            int prioridad = sc.nextInt();

            de.setNivelPrioridad(prioridad);
        }

        System.out.println("\nValidando datos...");

        if (dronSeleccionado.validarDatos()) {

            System.out.println("Datos correctos");

            System.out.println("\nCalculando costo...");

            System.out.println("\n===== INFORMACION ACTUALIZADA =====");

            dronSeleccionado.mostrarInformacion();

            System.out.println("\n--- Cambio con Setter ---");

            double costoInicial =
                    dronSeleccionado.calcularCostoEntrega();

            dronSeleccionado.setPesoPaquete(
                    dronSeleccionado.getPesoPaquete() + 2
            );

            double nuevoCosto =
                    dronSeleccionado.calcularCostoEntrega();

            System.out.println("Costo inicial -> $" + costoInicial);
            System.out.println("Nuevo costo -> $" + nuevoCosto);

        } else {

            System.out.println("Datos invalidos.");
        }


        Dron[] drones = {dl, dc, de};

        for (Dron d : drones) {

            d.mostrarInformacion();
            System.out.println();
        }

        System.out.println("===== FIN DEL PROGRAMA =====");

        sc.close();
    }
}