
package br.pasqualini.exercicio4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Deposito {
     private List<Produto> pilha;

    
    public Deposito() {
        this.pilha = new ArrayList<>();
    }

    
    public void adicionarProduto(Produto produto) {
        pilha.add(produto);
        exibirPilha();
    }

    
    public void removerProduto() {
        if (!pilha.isEmpty()) {
            pilha.remove(pilha.size() - 1);
            exibirPilha();
        } else {
            JOptionPane.showMessageDialog(null, "Não há produtos na pilha.");
        }
    }

    
    private void exibirPilha() {
        StringBuilder mensagem = new StringBuilder("Pilha atual:\n");
        for (Produto produto : pilha) {
            mensagem.append("- ").append(produto.getDescricao()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
