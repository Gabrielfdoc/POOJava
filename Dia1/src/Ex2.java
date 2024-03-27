import java.util.Scanner;

public class Ex2 {
    public static void ex2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Execução do exercicio abaixo\n\n");
        System.out.println("Digite um número positivo ou o programa será encerrado: ");

        float numeroLido = scanner.nextFloat();
        int contador = 0;
        float soma = 0;

        if (numeroLido < 0)
            return;

        while (numeroLido >= 0) {
            contador++;
            soma += numeroLido;
            System.out.println("Digite um número positivo ou o programa será encerrado: ");
            numeroLido = scanner.nextFloat();
        }

        System.out.println("O total de números lidos é de " + contador);
        System.out.println("A somatória dos números lidos é " + soma);
        System.out.println("A média dos números lidos é " + (soma / contador));
    }
}
