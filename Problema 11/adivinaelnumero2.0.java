import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
            Random numraRandom = new Random();
                int numerorand = numraRandom.nextInt(10) ;
                jugar(numerorand);
            }
            
    public static void jugar(int numerorand) {
            Scanner teclado = new Scanner(System.in);
                boolean estimacion = false;
                
                    System.out.print("Adivina el número entre 1 y 10: ");
                
                while (!estimacion) {
                    int suposicion = teclado.nextInt();
                    
                    if (suposicion < 1 || suposicion > 10) {
                        System.out.println("Por favor, ingresa un número entre 1 y 10.");
                    } else {
                        if (suposicion == numerorand) {
                            System.out.println("¡Felicidades! Adivinaste el número.");
                            estimacion = true;
                        } else if (suposicion < numerorand) {
                            System.out.println("Demasiado bajo. Intenta de nuevo.");
                        } else {
                            System.out.println("Demasiado alto. Intenta de nuevo.");
                        }
                    }
                }
        }
        
    }
