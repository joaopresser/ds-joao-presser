import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        //Cria um novo objeto Usuario usando o construtor
        Scanner sc = new Scanner(System.in);
        Usuario usuario1 = sc.nextLine();
        System.out.println("Qual o nome do Usuário?");

        //Exibe as informações do usuário
        usuario1.exibirInfo();

        //Altera o nome usando o setter
        usuario1.setNone("João Siles");

        //Exibe novamente após alteração
        System.out.println("\nApós alteração de nome:");
        usuario1.exibirInfo();
    }
}

// Criar métod


