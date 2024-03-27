import java.util.Scanner;

public class Ex1 {
    public static void ex1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Execução do exercicio abaixo\n\n");

        float pesoLimite = 50.0F;

        System.out.print("Insira o peso: ");

        float peso = scanner.nextFloat();
        scanner.close();

        if (peso > pesoLimite) {
            float excesso = peso - pesoLimite;
            float multa = excesso * 4;
            System.out.println("A multa foi de " + multa + " reais!");
        } else {
            System.out.println("Não há multa");
        }
    }
}
