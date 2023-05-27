package SaudeMaisOuMenos;

public abstract class Pessoa {
    String nome;
    String cpf;


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
