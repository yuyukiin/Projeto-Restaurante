/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author laboratorio
 */
public class Produto {
    
    private int quantidade;
    private String nome;
    private double  preco;
    private String categoria;
    private int id;
    private int quantidadeBanco;

    public Produto(int quantidade, String nome, double preco, String categoria) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getQuantidadeBanco() {
        return quantidadeBanco;
    }

    public void setQuantidadeBanco(int quantidadeBanco) {
        this.quantidadeBanco = quantidadeBanco;
    }
    public Produto(int id, String nome, double preco, int quantidade, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Produto() {
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
            this.preco = preco;
    }
    
    @Override
    public String toString() {
        return nome; // Exibe apenas o nome no JComboBox
    }
    
}
