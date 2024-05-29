
package br.pasqualini.exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
            int numPilhas = 5;
        Deposito deposito = new Deposito(numPilhas);

        
        while (true) {
            String escolha = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n1. Adicionar produto\n2. Remover produto\n3. Sair");
            if (escolha == null) {
                break; 
            }
            switch (escolha) {
                case "1":
                    int numPilhaAdd = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o número da pilha para adicionar o produto (1 a " + numPilhas + "):"));
                    if (numPilhaAdd < 1 || numPilhaAdd > numPilhas) {
                        JOptionPane.showMessageDialog(null,
                                "Número de pilha inválido.");
                        continue; 
                    }
                    deposito.adicionarProduto(numPilhaAdd);
                    break;
                case "2":
                    int numPilhaRem = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da pilha para remover o produto (1 a " + numPilhas + "):"));
                    if (numPilhaRem < 1 || numPilhaRem > numPilhas) {
                        JOptionPane.showMessageDialog(null, "Número de pilha inválido.");
                        continue; 
                    }
                    deposito.removerProduto(numPilhaRem);
                    break;
                case "3":
                    return; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}