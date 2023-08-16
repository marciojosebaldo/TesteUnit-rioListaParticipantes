package com.MundoSenaiTDSN.ListaParticipantes.Service;

import com.MundoSenaiTDSN.ListaParticipantes.Repository.R_Pessoa;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class S_PessoaTeste {

    @Mock
    private R_Pessoa r_pessoaMock;
    private S_Pessoa s_pessoaMock;

    @BeforeEach
    public void construtorTeste() {
        MockitoAnnotations.openMocks(this);
        s_pessoaMock = new S_Pessoa(r_pessoaMock);
    }

    @Test
    public void testeCadastrarPessoa() {

    }
}