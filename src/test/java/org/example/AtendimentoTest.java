package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    @Test
    void deveRetornarValorAtendimento() {
        Atendimento atendimento = new AtendimentoBasico(1000.0f);

        assertEquals(1000.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComExamesLaboratoriais() {
        Atendimento atendimento = new ExamesLaboratoriais(new AtendimentoBasico(1000.0f));

        assertEquals(1300.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComCirurgia() {
        Atendimento atendimento = new Cirurgia(new AtendimentoBasico(1000.0f));

        assertEquals(6000.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComMedicamentos() {
        Atendimento atendimento = new Medicamentos(new AtendimentoBasico(1000.0f));

        assertEquals(1250.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComExamesLaboratoriaisMaisCirurgia() {
        Atendimento atendimento = new ExamesLaboratoriais(new Cirurgia(new AtendimentoBasico(1000.0f)));

        assertEquals(6300.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComExamesLaboratoriaisMaisMedicamentos() {
        Atendimento atendimento = new ExamesLaboratoriais(new Medicamentos(new AtendimentoBasico(1000.0f)));

        assertEquals(1550.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComCirurgiaMaisMedicamentos() {
        Atendimento atendimento = new Cirurgia(new Medicamentos(new AtendimentoBasico(1000.0f)));

        assertEquals(6250.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarValorAtendimentoComExamesLaboratoriaisMaisCirurgiaMaisMedicamentos() {
        Atendimento atendimento = new ExamesLaboratoriais(new Cirurgia(new Medicamentos(new AtendimentoBasico(1000.0f))));

        assertEquals(6550.0f, atendimento.getValor());
    }

    @Test
    void deveRetornarEstruturaAtendimento() {
        Atendimento atendimento = new AtendimentoBasico();

        assertEquals("Básico", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComExamesLaboratoriais() {
        Atendimento atendimento = new ExamesLaboratoriais(new AtendimentoBasico());

        assertEquals("Básico/Exames Laboratoriais", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComCirurgia() {
        Atendimento atendimento = new Cirurgia(new AtendimentoBasico());

        assertEquals("Básico/Cirurgia", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComMedicamentos() {
        Atendimento atendimento = new Medicamentos(new AtendimentoBasico());

        assertEquals("Básico/Medicamentos", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComExamesLaboratoriaisMaisCirurgia() {
        Atendimento atendimento = new ExamesLaboratoriais(new Cirurgia(new AtendimentoBasico()));

        assertEquals("Básico/Cirurgia/Exames Laboratoriais", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComExamesLaboratoriaisMaisMedicamentos() {
        Atendimento atendimento = new ExamesLaboratoriais(new Medicamentos(new AtendimentoBasico()));

        assertEquals("Básico/Medicamentos/Exames Laboratoriais", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComCirurgiaMaisMedicamentos() {
        Atendimento atendimento = new Cirurgia(new Medicamentos(new AtendimentoBasico()));

        assertEquals("Básico/Medicamentos/Cirurgia", atendimento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaAtendimentoComExamesLaboratoriaisMaisCirurgiaMaisMedicamentos() {
        Atendimento atendimento = new ExamesLaboratoriais(new Cirurgia(new Medicamentos(new AtendimentoBasico())));

        assertEquals("Básico/Medicamentos/Cirurgia/Exames Laboratoriais", atendimento.getEstrutura());
    }

}
