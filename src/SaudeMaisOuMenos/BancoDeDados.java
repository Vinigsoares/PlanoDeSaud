
package SaudeMaisOuMenos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Thiago
 
public class BancoDeDados implements Serializable{
    private Map<String,nome> nome = new HashMap<>();
    public final static String BD_PATH = NoBankGUI.ROOT + "banco_de_dados"; 

    public BancoDeDados() {
        this.nome = new HashMap<>();
    }
    
    public void addCredencial(String chave, Credenciais dados){
        nome.put(chave, dados);
    }

    public Map<String, Credenciais> getCredenciais() {
        return nome;
    }
    
    
}
*/
