package model;

public class Produto {
    private String nome;
    protected double valor;
    private TipoEnvio tipoEnvio;

    public Produto(String nome, double valor, TipoEnvio tipoEnvio) {
        this.nome = nome;
        this.valor = valor;
        this.tipoEnvio = tipoEnvio;
    }


    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getTipoEntrega() {
        return this.tipoEnvio.getTipoEntrega();
    }

    public double getTaxaEntrega(){
        return this.tipoEnvio.getTaxaEntrega();
    }

    public int getPrazoEntrega(){
        return this.tipoEnvio.getPrazoEntrega();
    }

    public double getValorTotal(){
        return this.tipoEnvio.valorTotal(valor);
    }

}
