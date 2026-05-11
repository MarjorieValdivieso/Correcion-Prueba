public class DronCarga extends Dron {

    private double costoPorKg;

    public DronCarga() {

        super("DC-000", "Carga-Z",
                5, 2,
                1, 6.00);

        this.costoPorKg = 1.5;
    }

    @Override
    public double calcularCostoEntrega() {

        return costoBase +
                (distanciaKm * 0.7) +
                (pesoPaquete * costoPorKg);
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete <= 30 &&
                horasVuelo <= 5) {

            return true;
        }

        return false;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("====== DRON CARGA ======");

        super.mostrarInformacion();

        System.out.println("Carga maxima: 30 kg");
    }

    @Override
    public void setPesoPaquete(double pesoPaquete) {

        if (pesoPaquete > 0 && pesoPaquete <= 30) {

            this.pesoPaquete = pesoPaquete;
        }
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {

        if (horasVuelo > 0 && horasVuelo <= 5) {

            this.horasVuelo = horasVuelo;
        }
    }
}
