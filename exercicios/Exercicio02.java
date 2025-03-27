import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Digite o código do funcionário: ");
        String Cod = scanner.nextLine();

       
        System.out.print("Digite o sexo do funcionário: ");
         String sexo = scanner.nextLine();

         
         System.out.print("Digite o tempo de casa do funcionário(em anos): ");
          int Tempo = scanner.nextInt();

          
          System.out.print("Digite o salário do funcionário: ");
           double Sal = scanner.nextDouble();

        

           double Bonus = 0;

           if (Tempo > 15) { 
            Bonus = (Sal*20)/100;} 

           else if (Tempo > 10){
            Bonus = (Sal*25)/100;} 
        
           else if (Tempo <= 10) {
            Bonus = (Sal*100)/100;} 
        
        scanner.close();


        System.out.println( "----------------");
        System.out.println( "Código do Funcionário:" + Cod);
        System.out.println( "Sexo:" + sexo);
        System.out.println( "Tempo de Casa:" + Tempo);
        System.out.println( "Salário:" + Sal);
        System.out.println( "Bônus:" + Bonus);
    }

}

