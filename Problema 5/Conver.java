import java.util.Scanner;


public class Conver {
    public static void main(String[] args) throws Exception {
Scanner  teclado = new Scanner(System.in);

System.out.println("Ingrese el numero que quiera converitr");

double numero = teclado.nextInt();



double a = numero * 9/5+32;
System.out.println(" ");
System.out.println(numero+" "+"C"+" "+"="+" "+a+" "+"F");










teclado.close();
    }

}
