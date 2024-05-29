
package br.pasqualini.exercicio4;

import java.util.Date;

public class Exercicio4 {

    public static void main(String[] args) {
            Deposito deposito = new Deposito();

        
        Produto produto1 = new Produto(1, "Produto 1", new Date(), "SP", "RJ");
        deposito.adicionarProduto(produto1);

        Produto produto2 = new Produto(2, "Produto 2", new Date(), "MG", "RS");
        deposito.adicionarProduto(produto2);
        
        Produto produto3 = new Produto(3, "Produto 3", new Date(), "PR", "RS");
        deposito.adicionarProduto(produto3);
        
        Produto produto4 = new Produto(4, "Produto 4", new Date(), "SC", "PR");
        deposito.adicionarProduto(produto4);
        
        Produto produto5 = new Produto(5, "Produto 5", new Date(), "MG", "SP");
        deposito.adicionarProduto(produto5);

        Produto produto6 = new Produto(6, "Produto 6", new Date(), "SP", "RS");
        deposito.adicionarProduto(produto6);
    
        Produto produto7 = new Produto(7, "Produto 7", new Date(), "PN", "RR");
        deposito.adicionarProduto(produto7);

        Produto produto8 = new Produto(8, "Produto 8", new Date(), "AM", "TO");
        deposito.adicionarProduto(produto8);

        Produto produto9 = new Produto(9, "Produto 9", new Date(), "MG", "RJ");
        deposito.adicionarProduto(produto9);
        
        Produto produto10 = new Produto(10, "Produto 10", new Date(), "MG", "ES");
        deposito.adicionarProduto(produto10);


        deposito.removerProduto();
    }
}