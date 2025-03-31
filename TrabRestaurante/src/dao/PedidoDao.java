package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import conexao.Conexao;
import modelo.Pedido;

public class PedidoDao implements PedidoRepository {
    
    @Override
    public void inserir(Pedido pedido) {
        String sql = "INSERT INTO Pedido (valorTotal, mesa) VALUES (?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDouble(1, pedido.getValorTotal());
            stmt.setInt(2, pedido.getMesa());
            stmt.executeUpdate();

            // Se precisar do ID gerado automaticamente
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    pedido.setId(generatedKeys.getInt(1));
                }
            }
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
}
