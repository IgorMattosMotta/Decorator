package org.example;

public class Cirurgia extends AtendimentoDecorator {

    public Cirurgia(Atendimento atendimento) {
        super(atendimento);
    }

    public float getValorAdicional() {
        return 5000.0f;
    }

    public String getNomeEstrutura() {
        return "Cirurgia";
    }
}
