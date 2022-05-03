/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.modelo;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Venda {

    private int id;
    private String notaFiscal;
    private Calendar dataVenda;
    private Cliente cliente;
    private double valorVenda;
    private Funcionario funcionario;
    private ArrayList<ItemVenda> itens;

    //CONTRUTOR DEFAULT
    public Venda() {
    }

    //CONTRUTOR COMPLETO
    public Venda(String notaFiscal, Calendar dataVenda, Cliente cliente, double valorVenda, Funcionario funcionario, ArrayList<ItemVenda> itens) {
        this.notaFiscal = notaFiscal;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.valorVenda = valorVenda;
        this.funcionario = funcionario;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public double calcularTotalVenda() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getSubTotal();
        }
        return total;
    }

    //MÉTODO IMPRIMIR VENDA
    public void imprimirVenda() {

        System.out.println("----SUPERMERCADO REGES-----");
        System.out.println("Nota fiscal nº: " + this.notaFiscal);

        //CONVERTE A DATA NO FORMATO DD/MM/YYYY. EX.: 25/06/2021
       // Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        //String s = formatter.format(this.getDataVenda());

        //DateFormat formataData = DateFormat.getDateInstance();
        
        DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

        
        System.out.println("Data da venda nº: " +  formataData.format(this.getDataVenda().getTime()));

        System.out.println("Funcionário Reponsável: " + this.funcionario.getNome());
        System.out.println("Cliente: " + this.cliente.getNome() +  "Fidelidade:" + this.getCliente().getNumeroCartaoFidelidade() + "Data de Nascimento:" + formataData.format(this.cliente.getDataNascimento().getTime()));
        System.out.println("Endereco: " + this.cliente.getEndereco().getLogradouro());

        System.out.println("ITENS:");

        for (int i = 0; i < itens.size(); i++) {

            System.out.println("Item: " + itens.get(i).getProduto().getDescricaoReduzida());
          
            /*FORNECEDORS DO PRODUTO*/
            for (int j = 0; j < itens.get(i).getProduto().getFornecedores().size(); j++) {

                Fornecedor f = itens.get(i).getProduto().getFornecedores().get(j);
                System.out.println("Fornecedor: " + f.getNome() + " " +f.getDocumento() );
                
               

            }

     

            System.out.println("Quantidade: " + itens.get(i).getQtd());
            System.out.println("Valor Unitário: " + itens.get(i).getProduto().getPrecoVenda());
            System.out.println("SubTotal: " + itens.get(i).getSubTotal());
            
             System.out.println("*****************:");
        }

        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("Total da Venda: " + this.calcularTotalVenda());

    }

}
