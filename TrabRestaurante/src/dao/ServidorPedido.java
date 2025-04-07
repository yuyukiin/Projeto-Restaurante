package dao;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.SwingUtilities;

import trabrestaurante.Carrinho;

public class ServidorPedido {
    private static final int PORTA = 5000;

    public static void main(String[] args) {
        // Inicia o servidor em uma nova thread
        new Thread(() -> iniciarServidor()).start();

        // Abre a interface gráfica
        abrirInterfaceCarrinho();
    }

    public static void iniciarServidor() {
        try (ServerSocket serverSocket = new ServerSocket(PORTA)) {
            System.out.println("Servidor rodando na porta " + PORTA + "...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Novo cliente conectado!");
                // Aqui você pode delegar o socket para um handler se quiser
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void abrirInterfaceCarrinho() {
        SwingUtilities.invokeLater(() -> {
            Carrinho carrinho = new Carrinho();
            carrinho.setVisible(true);
        });
    }
}
