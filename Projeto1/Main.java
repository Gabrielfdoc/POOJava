import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Exercicio 1");
        System.out.println("2 - Exercicio 7");
        System.out.print("Escolha o exercício: ");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                new Ex1().ex1();
                break;
            /*case "2":
                new Ex2().ex2();
                break;*/
            default:
                System.out.println("O exercício escolhido não existe!");
                break;
        }
        scanner.close();
    }
}