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
    System.out.println("Introduce el valor de g");
    int g = lector.nextInt();

    String cadenaIngresada = "si";
    if (d.equalsIgnoreCase(cadenaIngresada)) {

    }

    boolean a = true;
    char b = 'X';
    int c = 1;
    // int g = 3;
    double e = 2.1123;
    float f = 2.14f;

    // sysout
    System.out.println("El valor de boolean es " + a + " y el valor de c / g es " + (c / g)
        + " el valor de e es " + e);

  }

}
