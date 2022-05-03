/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.modelo;


import java.util.Calendar;
import java.util.Date;


public abstract class Pessoa {

    
    private int id;    
    private String nome;      
    private String telefone;
    private String email;
    private String documento;
    private Calendar dataNascimento;    
    private  Endereco endereco; 

   
    
    
    //CONSTRUTOR DEFAULT
     public Pessoa() {}
    
     
     //CONSTRUTOR SOMENTE COM NOME E DOCUMENTO
     public Pessoa(String pNome, String pDocumento){
        this.nome = pNome;        
        this.documento = pDocumento;       
        
    };
     
      //CONSTRUTOR COM DOCUMENTO E TELEFONE
      public Pessoa(String pNome, String pDocumento,String pTelefone){
        this.nome = pNome;
        this.documento = pDocumento;      
        this.telefone = pTelefone;        
    };              
     
     
     //CONSTRUTOR COMPLETO
      public Pessoa(String pNome, String pTelefone, String pDocumento, Calendar pDataNascimento, Endereco pEndereco){
        this.nome = pNome;
        this.telefone = pTelefone;
        this.documento = pDocumento;
        this.dataNascimento = pDataNascimento;
        this.endereco = pEndereco;        
    };
    
    
    
   
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }       
                 
    
}
