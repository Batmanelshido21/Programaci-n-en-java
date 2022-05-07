import java.util.Scanner;

public class Main4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner lector = new Scanner(System.in);

    System.out.println("Introduce el tamaño del arreglo a evaluar");
    int num = lector.nextInt();

    int arreglo[] = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.println("Introduce valor");
      arreglo[i] = lector.nextInt();
    }

    for (int i = 0; i < num; i++) {
      // System.out.print("|" + arreglo[i] + "|");
      if (arreglo[i] % 2 == 0) {
        System.out.println(arreglo[i]);
      }
    }

    System.out.println("Introduce el número de filas");
    int filas = lector.nextInt();
    System.out.println("Introduce el numero de columnas");
    int columnas = lector.nextInt();

    int matriz[][] = new int[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        if (i == j) {
          matriz[i][j] = 1;
        } else {
          matriz[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print("|" + matriz[i][j] + "|");
      }
      System.out.println();
    }


  }

}
