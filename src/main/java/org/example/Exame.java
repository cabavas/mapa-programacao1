package org.example;

import java.util.Calendar;

public class Exame {
    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;

    public Exame() {
    }

    public Exame(String nome, String tipoSanguineo, int anoNascimento) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return
                anoAtual - anoNascimento;
    }

    public void cadastrarExame(double valor) {
    }

    public String classificarResultado() {
        return "Resultado não disponível";
    }

    protected double obterValorExame() {
        return 0.0;
    }

    public void mostrarResultado() {
        double valorExame = obterValorExame();
        String classificacao = classificarResultado();
        System.out.println("Nome do Paciente: " + nome);
        System.out.println("Idade do Paciente: " + calcularIdade() + " anos");
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
        System.out.println("Valor do Exame: " + valorExame);
        System.out.println("Classificação: " + classificacao);
    }
}
