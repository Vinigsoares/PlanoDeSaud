package SaudeMaisOuMenos;

public class Venda {
    private Cliente cliente;
    private PlanoSaude planoSaude;

    public Venda(Cliente cliente, PlanoSaude planoSaude) {
        this.cliente = cliente;
        this.planoSaude = planoSaude;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
