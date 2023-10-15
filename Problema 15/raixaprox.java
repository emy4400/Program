import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número del cual quieres calcular la raíz cuadrada: ");
        double raiz = teclado.nextDouble();
        System.out.println("Introduce tu aproximación inicial para la raíz: ");
        double aprox = teclado.nextDouble();
        double raizAproximada = squareRoot(raiz, aprox);
        
        System.out.println("Raíz cuadrada aproximada: " + raizAproximada);
    }

    public static double squareRoot(double raiz, double aprox) {
        double raiz2 = (aprox + raiz / aprox) / 2;
        double raiz3 = (raiz2 + raiz / raiz2) / 2;
        return raiz3;
    }}