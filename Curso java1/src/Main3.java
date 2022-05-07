import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner lector = new Scanner(System.in);
    System.out.println("Introduce el numero a multiplicar");
    int num = lector.nextInt();
    System.out.println("Introduce el segundo número");
    int num2 = lector.nextInt();
    int aux = 0;

    for (int i = 1; i <= num2; i++) {
      aux = aux + num;
    }

    System.out.println(aux);

    // Num=5 num 10
    // num10 num 20

    // aux=x;
    // x=y;
    // y=aux;


    System.out.println("Introduce el número a calcular");
    int numf = lector.nextInt();
    int resultado = numf;

    for (int i = numf; i > 2; i--) {
      resultado = resultado * (i - 1);
    }
    System.out.println(resultado);
  }

}
