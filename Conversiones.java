
public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.76;

         // Casteo a entero

         int numInt = (int) num;

         // Casteo a long

         long numLong = (long) num;


         System.out.println("Double :" + num); // 1.67
         System.out.println("Int :" + numInt); // 1
         System.out.println("Long :" + numLong); // 1

         String cantidad = "15";
         String precio = "150.27";

         // Siendo 2 Strings, no podemos calcular
         // Como String es una clase, tenemos que Parsear.

         // Parseo a Int
         int cantEntero =  Integer.parseInt(cantidad);

         // Parseo a Double
         double precioDouble = Double.parseDouble(precio);


         System.out.println("El valor total de la compra es :" + (cantEntero * precioDouble));

         int edad = 15;
         double estatura = 1.76; 

         // Ahora los quiero pasar a string, pq no los voy a operar

         String edadString = String.valueOf(edad);
         String estaturaString = String.valueOf(estatura);

         System.out.println("Edad :" + edadString + "Estatura " + estaturaString);
    }
}