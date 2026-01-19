public class Temperatura {

    private double valor;
    private String unidad; // "C" o "F"

    public Temperatura(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public double convertirACelsius() {
        // TODO: implementar conversión si la unidad es F
        double celsius;
        celsius = (this.valor-32) * ((double) 5 /9);
        return celsius;
    }

    public double convertirAFahrenheit() {
        // TODO: implementar conversión si la unidad es C
        double Fahrenheit;
        Fahrenheit = (this.valor * 9 / 5) + 32;
        return Fahrenheit;
    }

    public String mostrar() {
        return valor + " " + unidad;
    }
}