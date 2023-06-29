
package SaudeMaisOuMenos;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */

public class BancoDeDados {    

    //São os atributos do tipo arraysList da classe banco de dados, eles servem para simular um banco de dados real e guardar informações

    private ArrayList<String> planosAceitos;
    private ArrayList<Double> salarios = new ArrayList();
    private ArrayList <Cliente> listaDeClientes = new ArrayList ();
    private ArrayList <PlanoSaude> listaDePlanosSaude = new ArrayList();
    private ArrayList <Dependente> listaDeDependentes = new ArrayList ();
    private ArrayList <Especialidade> listaDeEspecialidades = new ArrayList ();
   
    
    //métodos set e get dos atributos da classe banco de dados
    
    public ArrayList<Double> getSalarios() {
        return salarios;
    }

    public void setSalarios(ArrayList<Double> salarios) {
        this.salarios = salarios;
    }
    
    public ArrayList<String> getPlanosAceitos() {
        return planosAceitos;
    }

    public void setPlanosAceitos(ArrayList<String> planosAceitos) {
        this.planosAceitos = planosAceitos;
    }
    
    public ArrayList <Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList <Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }
    
    public ArrayList<Dependente> getListaDeDependentes() {
        return listaDeDependentes;
    }

    public void setListaDeDependentes(ArrayList<Dependente> listaDeDependentes) {
        this.listaDeDependentes = listaDeDependentes;
    }

    public ArrayList <PlanoSaude> getListaDePlanosDeSaude() {
        return listaDePlanosSaude;
    }

    public void setListaDePlanosDeSaude(ArrayList <PlanoSaude> listaDePlanosDeSaude) {
        this.listaDePlanosSaude = listaDePlanosDeSaude;
    }

    public ArrayList <Especialidade> getListaDeEspecialidades() {
        return listaDeEspecialidades;
    }

    public void setListaDeEspecialidades(ArrayList <Especialidade> listaDeEspecialidades) {
        this.listaDeEspecialidades = listaDeEspecialidades;
    }

  
}

