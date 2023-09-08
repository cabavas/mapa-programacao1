package org.example;

public class Colesterol extends  Exame{
    private double quantidadeLDL;
    private double quantidadeHDL;
    private char risco;

    public Colesterol(double quantidadeLDL, double quantidadeHDL, char risco) {
    }

    public Colesterol(String nome, String tipoSanguineo, int anoNascimento, double quantidadeLDL, double quantidadeHDL) {
        super(nome, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
    }

    public void setRisco(char risco) {
        this.risco = risco;
    }

    @Override
    public void cadastrarExame(double valor) {
        // Implemente a lógica para definir o risco com base nos valores recebidos
    }

    @Override
    public String classificarResultado() {
        String resultadoHDL = calcularResultadoHDL();
        String resultadoLDL = calcularResultadoLDL();
        return "HDL: " + resultadoHDL + ", LDL: " + resultadoLDL;
    }

    private String calcularResultadoHDL() {
        int idade = calcularIdade();
        if (idade <= 19) {
            return (quantidadeHDL > 45) ? "HDL - BOM" : "HDL - RUIM";
        } else {
            return (quantidadeHDL > 40) ? "HDL - BOM" : "HDL - RUIM";
        }
    }

    private String calcularResultadoLDL() {
        if (risco == 'B') {
            return (quantidadeLDL < 100) ? "LDL - BOM" : "LDL - RUIM";
        } else if (risco == 'M') {
            return (quantidadeLDL < 70) ? "LDL - BOM" : "LDL - RUIM";
        } else if (risco == 'A') {
            return (quantidadeLDL < 50) ? "LDL - BOM" : "LDL - RUIM";
        } else {
            return "Resultado não disponível";
        }
    }

    @Override
    protected double obterValorExame() {
        return quantidadeLDL;
    }
}
