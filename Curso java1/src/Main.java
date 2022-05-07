import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // Lectura de datos
    Scanner lector = new Scanner(System.in);


    System.out.println("Introduce la cadena a mostrar");
    // se utiliza la palabra lector para llamar las operaciones de lectura
    String d = lector.nextLine();
    System.out.println("El mensaje introducido por el usuario es " + d);

    try {
      System.out.println("Introduce el valor de g");
      int g = lector.nextInt();

      boolean a = true;
      char b = 'X';
      int c = 2;
      // int g = 3;
      double e = 2.1123;
      float f = 2.14f;

      System.out.println("El valor de boolean es " + a + " y el valor de c x g es " + (c * g)
          + " el valor de e es " + e);
    } catch (InputMismatchException e) {
      System.out.println("Por favor introduce un número entero");
    } finally {
      System.out.println("El sistem terminó");
    }


    try {
      // Operación a realizar
    } catch (Exception e) {
      // Controlar el error
    } finally {
      // Operación final
    }

    String cadenaIngresada = "si";
    if (d.equalsIgnoreCase(cadenaIngresada)) {

    }

    // suma +
    // resta -
    // division /
    // multiplicación *


    // sysout

  }

}
