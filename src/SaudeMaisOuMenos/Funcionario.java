package SaudeMaisOuMenos;

public class Funcionario extends Pessoa {
    String senha;
    String usuario;
    public String nCtps;
    protected double salario = 1000.0;
    
    public void recebeBonificacao(){
        System.out.println("BonificaÃ§Ã£o de ninguÃ©m");
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
