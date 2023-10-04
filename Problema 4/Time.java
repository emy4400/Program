public class Time {
    public static void main(String[] args) throws Exception {


    
        int a = 20; 
        int b = 15;
        int c = 30;
        
        // Medianoche
        int d = a * 3600 + b * 60 + c;
        System.out.println(" ");
        System.out.println(" La hora de hoy es " +a+":"+b+":"+c);
        System.out.println(" ");
        System.out.println("Segundos desde la medianoche: " + d);
        System.out.println(" ");
        
        int e = 24 * 60 * 60;
        int f = e - d;
        System.out.println("Segundos restantes en el día: " + f);
        System.out.println(" ");
        
        double g = (d * 100.0) / e;
        System.out.println("Porcentaje del día que ha pasado: " + g + "%");
        System.out.println(" ");
    }





































    }

