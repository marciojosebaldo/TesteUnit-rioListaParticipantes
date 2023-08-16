package com.MundoSenaiTDSN.ListaParticipantes.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S_ValidadorCPFTest {

    S_ValidadorCPF s_validadorcpf = new S_ValidadorCPF();

    @Test
    void validarCPFTeste() {
        String entrada = "039.632.170-49";
        boolean resultado = s_validadorcpf.validarCPF(entrada);
    }
}