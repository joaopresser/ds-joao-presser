import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String Nome = scanner.nextLine();

        System.out.print("Quantas horas ele tem trabalhadas?: ");
        int Horas = scanner.nextInt();

        System.out.print("Qual o valor recebido por hora?: ");
        float VporH = scanner.nextFloat();

        System.out.print("Quantos filhos menores de 14 anos o funcionário tem?: ");
        int Filhos = scanner.nextInt();

        System.out.print("Qual a idade do funcionário?: ");
        int Idd = scanner.nextInt();

        System.out.print("Qual tempo de empresa o funcionário tem?: ");
        int TempEmp = scanner.nextInt();

        System.out.print("Qual é o adicional por filho? ");
        int AddFilho = scanner.nextInt();

        float SalBrt = Horas * VporH;
        float Imposto = (SalBrt * 8.5f) / 100;  
        int SalFam = AddFilho * Filhos;  

        float IR = 0;
        if (SalBrt > 1500) {
            IR = (SalBrt * 15) / 100;  
        } else if (SalBrt > 500) {
            IR = (SalBrt * 8) / 100;  
        }

        // Calculando adicionais
        float adc1 = 0, adc2 = 0, adc3 = 0;

        if (TempEmp > 40) {
            adc1 = (SalBrt * 2) / 100;  
        } else if (TempEmp > 15) {
            adc2 = (SalBrt * 3.5f) / 100;  
        } else if (TempEmp > 5 && Idd > 30) {
            adc3 = (SalBrt * 1.5f) / 100;  
        }

        // Calculando o total de adicionais
        double TotalAdc = adc1 + adc2 + adc3 + SalFam;

        // Calculando descontos (Imposto de renda + imposto sobre o salário)
        double descontos = IR + Imposto;

        // Calculando o salário líquido
        double SalLiq = SalBrt - descontos + TotalAdc;

        // Exibindo os resultados
        System.out.println("----------------");
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idd);
        System.out.println("O salário bruto é: " + SalBrt);
        System.out.println("O imposto sobre o salário é: " + Imposto);
        System.out.println("O salário família é: " + SalFam);
        System.out.println("Adicionais: " + TotalAdc);
        System.out.println("Descontos: " + descontos);
        System.out.println("Salário Líquido: " + SalLiq);

        // Fechar o scanner no final
        scanner.close();
    }
}
