import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercicios disponiveis para escolha: ");
        System.out.println("1 - Exercicio 1 de laços condicionais");
        System.out.println("2 - Exercicio 1 do enquanto, de laços de repetição");
        System.out.println("3 - Exercicio 1 de vetores");
        System.out.println("4 - Exercicio 3 de vetores");
        System.out.print("Escolha o exercício: ");

        int seletor = scanner.nextInt();

        switch (seletor) {
            case 1:
                Ex1.ex1();
                break;
            case 2:
                Ex2.ex2();
                break;
            case 3:
                Ex3.ex3();
                break;
            case 4:
                Ex4.ex4();
                break;
            default:
                System.out.println("O exercício escolhido não existe!");
                break;
        }
    }
}
