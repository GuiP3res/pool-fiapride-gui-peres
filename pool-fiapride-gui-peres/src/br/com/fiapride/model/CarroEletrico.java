package br.com.fiapride.model;

import br.com.fiapride.interfaces.Eletrico;

public class CarroEletrico extends Veiculo implements Eletrico {
    private double nivelBateria;

    public CarroEletrico(String modelo, String placa, double nivelBateria) {
        super(modelo, placa);
        this.nivelBateria = nivelBateria;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void carregarBateria(double quantidade) {
        this.nivelBateria += quantidade;
        if (this.nivelBateria > POTENCIA_MAXIMA) {
            this.nivelBateria = POTENCIA_MAXIMA;
        }
        System.out.println("Bateria carregada. Nível atual: " + this.nivelBateria);
    }

    @Override
    public double calcularAutonomia() {
        // Exemplo de cálculo de autonomia para carro elétrico
        return nivelBateria * 5; // 5 km por unidade de bateria
    }
}
