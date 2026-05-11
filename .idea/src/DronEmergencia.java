public class DronEmergencia extends Dron {

    private double recargoUrgencia;
    private int nivelPrioridad;

    public DronEmergencia() {

        super("DE-000", "Emergency-Pro",
                5, 2,
                1, 8.00);

        this.recargoUrgencia = 5;
        this.nivelPrioridad = 1;
    }

    @Override
    public double calcularCostoEntrega() {

        return costoBase +
                (distanciaKm * 1.0) +
                (pesoPaquete * 2) +
                recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete <= 10 &&
                horasVuelo <= 3 &&
                nivelPrioridad >= 1 &&
                nivelPrioridad <= 2) {

            return true;
        }

        return false;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("====== DRON EMERGENCIA ======");

        super.mostrarInformacion();

        System.out.println("Nivel prioridad: " + nivelPrioridad);
        System.out.println("Recargo urgencia: $" + recargoUrgencia);
        System.out.println("Carga maxima: 10 kg");
    }

    @Override
    public void setPesoPaquete(double pesoPaquete) {

        if (pesoPaquete > 0 && pesoPaquete <= 10) {

            this.pesoPaquete = pesoPaquete;
        }
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {

        if (horasVuelo > 0 && horasVuelo <= 3) {

            this.horasVuelo = horasVuelo;
        }
    }

    public int getNivelPrioridad() {

        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {

        if (nivelPrioridad >= 1 && nivelPrioridad <= 2) {

            this.nivelPrioridad = nivelPrioridad;
        }
    }
}