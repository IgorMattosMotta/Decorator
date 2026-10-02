package org.example;

public class Medicamentos extends AtendimentoDecorator {

    public Medicamentos(Atendimento atendimento) {
        super(atendimento);
    }

    public float getValorAdicional() {
        return 250.0f;
    }

    public String getNomeEstrutura() {
        return "Medicamentos";
    }
}
