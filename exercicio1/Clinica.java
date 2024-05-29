
package br.pasqualini.exercicio1;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Clinica {
    private Queue<String> filaDePacientes = new LinkedList<>();
    private static final int LIMITE_SENHAS = 20;

    public void adicionarPaciente(String nome) {
        if (filaDePacientes.size() < LIMITE_SENHAS) {
            filaDePacientes.add(nome);
            JOptionPane.showMessageDialog(null, 
                    "Paciente " + nome + " adicionado à fila.");
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Fila cheia. Não é possível adicionar mais pacientes hoje.");
        }
    }

    public void chamarProximoPaciente() {
        if (filaDePacientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                    "Nenhum paciente na fila.");
        } else {
            String proximoPaciente = filaDePacientes.poll();
            JOptionPane.showMessageDialog(null, 
                    "Próximo paciente: " + proximoPaciente);
        }
    }
}
