
package br.pasqualini.exercicio4;

import java.util.Date;

public class Produto {
   
    private int codProduto;
    private String descricao;
    private Date dataEntrada;
    private String ufOrigem;
    private String ufDestino;

    
    public Produto(int codProduto, 
            String descricao, 
            Date dataEntrada, 
            String ufOrigem, 
            String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    
    public int getCodProduto() {
        return codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }
}