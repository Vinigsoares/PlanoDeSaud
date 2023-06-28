package SaudeMaisOuMenos;


public class PlanoSaude {
    private int id;
    String nomePlano;
    private int desconto;
    private int precoPlano;

    public PlanoSaude(int id, String nomePlano, int desconto, int precoPlano) {
        this.id = id;
        this.nomePlano = nomePlano;
        this.desconto = desconto;
        this.precoPlano = desconto*precoPlano - precoPlano;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNomePlano() {
        return nomePlano;
    }
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    
    public double getPrecoPlano() {
        return precoPlano;
    }

    public void setPrecoPlano(int precoPlano) {
        this.precoPlano = precoPlano;
    }
    
}

