import java.util.Scanner;

class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private String email;
    private String idade;
    private String telefone;
    private String emailAdicional;
    private String telefoneFixo;

    public Cliente(String nome, String rg, String cpf, String email, String idade, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }

    public Cliente(String nome, String rg, String cpf, String email, String idade, String telefone, String emailAdicional, String telefoneFixo) {
        this(nome, rg, cpf, email, idade, telefone);
        this.emailAdicional = emailAdicional;
        this.telefoneFixo = telefoneFixo;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail adicional: " + emailAdicional);
        System.out.println("Telefone fixo: " + telefoneFixo);
        System.out.println();
    }

    public void alterarEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo e-mail principal: ");
        this.email = scanner.nextLine();
        System.out.println("E-mail alterado com sucesso!");
    }

    public void alterarTelefone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo telefone principal: ");
        this.telefone = scanner.nextLine();
        System.out.println("Telefone alterado com sucesso!");
    }

    public String getNome() {
        return nome;
    }


    
}