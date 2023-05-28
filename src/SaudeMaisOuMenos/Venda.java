package SaudeMaisOuMenos;

import java.util.List;

public class Venda{
    private Cliente cliente;
    private PlanoSaude planoSaude;
    public Vendedor vendedor;

    public Venda(Vendedor vendedor, Cliente cliente, PlanoSaude planoSaude) {
        this.cliente = cliente;
        this.planoSaude = planoSaude;
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }


}
