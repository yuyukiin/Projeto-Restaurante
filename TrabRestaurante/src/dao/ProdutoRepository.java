/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author laboratorio
 */
interface ProdutoRepository {
    void inserir(Produto produto);
    ArrayList<Produto> carregarTodos();
    void alterarProduto(Produto produto);
    void excluir(Produto produto);
    Produto carregar(int id);
}