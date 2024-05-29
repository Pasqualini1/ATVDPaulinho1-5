package br.pasqualini.exercicio2;

import java.util.LinkedList;
import java.util.Queue;

public class SistemaAtendimento {
     private Queue<Cliente> filaPrioritaria = new LinkedList<>();
    private Queue<Cliente> filaNormal = new LinkedList<>();
    private int contadorPrioritarios = 0;

    public void adicionarCliente(Cliente cliente) {
        if (cliente.getIdade() > 65) {
            filaPrioritaria.add(cliente);
        } else {
            filaNormal.add(cliente);
        }
    }

    public Cliente chamarCliente() {
        if (contadorPrioritarios < 2 && !filaPrioritaria.isEmpty()) {
            contadorPrioritarios++;
            return filaPrioritaria.poll();
        } else if (!filaNormal.isEmpty()) {
            contadorPrioritarios = 0;
            return filaNormal.poll();
        } else if (!filaPrioritaria.isEmpty()) {
            return filaPrioritaria.poll();
        } else {
            return null; 
        }
    }
}
