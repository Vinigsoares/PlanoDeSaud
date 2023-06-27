package SaudeMaisOuMenos;

import java.io.Serializable;

public abstract class Pessoa implements Serializable{
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }    

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
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

    void set(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
