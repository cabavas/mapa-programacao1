package org.example;

public class Main {
    public static void main(String[] args) {
        Exame exameGlicemia = new Glicemia("Paciente1", "AB-", 1990, 110);
        exameGlicemia.mostrarResultado();

        Exame exameColesterol = new Colesterol("Paciente2", "O-", 1985, 120, 50);
        ((Colesterol) exameColesterol).setRisco('A');
        exameColesterol.mostrarResultado();

        Exame exameTriglicerideos = new Triglicerideos("Paciente3", "A+", 2005, 80);
        exameTriglicerideos.mostrarResultado();
    }
}