package model;

public enum TipoEnvio {
    PADRAO(12.5, 7, "Padrão"),
    EXPRESSO(17, 4,"Expresso"),
    INTERNACIONAL(29, 30,"Internacional");

    private final double taxaEntrega;
    private final int prazoEntrega;
    private final String tipo;

    TipoEnvio(double taxaEntrega, int prazoEntrega, String tipo) {
        this.taxaEntrega = taxaEntrega;
        this.prazoEntrega = prazoEntrega;
        this.tipo = tipo;
    }

    public String getTipoEntrega(){
        return tipo;
    }

    public double valorTotal(double valor){
        return valor+taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

}

