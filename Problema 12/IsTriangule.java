import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce l1 del triangulo ");
        int l1 = scanner.nextInt();
        System.out.println("Introduce l2 del triangulo ");
        int l2 = scanner.nextInt();
        System.out.println("Introduce l3 del triangulo ");
        int l3 = scanner.nextInt();

        boolean esTriangulo = isTriangle(l1, l2, l3);
        
        if (esTriangulo) {
            System.out.println("Es posible formar un triángulo con las longitudes dadas.");
        } else {
            System.out.println("No es posible formar un triángulo con las longitudes dadas.");
        }
    }

    public static boolean isTriangle(int l1, int l2, int l3) {
        if (l1 > l2 + l3) {
            return false;
        } else {
            if (l2 > l1 + l3) {
                return false;

            } else {
                if (l3 > l1 + l2) {
                    return false;

                } else {
                    return true;

                }
            }
        }


    }}