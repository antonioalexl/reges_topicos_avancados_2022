/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Fornecedor extends Pessoa {

    private String razaoSocial;
    private String inscricaoEstadual;
    private String categoria;
    private String tipoProduto;
    private ArrayList<Cnae> cnaes;

    //CONSTRUTOR DEFAULT
    public Fornecedor() {
    }

    //CONSTUTOR SOMENTE COM NOME E DOCUMENTO 
    public Fornecedor(String pNome, String pDocumento) {
        super(pNome, pDocumento);//CHAMA O CONSTRUTOR DA CLASSE PAI
    }

    //CONSTRUTOR COMPLETO DA CLASSE PESSOA
    public Fornecedor(String pNome, String pTelefone, String pDocumento, Calendar pDataNascimento, Endereco pEndereco) {
        super(pNome, pTelefone, pDocumento, pDataNascimento, pEndereco);//CHAMA O CONSTRUTOR DA CLASSE PAI

    }

    //CONSTRUTOR COMPL
    public Fornecedor(String pNome, String pDocumento, String pRazaoSocial) {
        super(pNome, pDocumento);//CHAMA O CONSTRUTOR DA CLASSE PAI
        this.razaoSocial = pRazaoSocial;
    }

    //CONSTRUTOR COMPLETO DA CLASSE FORNECEDOR
    public Fornecedor(String pNome, String pTelefone, String pDocumento, Calendar pDataNascimento, Endereco pEndereco, String pRazaoSocial, String pInscEstadual, String pTipoProduto, ArrayList<Cnae> pCnaes) {
        super(pNome, pTelefone, pDocumento,pDataNascimento,pEndereco);//CHAMA O CONSTRUTOR DA CLASSE PAI               
        this.razaoSocial = pRazaoSocial;
        this.inscricaoEstadual = pInscEstadual;
        this.tipoProduto = pTipoProduto;
        this.cnaes = pCnaes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public ArrayList<Cnae> getCnaes() {
        return cnaes;
    }

    public void setCnaes(ArrayList<Cnae> cnaes) {
        this.cnaes = cnaes;
    }
}
