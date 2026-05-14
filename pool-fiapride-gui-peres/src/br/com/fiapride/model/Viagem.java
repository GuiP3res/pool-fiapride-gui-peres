package br.com.fiapride.model;

public class Viagem {
    private Passageiro solicitante;
    private String origem;
    private String destino;
    private double valor;

    public Viagem(Passageiro solicitante, String origem, String destino, double valor) {
        this.solicitante = solicitante;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public Passageiro getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Passageiro solicitante) {
        this.solicitante = solicitante;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void finalizarViagem() {
        if (solicitante != null) {
            solicitante.descontarSaldo(this.valor);
            System.out.println("Viagem de " + origem + " para " + destino + " finalizada para " + solicitante.getNome() + ". Valor: " + valor);
        } else {
            System.out.println("Passageiro não associado à viagem.");
        }
    }
}
