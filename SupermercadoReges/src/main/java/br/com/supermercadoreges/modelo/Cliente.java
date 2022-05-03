package br.com.supermercadoreges.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Pessoa {

    private String numeroCartaoFidelidade;

    //CONSTRUTORES
    public Cliente() {
    }

     //CONSTRUTOR COM NOME, TELEFONE, DOCUMENTO
    public Cliente(String pNome, String pDocumento) {
        super(pNome, pDocumento);
    }

    //CONSTRUTOR COM NOME, TELEFONE, DOCUMENTO E CARTÃO FIDELIDADE
    public Cliente(String pNome, String pDocumento, String pNumCartaoFidelidade) {
        super(pNome, pDocumento);
        this.numeroCartaoFidelidade = pNumCartaoFidelidade;
    }

    //CONSTRUTOR COM NOME, TELEFONE, DOCUMENTO, DATA DE NASCIMENTO E ENDERECO
    public Cliente(String pNome, String pTelefone, String pDocumento, Calendar pDataNascimento, Endereco pEndereco) {
        super(pNome, pTelefone, pDocumento, pDataNascimento, pEndereco);

    }

    //CONSTRUTOR COMPLETO
    public Cliente(String pNome, String pTelefone, String pDocumento, Calendar pDataNascimento, Endereco pEndereco, String pNumeroCartaoFidelidade) {
        super(pNome, pTelefone, pDocumento, pDataNascimento, pEndereco);//CHAMA O CONSTRUTOR DA CLASSE PAI               
        this.numeroCartaoFidelidade = pNumeroCartaoFidelidade;

    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

}
