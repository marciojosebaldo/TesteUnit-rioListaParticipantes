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
        M_Resposta respostaEsperada = new M_Resposta(true, "Pessoa Cadastrada Com Sucesso");

        when(r_pessoaMock.save(any(M_Pessoa.class))).thenReturn(new M_Pessoa());

        M_Resposta m_resposta = s_pessoaMock.cadastrarPessoa("nome", "03455554148", "email@teste.com", "4698859785", "123", "123");

        // Imprime o objeto retornado e seus atributos
        System.out.println("Objeto retornado: " + m_resposta);
        System.out.println("Atributo mensagem: " + m_resposta.getMensagem());    }

}