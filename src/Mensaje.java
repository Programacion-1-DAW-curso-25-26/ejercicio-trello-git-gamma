public class Mensaje {

    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public int contarPalabras() {
        // TODO: contar palabras separadas por espacios
        int contador = 0;
        boolean dentroDePalabra = false;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c != ' ' && !dentroDePalabra) {
                contador++;
                dentroDePalabra = true;
            } else if (c == ' ') {
                dentroDePalabra = false;
            }
        }
        return contador;
    }

    public String aMayusculas() {
        // TODO: devolver texto en mayúsculas
        return texto.toUpperCase();
    }

    public String aMinusculas() {
        // TODO: devolver texto en minúsculas
        return texto.toLowerCase();
    }

    public String mostrar() {
        return texto;
    }
}