package br.com.fiapride.model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String placa, int numeroPortas) {
        super(modelo, placa);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularAutonomia() {
        // Exemplo de cálculo de autonomia para carro
        return 500; // km
    }
}
