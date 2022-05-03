/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.modelo;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Produto {

    private int id;
    private String descricaoReduzida;
    private String descricaoCompleta;
    private String marca;
    private double precoCusto;
    private double precoVenda;
    private double qtd;    
    private ArrayList<Fornecedor> fornecedores;

    
    //CONSTRUTOR DEFAULT
    public Produto(){}
            
    
    //CONSTRUTOR COMPLETO
    public Produto(String pDescReduzida, String pDescCompleta, String pMarca, double pPrecoCusto, double pPrecoVenda, double pQtd, ArrayList<Fornecedor> pFornecedores)
    {
        this.descricaoReduzida = pDescReduzida;
        this.descricaoCompleta = pDescCompleta;
        this.marca = pMarca;
        this.precoCusto = pPrecoCusto;        
        this.precoVenda = pPrecoVenda;
        this.qtd = pQtd;
        this.fornecedores = pFornecedores;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoReduzida() {
        return descricaoReduzida;
    }

    public void setDescricaoReduzida(String descricaoReduzida) {
        this.descricaoReduzida = descricaoReduzida;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

}
