import java.io.*;
import java.net.*;

public class Conexao {

    private Socket socket;
    private BufferedReader entrada;
    private PrintWriter saida;
    private RSACrypto rsa;

    public Conexao(Socket socket, RSACrypto rsa) throws IOException {
        this.socket = socket;
        this.rsa = rsa;
        this.entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        this.saida = new PrintWriter(
                socket.getOutputStream(), true
        );
    }

    public Conexao(String host, int porta, RSACrypto rsa) throws IOException {
        this.socket = new Socket(host, porta);
        this.rsa = rsa;
        this.entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        this.saida = new PrintWriter(
                socket.getOutputStream(), true
        );
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("\n🔒 Criptografando mensagem: \"" + mensagem + "\"");
        String mensagemCriptografada = rsa.criptografar(mensagem);
        System.out.println("📤 Enviando: " + mensagemCriptografada);
        saida.println(mensagemCriptografada);
    }

    public String receberMensagem() throws IOException {
        String mensagemCriptografada = entrada.readLine();

        if (mensagemCriptografada == null) {
            return null;
        }

        System.out.println("📩 Recebido: " + mensagemCriptografada);
        String mensagemOriginal = rsa.descriptografar(mensagemCriptografada);
        System.out.println("🔓 Descriptografado: \"" + mensagemOriginal + "\"");

        return mensagemOriginal;
    }

    public void enviarTextoSimples(String texto) {
        saida.println(texto);
    }

    public String receberTextoSimples() throws IOException {
        return entrada.readLine();
    }

    public boolean estaConectado() {
        return socket != null && socket.isConnected() && !socket.isClosed();
    }

    public String getInfoConexao() {
        if (socket == null) {
            return "Sem conexão";
        }

        return String.format(
                "Endereço Local: %s:%d | Endereço Remoto: %s:%d",
                socket.getLocalAddress().getHostAddress(),
                socket.getLocalPort(),
                socket.getInetAddress().getHostAddress(),
                socket.getPort()
        );
    }

    public void fechar() throws IOException {
        System.out.println("\n🔌 Encerrando conexão...");

        if (entrada != null) {
            entrada.close();
            System.out.println("   ✓ BufferedReader fechado");
        }

        if (saida != null) {
            saida.close();
            System.out.println("   ✓ PrintWriter fechado");
        }

        if (socket != null && !socket.isClosed()) {
            socket.close();
            System.out.println("   ✓ Socket fechado");
        }

        System.out.println("✅ Conexão encerrada com sucesso!");
    }

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   TESTE DA CLASSE CONEXAO                  ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        System.out.println("Esta classe é utilizada por Servidor.java e Cliente.java");
        System.out.println("para gerenciar a transmissão e recepção de dados TCP/IP.\n");

        System.out.println("📋 Funcionalidades:");
        System.out.println("  ✓ Envio de mensagens criptografadas");
        System.out.println("  ✓ Recepção e descriptografia de mensagens");
        System.out.println("  ✓ Gerenciamento de streams (BufferedReader/PrintWriter)");
        System.out.println("  ✓ Verificação de status da conexão");
        System.out.println("  ✓ Encerramento seguro de recursos\n");

        System.out.println("Para testar a comunicação:");
        System.out.println("  1. Execute Servidor.java em um terminal");
        System.out.println("  2. Execute Cliente.java em outro terminal");
        System.out.println("  3. Digite mensagens no cliente e veja a comunicação!");
    }
}