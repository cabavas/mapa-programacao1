package org.example;

public class Triglicerideos extends Exame{
    private double quantidadeTriglicerideos;

    public Triglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeTriglicerideos) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public void cadastrarExame(double valor) {
        this.quantidadeTriglicerideos = valor;
    }

    @Override
    public String classificarResultado() {
        int idade = calcularIdade();
        if (idade < 10) {
            return (quantidadeTriglicerideos < 75) ? "Normal" : "Elevado";
        } else if (idade <= 19) {
            return (quantidadeTriglicerideos < 90) ? "Normal" : "Elevado";
        } else {
            return (quantidadeTriglicerideos < 150) ? "Normal" : "Elevado";
        }
    }

    @Override
    protected double obterValorExame() {
        return quantidadeTriglicerideos;
    }
}
