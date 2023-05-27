/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaudeMaisOuMenos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtendenteGUI extends JFrame {
    private final Atendente atendente;
    private JTextField cpfTextField;
    private JTextField vendaIdTextField;
    private JTextField dependenteNomeTextField;
    private JTextField dependenteIdadeTextField;

    public AtendenteGUI(Atendente atendente) {
        this.atendente = atendente;
        initialize();
    }

    private void initialize() {
        // Set up the JFrame
        setTitle("Atendente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));

        // Create labels and text fields
        JLabel cpfLabel = new JLabel("CPF:");
        cpfTextField = new JTextField();
        JLabel vendaIdLabel = new JLabel("ID da Venda:");
        vendaIdTextField = new JTextField();
        JLabel dependenteNomeLabel = new JLabel("Nome do Dependente:");
        dependenteNomeTextField = new JTextField();
        JLabel dependenteIdadeLabel = new JLabel("Idade do Dependente:");
        dependenteIdadeTextField = new JTextField();

        // Add labels and text fields to the main panel
        mainPanel.add(cpfLabel);
        mainPanel.add(cpfTextField);
        mainPanel.add(vendaIdLabel);
        mainPanel.add(vendaIdTextField);
        mainPanel.add(dependenteNomeLabel);
        mainPanel.add(dependenteNomeTextField);
        mainPanel.add(dependenteIdadeLabel);
        mainPanel.add(dependenteIdadeTextField);

        // Create buttons
        JButton cancelarPagamentoButton = new JButton("Cancelar Pagamento");
        JButton adicionarDependenteButton = new JButton("Adicionar Dependente");

        // Add action listeners to the buttons
        cancelarPagamentoButton.addActionListener((ActionEvent e) -> {
            cancelarPagamento();
        });

        adicionarDependenteButton.addActionListener((ActionEvent e) -> {
            adicionarDependente();
        });

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelarPagamentoButton);
        buttonPanel.add(adicionarDependenteButton);

        // Add the main panel and button panel to the JFrame
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Display the JFrame
        setVisible(true);
    }

    private void cancelarPagamento() {
        String cpf = cpfTextField.getText();
        int vendaId = Integer.parseInt(vendaIdTextField.getText());

        Cliente cliente = Cliente.buscarCliente(cpf);
        if (cliente != null) {
            Venda venda = null;
            for (Venda v : Cliente.getVendas()) {
                if (v.getId() == vendaId) {
                    venda = v;
                    break;
                }
            }
            if (venda != null) {
                atendente.cancelarPagamento(cliente, venda);
                JOptionPane.showMessageDialog(this, "Pagamento cancelado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Venda não encontrada!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
        }
    }

    private void adicionarDependente() {
        String cpf = cpfTextField.getText();
        String nome = dependenteNomeTextField.getText();
        int idade = Integer.parseInt(dependenteIdadeTextField.getText());

      

        Cliente cliente = Cliente.buscarCliente(cpf);
        if (cliente != null) {
            Dependente dependente = new Dependente(nome, idade);
            atendente.adicionarDependente(cliente, dependente);
            JOptionPane.showMessageDialog(this, "Dependente adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
        }
    }

    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        AtendenteGUI atendenteGUI = new AtendenteGUI(atendente);
    }
}


