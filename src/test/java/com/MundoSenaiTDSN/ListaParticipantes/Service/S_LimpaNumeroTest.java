package com.MundoSenaiTDSN.ListaParticipantes.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S_LimpaNumeroTest {

    @Test
    void limparNumeroTeste() {
        String entrada = "AAAAAA_9987-BBBBB";
        String saidaEsperada = "9987";

        String resultado = S_LimpaNumero.limpar(entrada);

        Assertions.assertEquals(saidaEsperada, resultado);
    }
}