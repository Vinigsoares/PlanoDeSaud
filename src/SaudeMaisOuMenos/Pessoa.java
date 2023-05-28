package SaudeMaisOuMenos;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    
    public void setNome(String nome) {
        this.cpf = nome;
    }

    public String getNome() {
        return nome;
    }
    

    
    public String setAndGetCpf(String cpf){
        this.cpf = cpf;
        return this.cpf;
    }
}
