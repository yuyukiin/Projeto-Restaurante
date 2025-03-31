package dao;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import dao.PedidoDao;
import modelo.Pedido;
import java.util.List;

public class ServidorPedido {
    private static final int PORTA = 5000;

    public static void iniciarServidor() {
        PedidoDao pedidoDao = new PedidoDao();

        try (ServerSocket serverSocket = new ServerSocket(PORTA)) {
            System.out.println("Servidor rodando na porta " + PORTA + "...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Novo cliente conectado!");

                new Thread(() -> processarCliente(socket, pedidoDao)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processarCliente(Socket socket, PedidoDao pedidoDao) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String comando;
            while ((comando = in.readLine()) != null) {
                System.out.println("Recebido: " + comando);

                if (comando.startsWith("INSERIR")) {
                    String dados = comando.substring(8);
                    Pedido pedido = converterParaPedido(dados);
                    pedidoDao.inserir(pedido);
                    out.println("Pedido inserido!");

                } else if (comando.equals("CARREGAR_TODOS")) {
                    List<Pedido> pedidos = pedidoDao.carregarTodos();
                    out.println(converterListaParaString(pedidos));

                } else if (comando.startsWith("CARREGAR")) {
                    int id = Integer.parseInt(comando.split(" ")[1]);
                    Pedido pedido = pedidoDao.carregar(id);
                    out.println(converterPedidoParaString(pedido));

                } else if (comando.startsWith("ALTERAR")) {
                    String dados = comando.substring(8);
                    Pedido pedido = converterParaPedido(dados);
                    pedidoDao.alterarPedido(pedido);
                    out.println("Pedido atualizado!");

                } else if (comando.startsWith("EXCLUIR")) {
                    int id = Integer.parseInt(comando.split(" ")[1]);
                    pedidoDao.excluir(new Pedido(id, 0, 0));
                    out.println("Pedido excluído!");

                } else {
                    out.println("Comando inválido!");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Pedido converterParaPedido(String dados) {
        String[] partes = dados.split("\\|");
        int id = Integer.parseInt(partes[0]);
        double valor = Double.parseDouble(partes[1]);
        int quantidade = Integer.parseInt(partes[2]);
        return new Pedido(id, valor, quantidade);
    }

    private static String converterPedidoParaString(Pedido pedido) {
        return pedido.getId() + "|" + pedido.getValorTotal();
    }

    private static String converterListaParaString(List<Pedido> pedidos) {
        StringBuilder sb = new StringBuilder();
        for (Pedido p : pedidos) {
            sb.append(converterPedidoParaString(p)).append("\n");
        }
        return sb.toString();
    }
}
