package org.example;

public class ExamesLaboratoriais extends AtendimentoDecorator {

    public ExamesLaboratoriais(Atendimento atendimento) {
        super(atendimento);
    }

    public float getValorAdicional() {
        return 300.0f;
    }

    public String getNomeEstrutura() {
        return "Exames Laboratoriais";
    }
}
