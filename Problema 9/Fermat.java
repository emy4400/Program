import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  



        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Introduce el valor de c: ");
        int c = scanner.nextInt();
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        
        verificarFermat(a, b, c, n);
    }
    
    public static void verificarFermat(int a, int b, int c, int n) {
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("¡Santos bacalaos! Fermat estaba equivocado!");
        } else {
            System.out.println("Nop, esto no está funcionando.");
        }
        
  


        }
        
    }

