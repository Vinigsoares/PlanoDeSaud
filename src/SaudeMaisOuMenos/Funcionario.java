package SaudeMaisOuMenos;

public class Funcionario extends Pessoa {
    private String senha;
    private String usuario;
    public String nCtps;
    protected double salario = 1000.0;
    
    
    public Funcionario(String nome, String cpf, String senha, String usuario) {
        super(nome,cpf);
        this.senha = senha;
        this.usuario = usuario;
    }
    
    public void recebeBonificacao(){
        System.out.println("Bonificacao de ninguÃ©m");
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
