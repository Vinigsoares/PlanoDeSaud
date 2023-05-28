package SaudeMaisOuMenos;

import static SaudeMaisOuMenos.SistemaMaisOuMenosSaude.getClientes;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(String nome, String senha, String usuario, String cpf) {
        super(nome, senha, usuario, cpf);
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
    
    public static void cadastrarVendedor(Scanner scanner, List<Vendedor> vendedores) {
        System.out.println("Opção selecionada: Cadastrar Vendedor");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        Vendedor vendedor = new Vendedor(nome, cpf, usuario, senha);
        vendedores.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
        System.out.println();
    }
    
    public static void cadastrarAtendente(Scanner scanner, List<Atendente> atendentes) {
        System.out.println("Opção selecionada: Cadastrar Atendente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
    
        Atendente atendente = new Atendente(nome, cpf, usuario, senha);
        atendentes.add(atendente);
        System.out.println("Atendente cadastrado com sucesso!");
        System.out.println();
    }
    
        public static void excluirCliente(Scanner scanner) {
            Cliente cliente = buscarClientePorCPF(scanner.nextLine(), getClientes());
            if (cliente != null) {
                getClientes().remove(cliente);
                System.out.println("Cliente excluído com sucesso!");
            }else {
                System.out.println("Não possui clientes cadastrados!");
            }
        System.out.println();
    }
}

