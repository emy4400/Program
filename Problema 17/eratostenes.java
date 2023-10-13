import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int l = teclado.nextInt();
        teclado.close();

        primos(l);
    }

    public static void primos(int l) {
        if (l >= 2) {
            System.out.println(2); 
        }
        
        for (int i = 3; i <= l; i += 2) {
            boolean primo = true;
            int check = (int) Math.sqrt(i); 
            for (int i1 = 3; i1 <= check; i1 += 2) {
                if (i % i1 == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
