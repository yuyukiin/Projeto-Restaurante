package trabrestaurante;

import conexao.Conexao;
import dao.ServidorPedido;

public class Main {
    public static void main(String[] args) {
        // Conectar ao banco de dados
        Conexao.conectar();
        
        // Iniciar o servidor de pedidos
        ServidorPedido.iniciarServidor();
    }
}
