import java.util.Random;
import java.util.Scanner;

public class adivinaelnumero{
    public static void main(String[] args) throws Exception {


Random random = new Random();
Scanner teclado = new Scanner(System.in);

int numero =random.nextInt(100);

System.out.println("Adivina el numero");
System.out.println("");
System.out.println("Ingresa un numero del 1 al 100");
int numero2 =teclado.nextInt();

if(numero == numero2){
System.out.println("Felicidades has  adivinando el numero ");
System.out.println("El numero era:"+" "+numero);
}else{
    System.out.println("Has perdido");
    System.out.println("El numero era:"+" "+numero);
    int resta = numero - numero2;
    System.out.println("Estabas fuera por "+" "+resta );
    
}

teclado.close();
    }
}

