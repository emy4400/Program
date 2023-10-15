import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = teclado.nextInt();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = teclado.nextInt();
        int[] arreglo = new int[tamaño];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = teclado.nextInt();
        }

        boolean resultado = hasDivisibleNumber(n, arreglo);
        System.out.println("¿los números en el arreglo son divisibles en  " + n + "? " + resultado);
    }

    public static boolean hasDivisibleNumber(int n, int[] arreglo) {
        for (int num : arreglo) {
            
            if (num % n == 0) {
                return true;
            }
        }
        
        return false;
    }
}
