
package br.pasqualini.exercicio3;

import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

public class PilhaDeLivros {
    private Stack<Livro> pilhaDeLivros;

    public PilhaDeLivros() {
        pilhaDeLivros = new Stack<>();
    }

    public void adicionarLivro() {
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        String autor = JOptionPane.showInputDialog("Digite o autor do livro:");

        Livro novoLivro = new Livro(titulo, autor);
        pilhaDeLivros.push(novoLivro);
        JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
    }

    public void listarLivros() {
        StringBuilder lista = new StringBuilder();
        lista.append("Lista de Livros na Pilha:\n");
        for (Livro livro : pilhaDeLivros) {
            lista.append(livro).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    public void retirarLivro() {
        if (pilhaDeLivros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A pilha de livros está vazia.");
            return;
        }

        Livro livroRemovido = pilhaDeLivros.pop();
        JOptionPane.showMessageDialog(null, "Livro removido: " + livroRemovido);
    }

    public void exibirMenu() {
        String[] opcoes = {"Adicionar Livro", "Listar Livros", "Retirar Livro", "Sair"};

        int opcao;
        do {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    adicionarLivro();
                    break;
                case 1:
                    listarLivros();
                    break;
                case 2:
                    retirarLivro();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}
