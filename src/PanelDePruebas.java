
public class PanelDePruebas {

    public static void main(String[] args) {

        // TODO: llamar a métodos de prueba
        probarTemperatura();
        probarContador();
        probarMensaje();
        probarCronometro();
    }

    public static void probarTemperatura() {
        // TODO: crear objetos y mostrar resultados
    }

    public static void probarContador() {
        // TODO: probar incrementar, decrementar, reset
    }

    public static void probarMensaje() {
        // TODO: probar mayúsculas, minúsculas, contar palabras
        Mensaje men1 = new Mensaje("Hola mundo Java");

        System.out.println("Texto original: " + men1.mostrar());
        System.out.println("Mayúsculas: " + men1.aMayusculas());
        System.out.println("Minúsculas: " + men1.aMinusculas());
        System.out.println("Número de palabras: " + men1.contarPalabras());
    }

    public static void probarCronometro() {
        // TODO: iniciar, tic, pausar, mostrarTiempo
    }
}