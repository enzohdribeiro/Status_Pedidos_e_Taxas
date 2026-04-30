package controller;
import model.Produto;
import model.TipoEnvio;

public class Impressora {
    public static void imprimir(Produto produto){
        System.out.println("-----------------------------");
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.print("Tipo de envio: "+produto.getTipoEntrega());
        System.out.print(" | Taxa: "+produto.getTaxaEntrega());
        System.out.println(" | Prazo: "+ produto.getPrazoEntrega()+" dias.");
        System.out.println("Preço total: "+ produto.getValorTotal());
    }
}
