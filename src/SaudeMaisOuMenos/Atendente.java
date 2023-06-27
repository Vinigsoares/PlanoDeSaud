package SaudeMaisOuMenos;

import java.util.List;
import java.util.Scanner;

public class Atendente extends Funcionario {


    public Atendente(String nome, String cpf, String senha, String usuario) {
        super(nome,cpf, senha, usuario);
        this.salario = 2000;
    }
 
     public static void cadastrarCliente(Scanner scanner, List<Cliente> clientes) {
        System.out.println("Opção selecionada: Cadastrar Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Data de nascimento: ");
        String dataDeNascimento = scanner.nextLine();
        scanner.nextLine(); 

        Cliente cliente = new Cliente(nome, cpf, idade, dataDeNascimento);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println();
    }
     
        public static Cliente buscarClientePorCPF(String cpfCliente, List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                System.out.println("-------Dados do Cliente-------");
                System.out.println("Nome: "+ cliente.getNome());
                System.out.println("Cpf: "+cliente.getCpf());
                System.out.println("Idade: "+cliente.getIdade());
                if(cliente.possuiDependentes()== false){
                    System.out.println("Cliente não possui dependente!");
                }else{
                System.out.println("Dependente: "+cliente.getDependentes());
                return cliente;
                }
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }
    
    public static void cadastrarDependente(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Dependente");
        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();
        List<Cliente> clientes = SistemaMaisOuMenosSaude.getClientes();
        Cliente cliente = buscarClientePorCPF(cpfCliente, clientes);

        if (cliente != null) {
            System.out.print("Nome do Dependente: ");
            String nomeDependente = scanner.nextLine();
            System.out.print("Idade do Dependente: ");
            int idadeDependente = scanner.nextInt();
            scanner.nextLine(); 

            Dependente dependente = new Dependente(nomeDependente,idadeDependente);
            Cliente.dependentes.add(dependente);
            System.out.println("Dependente cadastrado com sucesso para o cliente " + cliente.getNome() + "!");
        } else {
            System.out.println("Cliente não encontrado. Cadastre o cliente antes de adicionar um dependente.");
        }

        System.out.println();
    }
    
        public static void cadastrarCancelamentoPlano(Scanner scanner, List<Cliente> clientes ) {
            System.out.print("CPF do Cliente: ");
            String cpfCliente = scanner.nextLine();
            Cliente cliente = buscarClientePorCPF(cpfCliente, clientes);

            if (cliente != null) {
                cliente.cancelarPlanoSaude();
                System.out.println("Plano de Saúde cancelado com sucesso para o cliente " + cliente.getNome() + "!");
            }

            System.out.println();
    }
        

}
