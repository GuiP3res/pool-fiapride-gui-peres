package br.com.fiapride.model;

public abstract class Veiculo {
    private String modelo;
    private String placa;

    public Veiculo() {
        this("Desconhecido", "ABC-1234");
    }

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public void atualizarPlaca(String novaPlaca) {
        setPlaca(novaPlaca);
    }

    public abstract double calcularAutonomia();
}
