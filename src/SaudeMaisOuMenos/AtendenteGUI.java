
package SaudeMaisOuMenos;


import static SaudeMaisOuMenos.SistemaMaisOuMenosSaude.getClientes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtendenteGUI {

    private JFrame frame;
    private JPanel panel;
    private JButton venderPlanoButton;
    private JButton registrarPagamentoButton;
    private JButton buscarClienteButton;
    private JButton cancelarPagamentoButton;
    private JButton adicionarDependenteButton;

    public AtendenteGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Módulo de Atendente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        venderPlanoButton = new JButton("Vender Plano");
        registrarPagamentoButton = new JButton("Registrar Pagamento");
        buscarClienteButton = new JButton("Buscar Cliente");
        cancelarPagamentoButton = new JButton("Cancelar Pagamento");
        adicionarDependenteButton = new JButton("Adicionar Dependente");

        venderPlanoButton.addActionListener((ActionEvent e) -> {
            // Lógica para vender plano
            String cpf = JOptionPane.showInputDialog(frame, "Digite o CPF do cliente:");
            Cliente cliente = Gerente.buscarClientePorCPF(cpf, getClientes());
            if (cliente != null) {
                cliente.venderPlano();
                JOptionPane.showMessageDialog(frame, "Plano vendido com sucesso para o cliente: " + cliente.getNome());
            } else {
                JOptionPane.showMessageDialog(frame, "Cliente não encontrado.");
            }       });
        // Adicionando componentes ao painel
        panel.add(venderPlanoButton);

        // Adicionando painel ao quadro
        frame.add(panel);

        // Configurações do quadro
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
}
}

