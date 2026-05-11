public class DronLiviano extends Dron {

    private double limiteHoras;

    public DronLiviano() {

        super("DL-000", "Liviano-X", 5, 2, 1, 3.00);

        this.limiteHoras = 2;
    }

    @Override
    public double calcularCostoEntrega() {

        return costoBase +
                (distanciaKm * 0.5) +
                (pesoPaquete * 0.8);
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete <= 5 &&
                horasVuelo <= 2) {

            return true;
        }

        return false;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("======DRON LIVIANO=====");
        super.mostrarInformacion();
        System.out.println("Carga maxima: 5kg");
    }

    @Override
    public void setPesoPaquete(double pesoPaquete) {

        if (pesoPaquete > 0 && pesoPaquete <= 5) {

            this.pesoPaquete = pesoPaquete;
        }
    }

    @Override
    public void setHorasVuelo(double horasVuelo) {

        if (horasVuelo > 0 && horasVuelo <= 2) {

            this.horasVuelo = horasVuelo;
        }
    }
}