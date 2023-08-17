package com.MundoSenaiTDSN.ListaParticipantes.Service;

import com.MundoSenaiTDSN.ListaParticipantes.Model.M_Pessoa;
import com.MundoSenaiTDSN.ListaParticipantes.Model.M_Resposta;
import com.MundoSenaiTDSN.ListaParticipantes.Repository.R_Pessoa;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.dao.DataIntegrityViolationException;

import static org.mockito.Mockito.when;

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

        M_Resposta resposta = s_pessoaMock.cadastrarPessoa("Nome", "12345678901", "email@teste.com", "senha", "senha");
    }

    @Test
    public void testCadastrarPessoaComErro() {
        when(r_pessoaMock.save(any) (M_Pessoa.class))).
        thenThrow(new DataIntegrityViolationException("Mensagem de erro"));
    }

    M_Pessoa resposta = s_pessoaMock.cadastrarPessoa("Nome", "12345678901", "email@example.com", "", "senha", "senha");
}
