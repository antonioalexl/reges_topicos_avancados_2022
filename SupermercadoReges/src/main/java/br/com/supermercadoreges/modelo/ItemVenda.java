
package br.com.supermercadoreges.modelo;


public class ItemVenda {        
    private Produto produto;
    private double qtd;
    private double subTotal;
    private int numItem;

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }
    
    
    
    //CONSTRUTOR DEFAULT
    public ItemVenda(){}
    
    //CONSTRUTOR COMPLETO
    public ItemVenda(Produto pProduto, double pQtd) {
        this.produto = pProduto;
        this.qtd = pQtd;
       
    }      
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    
    //PODEMOS RETORNAR O SUBTOTAL JÁ CALCULADO
    public double getSubTotal() {
        double subTotal = this.produto.getPrecoVenda() * qtd;
        this.subTotal = subTotal;
        return this.subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
   
}
