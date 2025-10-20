import java.io.*;
import java.net.*;

public class Servidor {

    private static final int PORTA = 12345;
    private ServerSocket serverSocket;
    private RSACrypto rsa;

    public Servidor() {
        this.rsa = new RSACrypto(61, 53, 17);
    }

    public void iniciar() {
        try {
            serverSocket = new ServerSocket(PORTA);
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║     SERVIDOR TCP INICIADO COM RSA          ║");
            System.out.println("╚════════════════════════════════════════════╝");
            System.out.println("🔐 Criptografia RSA ativada!");
            System.out.println("📡 Porta: " + PORTA);
            System.out.println("🔑 Chave Pública: " + rsa.getChavePublica());
            System.out.println("⏳ Aguardando conexão do cliente...\n");

            Socket clienteSocket = serverSocket.accept();
            System.out.println("✅ Cliente conectado: " + clienteSocket.getInetAddress().getHostAddress());
            System.out.println("─────────────────────────────────────────────\n");

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(clienteSocket.getInputStream())
            );
            PrintWriter saida = new PrintWriter(
                    clienteSocket.getOutputStream(), true
            );

            trocarChaves(saida);
            comunicarComCliente(entrada, saida);
            desconectar(clienteSocket, entrada, saida);

        } catch (IOException e) {
            System.err.println("❌ Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void trocarChaves(PrintWriter saida) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   ETAPA 1: TROCA DE CHAVES PÚBLICAS        ║");
        System.out.println("╚════════════════════════════════════════════╝");

        String chavePublica = rsa.getChavePublica();
        System.out.println("📤 Enviando chave pública para o cliente...");
        System.out.println("   Chave: " + chavePublica);

        saida.println(chavePublica);

        System.out.println("✅ Chave pública enviada com sucesso!");
        System.out.println("─────────────────────────────────────────────\n");
    }

    private void comunicarComCliente(BufferedReader entrada, PrintWriter saida) throws IOException {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   ETAPA 2: COMUNICAÇÃO DE DADOS            ║");
        System.out.println("╚════════════════════════════════════════════╝");

        String mensagemCriptografada;
        int contadorMensagens = 0;

        while ((mensagemCriptografada = entrada.readLine()) != null) {

            if (mensagemCriptografada.equalsIgnoreCase("SAIR")) {
                System.out.println("🔚 Cliente solicitou encerramento da conexão.");
                break;
            }

            contadorMensagens++;
            System.out.println("\n📩 Mensagem #" + contadorMensagens + " recebida (criptografada):");
            System.out.println("   Dados: " + mensagemCriptografada);

            String mensagemOriginal = rsa.descriptografar(mensagemCriptografada);
            System.out.println("🔓 Mensagem descriptografada: \"" + mensagemOriginal + "\"");

            String resposta = "Servidor recebeu: " + mensagemOriginal;
            System.out.println("\n💬 Preparando resposta: \"" + resposta + "\"");

            String respostaCriptografada = rsa.criptografar(resposta);
            System.out.println("🔒 Resposta criptografada: " + respostaCriptografada);

            saida.println(respostaCriptografada);
            System.out.println("✅ Resposta enviada ao cliente!");
            System.out.println("─────────────────────────────────────────────");
        }

        System.out.println("\n📊 Total de mensagens processadas: " + contadorMensagens);
    }

    private void desconectar(Socket clienteSocket, BufferedReader entrada, PrintWriter saida) {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║   ETAPA 3: ENCERRANDO CONEXÃO              ║");
        System.out.println("╚════════════════════════════════════════════╝");

        try {
            System.out.println("🔌 Fechando streams de comunicação...");
            entrada.close();
            saida.close();

            System.out.println("🔌 Fechando socket do cliente...");
            clienteSocket.close();

            System.out.println("🔌 Parando servidor...");
            serverSocket.close();

            System.out.println("✅ Servidor encerrado com sucesso!");
            System.out.println("════════════════════════════════════════════\n");

        } catch (IOException e) {
            System.err.println("❌ Erro ao desconectar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.iniciar();
    }
}
