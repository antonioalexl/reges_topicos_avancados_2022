/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.supermercadoreges.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Administrador
 */
public class Principal {

    public static void main(String[] args) {

        /*EXEMPLO UTILIZANDO OS CONSTRUTORES*/
 /*
            NOSSA VENDA SERÁ REALIZA AO CLIENTE TONY STARK
            COM DOIS PRODUTOS, BOLACHA E ARROZ
            O ARROZ E A BOLACHA TEM DOIS FORNECEDORES
            A VENDA FOI FEITA PELO FUNCIONARIO PROFESSOR ANTONIO E TEM OS DOIS ITENS            
         */
 /*--------------CRIAÇÃO DO FUNCIONARIO----------------------*/
        //CRIAÇÃO DO OBJETO FUNCIONARIO
        Funcionario funcionario = new Funcionario("Profesor Antonio", "375.351.298-20");

        /*--------------CRIAÇÃO DO CLIENTE----------------------*/
        //CRIACAO DO ENDERECO DO CLIENTE
        Endereco end = new Endereco("Rua Teste", "Botanico", "14021615", "Ribeirao Preto", "Perto do parque raia", "123", "SP");

        Calendar dtNascimento =  Calendar.getInstance();
        
        dtNascimento.set(1986, 14, 12);

        //CRIAÇÃO DO OBJETO CLIENTE
        Cliente cliente = new Cliente("Tony Stark", "663.332.533-91", "993300758", dtNascimento, end, "12345");

        /*--------------CRIAÇÃO DO PRODUTO 1----------------------*/
        //CRIAÇAO DOS FORNECEDOR 1           
        Fornecedor fornecedorReges = new Fornecedor("Reges", "121.332.533-11");
        //CRIAÇAO DOS FORNECEDOR 2           
        Fornecedor fornecedorFaculdade = new Fornecedor("Faculdade", "323.332.533-91");

        //CRIAÇÃO DO ARRAY DE FORNECEDORES
        //ARRAY LIST PERMITE INSERIR MAIS DE UM FORNECEDOR
        //LEMBRE-SE QUE DEFINIMOS QUE UM PRODUTO PODE SER FORNECIDO POR MAIS DE UM FORNECEDOR
        ArrayList<Fornecedor> lstFornecedorArroz = new ArrayList<Fornecedor>();
        lstFornecedorArroz.add(fornecedorReges);
        lstFornecedorArroz.add(fornecedorFaculdade);

        //CRIACAO DO PRODUTO ARROZ
        // //OLHE O CONSTRUTOR -  public Produto(String pDescReduzida, String pDescCompleta, String pMarca, double pPrecoCusto, double pPrecoVenda, double pQtd, ArrayList<Fornecedor> pFornecedores)
        Produto produtoArroz = new Produto("Arroz 5 Kg", "Arroz agulinha 8KG", "Camil", 15, 20, 30, lstFornecedorArroz);

        /*--------------CRIAÇÃO DO PRODUTO 2----------------------*/
        Fornecedor fornecedorMabel = new Fornecedor("Nabel", "611.332.533-91");
        Fornecedor fornecedorHipopo = new Fornecedor("Hipopo", "998.332.533-91");

        ArrayList<Fornecedor> lstFornecedorBolacha = new ArrayList<Fornecedor>();
        lstFornecedorBolacha.add(fornecedorMabel);
        lstFornecedorBolacha.add(fornecedorHipopo);

        //CRIAÇÃO DO PRODUTO BOLACHA
        //OLHE O CONSTRUTOR -  public Produto(String pDescReduzida, String pDescCompleta, String pMarca, double pPrecoCusto, double pPrecoVenda, double pQtd, ArrayList<Fornecedor> pFornecedores)
        Produto produtoBolacha = new Produto("Bolacha recheada", "Biscoito recheado de morango", "Mabel", 15, 20, 30, lstFornecedorBolacha);


        /*--------------CRIAÇÃO DOS ITENS DA VENDA----------------------*/
        //ITENS DA VENDA        
        //ITEM 1
        ItemVenda itemArroz = new ItemVenda(produtoArroz, 10);

        //ITEM 2
        ItemVenda itemBolacha = new ItemVenda(produtoBolacha, 15);

        /*--------------CRIAÇÃO DA VENDA----------------------*/
        //LEMBRE-SE UMA VENDA PODE TER MAIS DE UM ITEM
        ArrayList<ItemVenda> itens = new ArrayList<>();

        //ADICIONANDO O ITEM  1 NA LISTA DE ITENS
        itens.add(itemArroz);
        //ADICIONANDO O ITEM  2 NA LISTA DE ITENS
        itens.add(itemBolacha);

        //VENDA
        //OLHE O CONSTRUTOR - public Venda(String notaFiscal, Date dataVenda, Cliente cliente, double valorVenda, Funcionario funcionario, ArrayList<ItemVenda> itens) {
        
         Calendar dataVenda =  Calendar.getInstance();
         
       // dataVenda.set(1986, Calendar.DECEMBER, 14);
        
        Venda venda = new Venda("123", dataVenda, cliente, 80, funcionario, itens);

        //FIZ O MÉTODO IMPRIMIR, PARA VERMOS FUNCIONANDO
        venda.imprimirVenda();

        /*---------------------*/
 /*
        
        
        EXEMPLO UTILIZANDO OS SETS E GETS
        
        ABAIXO É O MESMO CENÁRIO DE CIMA, PORÉM, UTILIZANDO SETS E GETS AO INVÉS DO CONSTRUTOR                                             
        
        
         */
 /*--------------CRIAÇÃO DO FUNCIONARIO----------------------*/
        //CRIAÇÃO DO OBJETO FUNCIONARIO
        Funcionario fun1 = new Funcionario();
        fun1.setNome("Profesor Antonio");
        fun1.setDocumento("375.351.298-20");

        /*--------------CRIAÇÃO DO CLIENTE----------------------*/
        //CRIACAO DO ENDERECO DO CLIENTE
        Endereco end1 = new Endereco();
        end1.setLogradouro("Rua Teste");
        end1.setBairro("Botanico");
        end1.setCidade("Ribeirao Preto");
        end1.setComplemento("Perto do parque raia");
        end1.setNumero("123");
        end1.setUf("SP");

        Calendar dtNascimento1 =  Calendar.getInstance();
        dtNascimento1.set(Calendar.YEAR, 1986);
        dtNascimento1.set(Calendar.MONTH, Calendar.DECEMBER);
        dtNascimento1.set(Calendar.DATE, 14);
        
     
        
        
     
                
        //CRIAÇÃO DO OBJETO CLIENTE
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Tony Stark");
        cliente1.setDocumento("663.332.533-91");
        cliente1.setDataNascimento(dtNascimento1);
        cliente1.setEndereco(end1);
        cliente1.setNumeroCartaoFidelidade("12345");

        /*--------------CRIAÇÃO DO PRODUTO 1----------------------*/
        //CRIAÇAO DOS FORNECEDOR 1           
        Fornecedor fornecedorReges1 = new Fornecedor();
        fornecedorReges1.setNome("Reges");
        fornecedorReges1.setDocumento("121.332.533-11");

        //CRIAÇAO DOS FORNECEDOR 2           
        Fornecedor fornecedorFaculdade1 = new Fornecedor();
        fornecedorFaculdade1.setNome("Faculdade");
        fornecedorFaculdade1.setDocumento("323.332.533-91");

        //CRIAÇÃO DO ARRAY DE FORNECEDORES
        //ARRAY LIST PERMITE INSERIR MAIS DE UM FORNECEDOR
        //LEMBRE-SE QUE DEFINIMOS QUE UM PRODUTO PODE SER FORNECIDO POR MAIS DE UM FORNECEDOR
        ArrayList<Fornecedor> lstFornecedorArroz1 = new ArrayList<Fornecedor>();
        lstFornecedorArroz1.add(fornecedorReges1);
        lstFornecedorArroz1.add(fornecedorFaculdade1);

        //CRIACAO DO PRODUTO ARROZ        
        Produto produtoArroz1 = new Produto();
        produtoArroz1.setDescricaoReduzida("Arroz 5 Kg");
        produtoArroz1.setDescricaoCompleta("Arroz agulinha 8KG");
        produtoArroz1.setMarca("Camil");
        produtoArroz1.setPrecoCusto(15);
        produtoArroz1.setPrecoVenda(20);
        produtoArroz1.setQtd(30);
        produtoArroz1.setFornecedores(lstFornecedorArroz1);

        /*--------------CRIAÇÃO DO PRODUTO 2----------------------*/
        Fornecedor fornecedorMabel1 = new Fornecedor();
        fornecedorMabel1.setNome("Nabel");
        fornecedorMabel1.setDocumento("611.332.533-91");

        Fornecedor fornecedorHipopo1 = new Fornecedor();
        fornecedorHipopo1.setNome("Hipopo");
        fornecedorHipopo1.setDocumento("998.332.533-91");

        ArrayList<Fornecedor> lstFornecedorBolacha1 = new ArrayList<Fornecedor>();
        lstFornecedorBolacha1.add(fornecedorMabel1);
        lstFornecedorBolacha1.add(fornecedorHipopo1);

        //CRIAÇÃO DO PRODUTO BOLACHA               
        Produto produtoBolacha1 = new Produto();
        produtoBolacha1.setDescricaoReduzida("Bolacha recheada");
        produtoBolacha1.setDescricaoCompleta("Biscoito recheado de morango");
        produtoBolacha1.setMarca("Mabel");
        produtoBolacha1.setPrecoCusto(15);
        produtoBolacha1.setPrecoVenda(20);
        produtoBolacha1.setQtd(30);
        produtoBolacha1.setFornecedores(lstFornecedorBolacha1);

        /*--------------CRIAÇÃO DOS ITENS DA VENDA----------------------*/
        //ITENS DA VENDA        
        //ITEM 1
        ItemVenda itemArroz1 = new ItemVenda();
        itemArroz1.setProduto(produtoArroz1);
        itemArroz1.setQtd(10);

        //ITEM 2
        ItemVenda itemBolacha1 = new ItemVenda();
        itemBolacha1.setProduto(produtoBolacha1);
        itemBolacha1.setQtd(15);

        /*--------------CRIAÇÃO DA VENDA----------------------*/
        //LEMBRE-SE UMA VENDA PODE TER MAIS DE UM ITEM
        ArrayList<ItemVenda> itens1 = new ArrayList<>();

        //ADICIONANDO O ITEM  1 NA LISTA DE ITENS
        itens1.add(itemArroz1);
        //ADICIONANDO O ITEM  2 NA LISTA DE ITENS
        itens1.add(itemBolacha1);

        //VENDA
        //OLHE O CONSTRUTOR - public Venda(String notaFiscal, Date dataVenda, Cliente cliente, double valorVenda, Funcionario funcionario, ArrayList<ItemVenda> itens) {
        Calendar dataVenda1 = Calendar.getInstance(); //ANO, MES E DIA
        
        Venda venda1 = new Venda("123", dataVenda, cliente, 80, funcionario, itens);
        venda1.setNotaFiscal("123");
        venda1.setDataVenda(dataVenda1);
        venda1.setCliente(cliente1);
        venda1.setItens(itens1);
        venda1.setFuncionario(fun1);

        //FIZ O MÉTODO IMPRIMIR, PARA VERMOS FUNCIONANDO
        venda1.imprimirVenda();

    }
}
