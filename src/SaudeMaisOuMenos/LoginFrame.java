
package SaudeMaisOuMenos;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class LoginFrame extends JFrame 
{
   private JTextField txtNomePaciente; 
   private JPasswordField txtCpf; 
   private JButton btnCadastrar;
   private JLabel lblnome;
   private JLabel lblcpf;
   private JLabel lblidade;
   private JLabel lbldatanasc;
   private JLabel lblMsg;
   
   public LoginFrame(Pessoa pessoa){
      super( "Login" );
      setLayout( new FlowLayout() );
      
      //Constroi os componentes
      btnCadastrar = new JButton("Salvar");
      txtNomePaciente = new JTextField(10);     
      txtCpf = (JPasswordField) new JTextField(10);
      lblnome = new JLabel("Nome");
      lblcpf = new JLabel("CPF");
      lblidade = new JLabel("Idade");
      lbldatanasc = new JLabel("Data de nascimento");
      lblMsg = new JLabel("Cliente cadastrado com sucesso");
      
      //Adiciona os componentes
      add(lblnome);
      add(lblcpf);
      add(lblidade);
      add(lbldatanasc);
      add(txtNomePaciente);
      add(lblcpf);
      add(txtCpf );
      add(btnCadastrar);     
      add(lblMsg); 
    
     btnCadastrar.addActionListener(e -> {
          pessoa.setNome(txtNomePaciente.getText(), txtCpf.getText());
          System.out.println(txtNomePaciente.getText() + txtCpf.getText());
          this.dispose(); //fecha a caixa de diálogo
     }); 
   }
   
   public void exibir(){
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize(400, 100);
        this.setVisible(true);
   }
}
