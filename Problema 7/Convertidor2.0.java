import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
        Scanner tecladoScanner = new Scanner(System.in);  
                System.out.println("Ingresa el nombre del mes en el que estas");
            String mesPalabra = tecladoScanner.nextLine();
                System.out.println("Ingresa el numero de dia en el que estas");
            int dia = tecladoScanner.nextInt();
                System.out.println("Ingresa el numero de año en el que estas");
            int año = tecladoScanner.nextInt();
                System.out.println("Ingresa el nombre del dia en el que estas");
            String diaPalabra = "Martes";
            String fechas = formatoFecha(dia,  año, diaPalabra, mesPalabra );
                System.out.println(fechas);

tecladoScanner.close();
    }

    
        public static String formatoFecha(int dia,  int año, String diaPalabra, String mesPalabra ) {
            String formatoAmericano = diaPalabra+", "+mesPalabra+" "+dia+", "+año;
            String formatoEuropeo = diaPalabra +" "+dia+" " + mesPalabra + " " + año;
    
            String fechas = formatoAmericano +"\n"+formatoEuropeo;
            return fechas;
        }
        
    }


