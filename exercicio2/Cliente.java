
package br.pasqualini.exercicio2;

public class Cliente {
    private int senha;
    private String nome;
    private int anoNascimento;

    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return 2024 - this.anoNascimento; 
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\n" + 
                " Senha = " + senha + "\n " +
                "Nome = " + nome + "\n " +
                "Idade = " + getIdade() + "\n ";
    }
}
