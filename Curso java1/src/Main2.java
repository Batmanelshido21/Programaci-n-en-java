import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner lector = new Scanner(System.in);
    // System.out.println("Intrododuce el valor de X");
    // int x = lector.nextInt();
    // System.out.println("Intrododuce el valor de Y");
    // int y = lector.nextInt();

    // && se cumplen ambas condiciones
    // || si se cumple minimo una condición
    // if (x == 3 && y == 5) {
    // System.out.println("Los números coinciden con el condicional");
    // } else {
    // System.out.println("Los números no coinciden con el condicional");
    // }

    // <= menor o igual
    // >= mayor o igual

    // if (x <= y) {
    // System.out.println("El valor de x es menor que y o igual");
    // } else {
    // System.out.println("El valor de y es mayor a x");
    // }

    //
    for (int i = 1; i <= 100; i++) {
      System.out.print(i + ", ");
    }
    System.out.println();

    System.out.println("Introduce el número a evaluar");
    int num = lector.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "x" + num + "=" + (i * num));
    }


    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.print(i + ", ");
      }
    }

  }

}
