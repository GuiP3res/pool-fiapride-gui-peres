package br.com.fiapride;

import br.com.fiapride.model.*;
import br.com.fiapride.interfaces.Eletrico;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Aula 1: Classes e Objetos ---");
        Passageiro passageiro1 = new Passageiro("Alice", 100.0, 25);
        passageiro1.mostrarDados();

        System.out.println("\n--- Aula 2: Métodos ---");
        passageiro1.adicionarSaldo(50.0);
        passageiro1.descontarSaldo(20.0);
        passageiro1.mostrarDados();

        System.out.println("\n--- Aula 3: Encapsulamento ---");
        passageiro1.setNome("Alice Silva");
        passageiro1.setIdade(17); // Tentando setar idade inválida
        passageiro1.setSaldo(-10.0); // Tentando setar saldo inválido
        passageiro1.mostrarDados();

        System.out.println("\n--- Aula 4: Construtores ---");
        Veiculo veiculo1 = new Veiculo("Fiat Uno", "BRA-1234");
        System.out.println("Veículo 1: " + veiculo1.getModelo() + " - " + veiculo1.getPlaca());
        Veiculo veiculo2 = new Veiculo(); // Construtor padrão
        System.out.println("Veículo 2: " + veiculo2.getModelo() + " - " + veiculo2.getPlaca());
        veiculo1.atualizarPlaca("XYZ-5678");
        System.out.println("Veículo 1 (placa atualizada): " + veiculo1.getPlaca());

        System.out.println("\n--- Aula 5: Associação ---");
        Viagem viagem1 = new Viagem(passageiro1, "Av. Paulista", "Rua Augusta", 35.50);
        viagem1.finalizarViagem();
        passageiro1.mostrarDados();

        System.out.println("\n--- Aula 6: Herança ---");
        Carro carro1 = new Carro("Chevrolet Onix", "ABC-0001", 4);
        Moto moto1 = new Moto("Honda CB500", "DEF-0002", 500);
        System.out.println("Carro: " + carro1.getModelo() + " - " + carro1.getPlaca() + " - Portas: " + carro1.getNumeroPortas());
        System.out.println("Moto: " + moto1.getModelo() + " - " + moto1.getPlaca() + " - Cilindradas: " + moto1.getCilindradas());

        System.out.println("\n--- Aula 7 e 8: Polimorfismo e Classes Abstratas ---");
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = carro1;
        veiculos[1] = moto1;
        veiculos[2] = new CarroEletrico("Tesla Model 3", "GHI-0003", 80.0);

        for (Veiculo v : veiculos) {
            System.out.println("Veículo: " + v.getModelo() + " - Autonomia: " + v.calcularAutonomia() + " km");
        }

        System.out.println("\n--- Aula 9: Interfaces ---");
        CarroEletrico carroEletrico1 = (CarroEletrico) veiculos[2];
        System.out.println("Carro Elétrico: " + carroEletrico1.getModelo() + " - Nível Bateria: " + carroEletrico1.getNivelBateria());
        carroEletrico1.carregarBateria(10.0);
        System.out.println("Nível Bateria após carga: " + carroEletrico1.getNivelBateria());
        System.out.println("Potência Máxima (Interface): " + Eletrico.POTENCIA_MAXIMA);
    }
}
