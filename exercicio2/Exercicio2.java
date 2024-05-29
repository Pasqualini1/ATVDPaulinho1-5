package br.pasqualini.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    
     private static SistemaAtendimento sistema = new SistemaAtendimento();
    private static int senha = 1;
    
    public static void main(String[] args) {
                while (true) {
            String[] options = {"Adicionar Cliente", "Chamar Cliente", "Sair"};
            int opcao = JOptionPane.showOptionDialog(null, 
                    "Escolha uma opção", "Sistema de Atendimento",
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);

            switch (opcao) {
                case 0:
                    adicionarCliente();
                    break;
                case 1:
                    chamarCliente();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void adicionarCliente() {
        try {
            String nome = JOptionPane.showInputDialog(null, 
                    "Nome do Cliente:", "Adicionar Cliente", 
                    JOptionPane.QUESTION_MESSAGE);
            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                        "Nome não pode ser vazio.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            String anoNascimentoStr = JOptionPane.showInputDialog(null, 
                    "Ano de Nascimento do Cliente:", 
                    "Adicionar Cliente", 
                    JOptionPane.QUESTION_MESSAGE);
            if (anoNascimentoStr == null || anoNascimentoStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                        "Ano de Nascimento não pode ser vazio.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            int anoNascimento;
            try {
                anoNascimento = Integer.parseInt(anoNascimentoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                        "Ano de Nascimento inválido.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Cliente cliente = new Cliente(senha++, nome, anoNascimento);
            sistema.adicionarCliente(cliente);
            JOptionPane.showMessageDialog(null, 
                    "Cliente adicionado: " + cliente, 
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro ao adicionar cliente.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void chamarCliente() {
        Cliente cliente = sistema.chamarCliente();
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, 
                    "Chamando cliente: " + cliente, 
                    "Cliente Chamado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Nenhum cliente na fila.", 
                    "Fila Vazia", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
