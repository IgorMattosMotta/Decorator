package org.example;

public class AtendimentoBasico implements Atendimento {

    public float valor;

    public AtendimentoBasico() {
    }

    public AtendimentoBasico(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getEstrutura() {
        return "Básico";
    }

}
