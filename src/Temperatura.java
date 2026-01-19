public class Temperatura {

    private double valor;
    private String unidad; // "C" o "F"

    public Temperatura(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public double convertirACelsius() {
        // TODO: implementar conversión si la unidad es F
        this.valor = (this.valor-32) * ((double) 5 /9);
        return this.valor;
    }

    public double convertirAFahrenheit() {
        // TODO: implementar conversión si la unidad es C
        this.valor = (this.valor * 9 / 5) + 32;
        return this.valor;
    }

    public String mostrar() {
        return valor + " " + unidad;
    }
}