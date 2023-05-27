package SaudeMaisOuMenos;

public class Vendedor extends Funcionario{

    
    public int totalVendasMes;
    private final double comissao = 10;
    
    public Vendedor(){
        this.salario = 2000;
    }
    
    public Vendedor(double salario){
        this.salario = salario;
    }

    public Vendedor(String nome, String senha, String usuario, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
        this.cpf = cpf;
    }

    
    @Override
    public void recebeBonificacao(){
        this.salario = this.salario * 1.2 + this.comissao;
    }
}
