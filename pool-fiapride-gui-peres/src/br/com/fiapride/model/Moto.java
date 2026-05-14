package br.com.fiapride.model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, String placa, int cilindradas) {
        super(modelo, placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAutonomia() {
        // Exemplo de cálculo de autonomia para moto
        return 200; // km
    }
}
