public class Date {
    public static void main(String[] args) throws Exception {

        System.out.println("Este es el problema 2: ¡Hola Mundo!");
        System.out.println("");

        int day = 28;
        String nombre = "Jueves";
        String mes = "Septiembre";
        int año = 2023;

        String nombreingle = "Thursday";
        String mesingles="September";
        System.out.println("Formato Normal:");
        System.out.println("Hoy es día " + day + " " + nombre + " de " + mes + " del " + año);
System.out.println(" ");
System.out.println("American Format:");
System.out.println(nombreingle+" "+day+" "+mesingles+" "+año);
System.out.println(" ");
System.out.println("European format");
System.out.println(nombreingle +","+" "+mesingles +" "+day+"," +" "+año);
System.out.println("");
    }

}
