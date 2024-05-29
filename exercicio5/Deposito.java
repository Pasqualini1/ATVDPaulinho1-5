
package br.pasqualini.exercicio5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Deposito {
    private List<List<Produto>> pilhas;

    
    public Deposito(int numPilhas) {
        this.pilhas = new ArrayList<>();
        for (int i = 0; i < numPilhas; i++) {
            pilhas.add(new ArrayList<>());
        }
    }

    
    public void adicionarProduto(int numPilha) {
        int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto:");
    

        Produto produto = new Produto(codProduto, descricao, null, null, null); // Você deve adicionar os outros atributos
        pilhas.get(numPilha - 1).add(produto);
        exibirPilhas();
    }

    
    public void removerProduto(int numPilha) {
        List<Produto> pilhaSelecionada = pilhas.get(numPilha - 1);
        if (!pilhaSelecionada.isEmpty()) {
            pilhaSelecionada.remove(pilhaSelecionada.size() - 1);
            exibirPilhas();
        } else {
            JOptionPane.showMessageDialog(null, "Não há produtos na pilha " + numPilha + ".");
        }
    }

    
    private void exibirPilhas() {
        StringBuilder mensagem = new StringBuilder();
        for (int i = 0; i < pilhas.size(); i++) {
            mensagem.append("Pilha ").append(i + 1).append(":\n");
            List<Produto> pilha = pilhas.get(i);
            for (Produto produto : pilha) {
                mensagem.append("- ").append(produto.getDescricao()).append("\n");
            }
            mensagem.append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
