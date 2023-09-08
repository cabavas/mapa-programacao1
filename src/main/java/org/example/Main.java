package org.example;

public class Main {
    public static void main(String[] args) {
        Exame exame = new Exame("João", "A+", 1990);
        double glicemia = 130.0;
        double colesterolLDL = 60.0;
        double colesterolHDL = 50.0;
        String riscoColesterol = "B";
        double triglicerideos = 80.0;

        System.out.println("Nome do paciente: " + exame.getNomePaciente());
        System.out.println("Tipo sanguíneo: " + exame.getTipoSanguineo());
        System.out.println("Idade do paciente: " + exame.calcularIdade());

        exame.classificarResultadoGlicemia(glicemia);
        exame.classificarResultadoColesterol(colesterolLDL, colesterolHDL, riscoColesterol);
        exame.classificarResultadoTriglicerideos(triglicerideos, exame.calcularIdade());
    }
}