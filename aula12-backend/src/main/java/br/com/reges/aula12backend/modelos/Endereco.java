package br.com.reges.aula12backend.modelos;


public class Endereco {

    private int id;
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String numero;
    private String uf;

    
    //CONSTRUTOR DEFAULT
    public Endereco()
    {}
    //CONSTRUTOR COMPLETO
    public Endereco(String pLogradouro, String pBairro, String pCep, String pCidade, String pComplemento, String pNumero, String pUf) {
        this.logradouro = pLogradouro;
        this.bairro = pBairro;
        this.cep = pCep;
        this.cidade = pCidade;
        this.complemento = pComplemento;
        this.numero = pNumero;
        this.uf = pUf;
    }         
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setLogradouro(String pLogradouro) {
        this.logradouro = pLogradouro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

}

