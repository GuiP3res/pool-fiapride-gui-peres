package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private double saldo;
    private int idade;

    public Passageiro(String nome, double saldo, int idade) {
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome não pode ser vazio.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18) { // Supondo idade mínima de 18 anos
            this.idade = idade;
        } else {
            System.out.println("Idade mínima não atingida.");
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor para adicionar deve ser positivo.");
        }
    }

    public void descontarSaldo(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor para descontar deve ser positivo.");
        }
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Idade: " + this.idade);
    }
}
