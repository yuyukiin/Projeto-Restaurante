package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import conexao.Conexao;
import modelo.Pedido;
import modelo.Produto;

public class PedidoDao implements PedidoRepository {
    
    @Override
    public void inserir(Pedido pedido) {
        String sqlPedido = "INSERT INTO Pedido (valorTotal, mesa) VALUES (?, ?)";
        String sqlPedidoProduto = "INSERT INTO Pedido_Produto (idPedido, idProduto, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar()) {
            conn.setAutoCommit(false); // Iniciar transação

            // Inserir o pedido
            try (PreparedStatement stmtPedido = conn.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS)) {
                stmtPedido.setDouble(1, pedido.getValorTotal());
                stmtPedido.setInt(2, pedido.getMesa());
                stmtPedido.executeUpdate();

                try (ResultSet generatedKeys = stmtPedido.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        pedido.setId(generatedKeys.getInt(1));
                    }
                }
            }

            // Inserir os produtos do pedido na tabela Pedido_Produto
            try (PreparedStatement stmtProduto = conn.prepareStatement(sqlPedidoProduto)) {
                for (Produto produto : pedido.getProdutos()) {
                    stmtProduto.setInt(1, pedido.getId());
                    stmtProduto.setInt(2, produto.getId());
                    stmtProduto.setInt(3, produto.getQuantidade());
                    stmtProduto.addBatch();
                }
                stmtProduto.executeBatch();
            }

            conn.commit(); // Confirmar transação
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public ArrayList<Pedido> carregarTodos() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM Pedido";
        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pedidos.add(new Pedido(
                        rs.getInt("id"),
                        rs.getDouble("valorTotal"),
                        rs.getInt("mesa")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }

    @Override
    public void alterarPedido(Pedido pedido) {
        String sql = "UPDATE Pedido SET valorTotal = ?, mesa = ? WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, pedido.getValorTotal());
            stmt.setInt(2, pedido.getMesa());
            stmt.setInt(3, pedido.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Pedido pedido) {
        String sql = "DELETE FROM Pedido WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pedido.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pedido carregar(int id) {
        String sql = "SELECT * FROM Pedido WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Pedido(
                            rs.getInt("id"),
                            rs.getDouble("valorTotal"),
                            rs.getInt("mesa")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Pedido> carregarPorMesa(int mesa) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        String sqlPedido = "SELECT * FROM Pedido WHERE mesa = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmtPedido = conn.prepareStatement(sqlPedido)) {

            stmtPedido.setInt(1, mesa);
            ResultSet rsPedido = stmtPedido.executeQuery();

            while (rsPedido.next()) {
                int idPedido = rsPedido.getInt("id");
                double valorTotal = rsPedido.getDouble("valorTotal");

                // Buscar os produtos deste pedido
                ArrayList<Produto> produtos = new ArrayList<>();
                String sqlProdutos = """
                    SELECT p.id, p.nome, p.preco, pp.quantidade, p.categoria
                    FROM Pedido_Produto pp
                    INNER JOIN Produto p ON pp.idProduto = p.id
                    WHERE pp.idPedido = ?
                """;

                try (PreparedStatement stmtProdutos = conn.prepareStatement(sqlProdutos)) {
                    stmtProdutos.setInt(1, idPedido);
                    ResultSet rsProdutos = stmtProdutos.executeQuery();

                    while (rsProdutos.next()) {
                        Produto produto = new Produto(
                            rsProdutos.getInt("id"),
                            rsProdutos.getString("nome"),
                            rsProdutos.getDouble("preco"),
                            rsProdutos.getInt("quantidade"), // quantidade pedida
                            rsProdutos.getString("categoria")
                        );
                        produtos.add(produto);
                    }
                }

                Pedido pedido = new Pedido(idPedido, valorTotal, mesa, produtos);
                pedidos.add(pedido);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;

    }
}
