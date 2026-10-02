package org.example;

public abstract class AtendimentoDecorator implements Atendimento {

    private Atendimento atendimento;

    public AtendimentoDecorator(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public abstract float getValorAdicional();

    public float getValor() {
        return this.atendimento.getValor() + this.getValorAdicional();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.atendimento.getEstrutura() + "/" + this.getNomeEstrutura();
    }
}
