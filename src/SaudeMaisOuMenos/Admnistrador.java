/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaudeMaisOuMenos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class Admnistrador {
    
    public static void cadastrarGerente(Scanner scanner, List<Gerente> gerentes) {
        System.out.println("Opção selecionada: Cadastrar Gerente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Gerente gerente = new Gerente(nome, cpf, usuario, senha);
        gerentes.add(gerente);
        System.out.println("Gerente cadastrado com sucesso!");
        System.out.println();
    }
    
    public static void cadastrarPlanoSaude(Scanner scanner, List<PlanoSaude> planosSaude) {
        System.out.println("Opção selecionada: Cadastrar Plano de Saúde");
        System.out.print("Id do Plano: ");
        int id = scanner.nextInt();
        System.out.print("Nome do Plano: ");
        String nomePlano = scanner.nextLine();
        System.out.print("Preço do Plano: ");
        int precoPlano = scanner.nextInt();
        System.out.print("Percentual de Desconto (%): ");
        int desconto = scanner.nextInt();
        scanner.nextLine();
                                
        PlanoSaude planoSaude = new PlanoSaude(id, nomePlano, desconto, precoPlano );
        planosSaude.add(planoSaude);
        System.out.println("Plano de Saúde cadastrado com sucesso!");
        System.out.println();
    }
}
