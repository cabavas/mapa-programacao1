package org.example;

import java.time.Year;

public class Exame {
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    public void classificarResultadoGlicemia(double quantidadeGlicose) {
        if (quantidadeGlicose < 100) {
            System.out.println("Normoglicemia");
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            System.out.println("Pré-diabetes");
        } else {
            System.out.println("Diabetes estabelecido");
        }
    }

    public void classificarResultadoColesterol(double quantidadeLDL, double quantidadeHDL, String risco) {
        System.out.println("Resultado para Colesterol LDL: " + quantidadeLDL);
        System.out.println("Resultado para Colesterol HDL: " + quantidadeHDL);

        if ("B".equals(risco)) {
            if (quantidadeLDL < 100 && quantidadeHDL > 45) {
                System.out.println("Baixo risco");
            }
        } else if ("M".equals(risco)) {
            if (quantidadeLDL < 70 && quantidadeHDL > 40) {
                System.out.println("Médio risco");
            }
        } else if ("A".equals(risco)) {
            if (quantidadeLDL < 50 && quantidadeHDL > 40) {
                System.out.println("Alto risco");
            }
        }
    }

    public void classificarResultadoTriglicerideos(double quantidadeTriglicerideos, int idade) {
        System.out.println("Resultado para Triglicerídeos: " + quantidadeTriglicerideos);

        if (idade >= 0 && idade <= 9) {
            if (quantidadeTriglicerideos < 75) {
                System.out.println("Normal");
            }
        } else if (idade >= 10 && idade <= 19) {
            if (quantidadeTriglicerideos < 90) {
                System.out.println("Normal");
            }
        } else if (idade >= 20) {
            if (quantidadeTriglicerideos < 150) {
                System.out.println("Normal");
            }
        }
    }
}
