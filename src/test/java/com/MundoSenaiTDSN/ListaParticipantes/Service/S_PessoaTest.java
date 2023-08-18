package com.MundoSenaiTDSN.ListaParticipantes.Service;

import com.MundoSenaiTDSN.ListaParticipantes.Model.M_Pessoa;
import com.MundoSenaiTDSN.ListaParticipantes.Model.M_Resposta;
import com.MundoSenaiTDSN.ListaParticipantes.Repository.R_Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.dao.DataIntegrityViolationException;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        when(r_pessoaMock.save(any(M_Pessoa.class))).thenReturn(new M_Pessoa());

        M_Resposta m_resposta = s_pessoaMock.cadastrarPessoa("nome", "12345678901", "email@teste.com", "4698859785", "123", "123");
    }

    @Test
    public void testCadastrarPessoaComErro() {
        when(r_pessoaMock.save(Mockito.any(M_Pessoa.class))).
                thenThrow(new DataIntegrityViolationException("Mensagem de erro"));

        M_Resposta m_resposta = s_pessoaMock.cadastrarPessoa("nome", "12345678901", "email@teste.com", "4698859785", "123", "123");

        // Realize as asserções necessárias para verificar o resultado
        // Exemplo: assertEquals(false, m_resposta.getStatus());
    }
}