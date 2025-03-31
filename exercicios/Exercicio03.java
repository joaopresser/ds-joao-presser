import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Digite o lado A: ");
        float LadoA = scanner.nextFloat(); 

        System.out.print("Digite o lado B: ");
        float LadoB = scanner.nextFloat(); 

        System.out.print("Digite o lado C: ");
        float LadoC = scanner.nextFloat(); 

        if (LadoA >= LadoB && LadoB > LadoC){
            System.out.println("Ordem descrescente: " + LadoA + ", " + LadoB + ", " + LadoC);
        }
        else if (LadoC >= LadoB && LadoB > LadoA){
            System.out.println("Ordem descrescente: " + LadoC + ", " + LadoB + ", " + LadoA);
        }
        else if (LadoB >= LadoA && LadoA > LadoC){
            System.out.println("Ordem decrescente: " + LadoB + ", " + LadoA + ", " + LadoC);
        }
        else if (LadoB > LadoC && LadoC >= LadoA){
            System.out.println("Ordem decrescente: " + LadoB + ", " + LadoC + ", " + LadoA);
        }
        else if (LadoC > LadoA && LadoA >= LadoB){
            System.out.println("Ordem descrescente: " + LadoC + ", " + LadoA + ", " + LadoB);
        }
        else if (LadoA > LadoC && LadoC >= LadoB){
            System.out.println("Ordem decrescente: " + LadoA + ", " + LadoC + ", " + LadoB);
        }
        else if (LadoA == LadoB && LadoB == LadoC){
            System.out.println("Ordem decrescente: " + LadoA + ", " + LadoC + ", " + LadoB);
        }

            float d = LadoB + LadoC;
        float e = LadoB * LadoB + LadoC * LadoC;
        
        if (LadoA > d){
            System.out.println("nao forma um triangulo");
        }
        else {
            if (LadoA != LadoB && LadoB != LadoC){
            if (LadoA* LadoA == e){
            System.out.println("triangulo retangulo");
        }
        else if (LadoA * LadoA > e){
            System.out.println("triangulo obtusangulo");
        }
        else if (LadoA * LadoA < e){
            System.out.println("triangulo acutangulo");
        }
        if (LadoA == LadoB && LadoB == LadoC){
            System.out.println("triangulo equilatero");
        }
        else if (LadoA == LadoB || LadoA == LadoC || LadoB == LadoC){
            System.out.println("triangulo isosceles");

        scanner.close();
        }
    }
        }

    }
}

        