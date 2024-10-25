import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Ex1 {
    private List<Cliente> clientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void ex1() {
        System.out.println("Execução do exercicio abaixo: \n\n");

        while (true) {
            System.out.println("1 - Cadastrar dados de um novo cliente");
            System.out.println("2 - Atualizar e-mail de um cliente existente");
            System.out.println("3 - Atualizar telefone de um cliente existente");
            System.out.println("4 - Exibir dados de um cliente existente");
            System.out.println("5 - Sair");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    subMenuCadastrarClientes();
                    break;
                case "2":
                    subMenuAtualizarEmail();
                    break;
                case "3":
                    subMenuAtualizarTelefone();
                    break;
                case "4":
                    int contador = 0;
                    for (Cliente cliente : clientes) {
                        contador++;
                        System.out.println("Cliente " + contador + ": ");
                        cliente.exibeDados();
                    }
                    break;
                case "5":
                    return;
                default:
                    System.out.println("A opção escolhida não existe!");
            }
        }
    }

    private void exibeClientesParaAtualizacao() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
        }
    }

    private void cadastrarCliente() {
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu RG: ");
        String rg = scanner.nextLine();
        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o seu e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        String idade = scanner.nextLine();
        System.out.print("Digite o seu telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite um e-mail adicional: ");
        String emailAdicional = scanner.nextLine();
        System.out.print("Digite um telefone fixo: ");
        String telefoneFixo = scanner.nextLine();

        Cliente cliente = new Cliente(nome, rg, cpf, email, idade, telefone, emailAdicional, telefoneFixo);

        if (!cliente.getNome().isBlank()) {
            clientes.add(cliente);
            System.out.println("Cliente adicionado com sucesso\n");
        } else {
            System.out.println("O nome para o cliente digitado é inválido!\n");
        }
    }

    private void subMenuCadastrarClientes() {
        cadastrarCliente();
        while (true) {
            System.out.println("1 - Se deseja adicionar um novo cliente");
            System.out.println("2 - Se deseja sair");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    cadastrarCliente();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("A opção escolhida não existe!\n");
            }
        }
    }

    private void subMenuAtualizarEmail() {
        atualizarEmail();
        while (true) {
            System.out.println("1 - Se deseja alterar o email de outro cliente");
            System.out.println("2 - Se deseja sair");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    atualizarEmail();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("A opção escolhida não existe!\n");
            }
        }
    }

private void atualizarEmail() {
    exibeClientesParaAtualizacao();

    System.out.print("Insira o nome do cliente que deseja alterar o e-mail: ");
    Scanner scanner = new Scanner(System.in);
    String nomeClienteAtualizacao = scanner.nextLine();

    Cliente clienteAtualizacao = clientes.stream()
            .filter(cliente -> cliente.getNome().equals(nomeClienteAtualizacao))
            .findFirst()
            .orElse(null);

    if (clienteAtualizacao != null) {
        clienteAtualizacao.alterarEmail();
    } else {
        System.out.println("Cliente não existe!");
    }
}

private void subMenuAtualizarTelefone() {
    atualizarTelefone();
    while (true) {
        System.out.println("1 - Se deseja alterar o telefone de outro cliente");
        System.out.println("2 - Se deseja sair");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                atualizarEmail();
                break;
            case "2":
                return;
            default:
                System.out.println("A opção escolhida não existe!\n");
        }
    }
}

private void atualizarTelefone() {
    exibeClientesParaAtualizacao();

    System.out.print("Insira o nome do cliente que deseja alterar o telefone: ");
    Scanner scanner = new Scanner(System.in);
    String nomeClienteAtualizacao = scanner.nextLine();

    Cliente clienteAtualizacao = clientes.stream()
            .filter(cliente -> cliente.getNome().equals(nomeClienteAtualizacao))
            .findFirst()
            .orElse(null);

    if (clienteAtualizacao != null) {
        clienteAtualizacao.alterarTelefone();
    } else {
        System.out.println("Cliente não existe!");
    }
}

}