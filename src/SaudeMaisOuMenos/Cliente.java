package SaudeMaisOuMenos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    //static Cliente buscar;
    public String nSUS;
    //public Dependente d;
    private String dataDeNascimento;
    private int idade;
    private PlanoSaude PlanoSaude;
    public static List<Dependente> dependentes = new ArrayList<>();

    public Cliente(String nome, String cpf, int idade, String dataDeNascimento) {
        super(nome, cpf);
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.PlanoSaude = null;
        Cliente.dependentes = new ArrayList<>();
    }
 

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.PlanoSaude = planoSaude;
    }
     public String getStatusPlanoSaude() {
        if (PlanoSaude != null) {
            return "Ativo";
        } else {
            return "Cancelado";
        }
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

    public void removerDependente(Dependente dependente) {
        dependentes.remove(dependente);
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public boolean possuiDependentes() {
        return dependentes.isEmpty();
    }

    public void cancelarPlanoSaude() {
        if (PlanoSaude != null) {
            PlanoSaude = null;
            System.out.println("Plano de Saúde cancelado com sucesso!");
        } else {
            System.out.println("O cliente não possui um Plano de Saúde ativo.");
        }
    }

    void venderPlano() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
