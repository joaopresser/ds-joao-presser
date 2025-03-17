import java.util.Scanner;

public class Condicao {
  public static void main(String[] args) {

     Scanner V1 = new Scanner(System.in);
       System.out.print("Digite um valor: ");
        int N1 = V1.nextInt();

     Scanner V2 = new Scanner(System.in);
       System.out.print("Digite outro valor: ");
         int N2 = V2.nextInt();
V1.close();
V2.close();

    if (N1 > N2) { 
      System.out.println(N1 + " e maior que " + N2); // obviously
    } else{
       System.out.println(N1 + " e menor que " + N2);
    }  
  }
}
