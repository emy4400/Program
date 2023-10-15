public class App {
    public static void main(String[] args) throws Exception {
mostrarLetra(10);
    }

    public static void mostrarLetra(int numBotellas) {
        for (int i = numBotellas; i > 0; i--) {
            imprimirEstrofa(i);
        }
        imprimirUltimaEstrofa();
    }

    public static void imprimirEstrofa(int numBotellas) {
        System.out.println(numBotellas + " botella(s) de cerveza en la pared,");
        System.out.println(numBotellas + " botella(s) de cerveza,");
        System.out.println("Baja una y pásala,");
        System.out.println((numBotellas - 1) + " botella(s) de cerveza en la pared.\n");
    }

    public static void imprimirUltimaEstrofa() {
        System.out.println("No hay botellas de cerveza en la pared.");
        System.out.println("Sin botellas de cerveza,");
        System.out.println("No puedes derribar una, no puedes pasarla,");
        System.out.println("¡Porque ya no hay botellas de cerveza en la pared!");
    }
}