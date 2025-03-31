/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Pedido;

/**
 *
 * @author laboratorio
 */
interface PedidoRepository {
    
    void inserir(Pedido pedido);
    ArrayList<Pedido> carregarTodos();
    void alterarPedido(Pedido pedido);
    void excluir(Pedido pedido);
    Pedido carregar(int id);
    
}
