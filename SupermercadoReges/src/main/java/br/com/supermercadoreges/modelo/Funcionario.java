
package br.com.supermercadoreges.modelo;

import java.util.Calendar;
import java.util.Date;


public class Funcionario extends Pessoa {

    private double salario;
    private String pis;

    public Funcionario(){}
    
    
    //CONSTRUTOR COM NOME E DOCUMENTO
    public Funcionario(String pNome, String pDocumento) {
        super(pNome, pDocumento);//chama o construtor da classe pai
    }
    
    //CONSTRUTOR COMPLETO
    public Funcionario(String pNome, String pTelefone, String pDocumento, Calendar pDataNascimento, Endereco pEndereco, double pSalario, String pPis ) {
        super(pNome, pTelefone, pDocumento, pDataNascimento, pEndereco);//chama o construtor da classe pai
        this.salario = pSalario;
        this.pis = pPis;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

}
