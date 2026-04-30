package main;

import model.Produto;
import model.TipoEnvio;
import controller.*;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Controle", 150, TipoEnvio.PADRAO);
        Produto p2 = new Produto("TV", 1500, TipoEnvio.EXPRESSO);
        Produto p3 = new Produto("Jaqueta", 250, TipoEnvio.INTERNACIONAL);

        Impressora.imprimir(p1);
        Impressora.imprimir(p2);
        Impressora.imprimir(p3);
    }
}
