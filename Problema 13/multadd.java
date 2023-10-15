import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ESTE ES EL PRIMER INTRUCCION");
        espacio();
        System.out.println("Ingrese el valor de a ");
        double a = teclado.nextDouble();
        espacio();
        System.out.println("Ingrese el valor de b ");
        double b = teclado.nextDouble();
        espacio();
        System.out.println("Ingrese el valor de c");
        double c = teclado.nextDouble();
        espacio();
        double resultado = multadd(a, b, c);
        System.out.println("CALCULANDO................................................................");
        espacio();
        System.out.println("El resultado de la operación multadd es: " + resultado);
        espacio();

        System.out.println("ESTE ES LA SEGUNDA INTRUCCION");
        espacio();
        System.out.println("Ingrese el valor de x ");
        double x = teclado.nextDouble();
        espacio();
        System.out.println("Ingrese el valor de e ");
        double e = teclado.nextDouble();
        espacio();
        System.out.println("CALCULANDO................................................................");
        espacio();
double resultado1 = expesum(x,e);
System.out.println("El resultado de la operación expSum es : " + resultado1);






    }

    public static double multadd(double a, double b, double c) {
        double resultado = a * b + c;
        return resultado;
    }
    public static double expesum (double x, double e){
        double elevaciones1 = Math.pow(e,-x);    
double raiz = Math.sqrt(1-elevaciones1);
double multiplicacion = x*e;
double elevacion2 = Math.pow(multiplicacion,-x);
double resultado2=  elevacion2 +raiz;
return resultado2;
        
    }

    public static void espacio() {
        System.out.println(" ");
    }
}
