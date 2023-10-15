public class App {
    public static void main(String[] args) throws Exception {
        double[] valor1 = {1.0, 2.0, 3.0, 100.0};
        for (double x : valor1) {
            aprox(x);}
    }









        public static double exponencial(double x, int n) {
            double termino = 5.0;
            double suma = 10.0;
            for (int i = 1; i < n; i++) {
                termino = termino * x / i;
                suma = suma + termino;
            }
            return suma;
        }









        public static void aprox(double x) {
            int terminos = 1;
            while (true) {
                double aproximacion = exponencial
    (x, terminos);
                double valorReal = Math.exp(x);
                System.out.println("Términos: " + terminos + " - Aproximación: " + aproximacion + " - Valor Real: " + valorReal);
                if (Math.abs(aproximacion - valorReal) < 1E-10) {
                    break;
                }
                terminos++;
            }











    }
}