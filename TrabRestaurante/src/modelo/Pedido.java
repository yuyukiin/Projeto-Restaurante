package modelo;

import java.util.List;

public class Pedido {
    private int id;
    private double valorTotal;
    private int mesa;
    private List<Produto> produtos;

    public Pedido(int id, double valorTotal, int mesa, List<Produto> produtos) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.mesa = mesa;
        this.produtos = produtos;
    }

    public Pedido(double valorTotal, int mesa, List<Produto> produtos) {
        this.valorTotal = valorTotal;
        this.mesa = mesa;
        this.produtos = produtos;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public int getMesa() { return mesa; }
    public void setMesa(int mesa) { this.mesa = mesa; }

    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }
}
