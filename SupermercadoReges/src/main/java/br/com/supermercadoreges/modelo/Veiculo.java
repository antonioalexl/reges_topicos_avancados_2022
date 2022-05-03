package br.com.supermercadoreges.modelo;

public class Veiculo {

    private int idVeiculo;
    private int ano;
    private String nome;
    private String marca;
    private String combustivel;

    public int getIdVeiculo() {
        return idVeiculo;
    }
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int Ano) {
        this.ano = Ano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
