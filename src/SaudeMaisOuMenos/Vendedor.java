package SaudeMaisOuMenos;

import static SaudeMaisOuMenos.SistemaMaisOuMenosSaude.getClientes;
import static SaudeMaisOuMenos.SistemaMaisOuMenosSaude.getVendedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor extends Funcionario{

    public int totalVendas;
    private final double comissao;
    private static  List<Venda> vendas;
    public Venda venda;
    
        public Vendedor(String nome, String senha, String usuario, String cpf) {
        super(nome, senha,usuario, cpf);
        this.comissao = 10;
        this.salario = 2000;
    }
    
        public Cliente buscarClientePorCPF(String cpf, List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null; // Retorna null se o cliente não for encontrado
    }
    
    public static void cadastrarVenda(Scanner scanner, List<PlanoSaude> planosSaude) {
        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = Gerente.buscarClientePorCPF(cpfCliente, getClientes());
        System.out.print("nCtps do Vendedor: ");
        String nctpsVendedor = scanner.nextLine();
        Vendedor vendedor = Gerente.buscarVendedor(nctpsVendedor, getVendedor());

        if (cliente != null) {
            System.out.print("Nome do Plano de Saúde Vendido: ");
            String nomePlano = scanner.nextLine();
            PlanoSaude planoSaude = buscarPlanoSaudePorNome(nomePlano, planosSaude);

            if (planoSaude != null) {
                Venda venda = new Venda(vendedor, cliente, planoSaude);
                vendas.add(venda);
                System.out.println("Venda cadastrada com sucesso para o Vendedor " + vendedor.getNome() + "!");
            } else {
                System.out.println("Plano de Saúde não encontrado.");
            }
        }

        System.out.println();
    }
    
    public static PlanoSaude buscarPlanoSaudePorNome(String nomePlano, List<PlanoSaude> planosSaude) {
        for (PlanoSaude planoSaude : planosSaude) {
            if (planoSaude.nomePlano.equalsIgnoreCase(nomePlano)) {
                return planoSaude;
            }
        }

        return null;
    }
    public static void mostrarPlano(List<PlanoSaude> planosSaude ){
        System.out.println("Plano de Saúde disponíveis:");
        for (PlanoSaude plano : planosSaude) {
        System.out.println("ID: " + plano.getId() + ", Nome: " + plano.getNomePlano());
        }
    }
    
    @Override
    public void recebeBonificacao(){
        this.salario = this.salario * 1.2 + this.comissao;
    }
    
}

// TESTE HT

