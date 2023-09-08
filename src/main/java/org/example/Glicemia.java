package org.example;

public class Glicemia extends Exame{
    private double glicose;

    public Glicemia(double glicose) {
    }

    public Glicemia(String nome, String tipoSanguineo, int anoNascimento, double glicose) {
        super(nome, tipoSanguineo, anoNascimento);
        this.glicose = glicose;
    }

    @Override
    public void cadastrarExame(double valor) {
        this.glicose = valor;
    }

    @Override
    public String classificarResultado() {
        if (glicose < 100) {
            return "Normoglicemia";
        } else if (glicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }

    @Override
    protected double obterValorExame() {
        return glicose;
    }
}
