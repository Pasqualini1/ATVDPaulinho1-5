package br.pasqualini.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        int opcao = 0;

        while (opcao != 3) {
            String[] opcoes = {"Adicionar paciente", 
                "Chamar próximo paciente", "Sair"};
            String escolha = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (escolha == null) {
                opcao = 3;  
            } else if (escolha.equals("Adicionar paciente")) {
                opcao = 1;
            } else if (escolha.equals("Chamar próximo paciente")) {
                opcao = 2;
            } else if (escolha.equals("Sair")) {
                opcao = 3;
            }

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Informe o nome do paciente:");
                    if (nome != null && !nome.trim().isEmpty()) {
                        clinica.adicionarPaciente(nome.trim());
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "Nome do paciente não pode ser vazio.");
                    }
                    break;
                case 2:
                    clinica.chamarProximoPaciente();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}

