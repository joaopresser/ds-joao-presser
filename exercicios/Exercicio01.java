import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner N1 = new Scanner(System.in);
       System.out.print("Digite o nome do funcionário: ");
        String Nome = N1.nextLine();

        Scanner N2 = new Scanner(System.in);
       System.out.print("Quantas horas ele tem trabalhada?: ");
        int Horas = N2.nextInt();

        Scanner N3 = new Scanner(System.in);
       System.out.print("Qual o valor recebido por hora?: ");
        float VporH = N3.nextFloat();

        Scanner N4 = new Scanner(System.in);
       System.out.print("Quantos filhos menores de 14 anos o funcionário tem?: ");
        int Filhos = N4.nextInt();

        Scanner N5 = new Scanner(System.in);
        System.out.print("Qual a idade do funcionário?: ");
         int Idd = N5.nextInt();

        Scanner N6 = new Scanner(System.in);
        System.out.print("Qual tempo de empresa o funcionário tem?: ");
         int TempEmp = N6.nextInt();
         
         Scanner N7 = new Scanner(System.in);
       System.out.print("Qual é o adicional por filho? ");
        int AddFilho = N7.nextInt();

        N1.close();
        N2.close();
        N3.close();
        N4.close();
        N5.close();
        N6.close();

        float SalBrt = (float) (Horas * VporH);
        float Imposto = (float) (8.5*100/SalBrt) ;
        int SalFam = (int) (AddFilho * Filhos) ;
        float IR = 0;


        if (SalBrt > 1500) { 
            IR = (SalBrt/100*15)} 

            else if (SalBrt > 500){
             IR = (SalBrt/100*8)} 
         }
          else if (SalBrt <= 500) {
            IR = 0} 
         }

         float adc1 = 0;
         float adc2 = 0;
         float adc3 = 0;
         
         if (TempEmp > 40) { 
            adc1 = (SalBrt/100*2)}

            else if (TempEmp > 15){
                adc2 = (SalBrt/100*3.5)}

         else (TempEmp <= 15 && TempEmp > 5 && Idd > 30) {
            adc3 = (SalBrt/100*1.5)}

            

         System.out.println( "O salário bruto é" + SalBrt);
         System.out.println("O imposto sobre o salário é" + Imposto);
         System.out.println("O salário família é" + SalFam);
        }
    }