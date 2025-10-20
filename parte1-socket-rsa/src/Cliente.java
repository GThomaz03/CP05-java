import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    private static final String HOST = "localhost";
    private static final int PORTA = 12345;
    private Socket socket;
    private RSACrypto rsa;

    public Cliente() {
        this.rsa = new RSACrypto(61, 53, 17);
    }

    public void conectar() {
        try {
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║     CLIENTE TCP INICIADO COM RSA           ║");
            System.out.println("╚════════════════════════════════════════════╝");
            System.out.println("🔐 Criptografia RSA ativada!");
            System.out.println("🔑 Chave Pública: " + rsa.getChavePublica());
            System.out.println("📡 Conectando ao servidor " + HOST + ":" + PORTA + "...\n");

            socket = new Socket(HOST, PORTA);
            System.out.println("✅ Conectado ao servidor!");
            System.out.println("─────────────────────────────────────────────\n");

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter saida = new PrintWriter(
                    socket.getOutputStream(), true
            );
            Scanner scanner = new Scanner(System.in);

            receberChavePublica(entrada);
            comunicarComServidor(entrada, saida, scanner);
            desconectar(entrada, saida, scanner);

        } catch (UnknownHostException e) {
            System.err.println("❌ Host não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("❌ Erro de I/O: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void receberChavePublica(BufferedReader entrada) throws IOException {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   ETAPA 1: RECEBENDO CHAVE PÚBLICA         ║");
        System.out.println("╚════════════════════════════════════════════╝");

        String chavePublicaServidor = entrada.readLine();
        System.out.println("📥 Chave pública do servidor recebida:");
        System.out.println("   Chave: " + chavePublicaServidor);
        System.out.println("✅ Troca de chaves concluída!");
        System.out.println("─────────────────────────────────────────────\n");
    }

    private void comunicarComServidor(BufferedReader entrada, PrintWriter saida, Scanner scanner) throws IOException {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   ETAPA 2: COMUNICAÇÃO DE DADOS            ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("💡 Digite suas mensagens (ou 'SAIR' para encerrar)\n");

        int contadorMensagens = 0;
        String mensagem;

        while (true) {
            System.out.print("Você: ");
            mensagem = scanner.nextLine();

            if (mensagem.equalsIgnoreCase("SAIR")) {
                saida.println("SAIR");
                System.out.println("🔚 Encerrando comunicação...");
                break;
            }

            contadorMensagens++;
            System.out.println("\n📤 Mensagem #" + contadorMensagens + ": \"" + mensagem + "\"");

            String mensagemCriptografada = rsa.criptografar(mensagem);
            System.out.println("🔒 Mensagem criptografada: " + mensagemCriptografada);

            saida.println(mensagemCriptografada);
            System.out.println("✅ Mensagem enviada ao servidor!");

            System.out.println("\n⏳ Aguardando resposta do servidor...");
            String respostaCriptografada = entrada.readLine();

            if (respostaCriptografada == null) {
                System.out.println("❌ Servidor desconectou.");
                break;
            }

            System.out.println("📩 Resposta recebida (criptografada):");
            System.out.println("   Dados: " + respostaCriptografada);

            String respostaOriginal = rsa.descriptografar(respostaCriptografada);
            System.out.println("🔓 Resposta descriptografada: \"" + respostaOriginal + "\"");
            System.out.println("─────────────────────────────────────────────\n");
        }

        System.out.println("\n📊 Total de mensagens enviadas: " + contadorMensagens);
    }

    private void desconectar(BufferedReader entrada, PrintWriter saida, Scanner scanner) {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║   ETAPA 3: ENCERRANDO CONEXÃO              ║");
        System.out.println("╚════════════════════════════════════════════╝");

        try {
            System.out.println("🔌 Fechando streams de comunicação...");
            entrada.close();
            saida.close();

            System.out.println("🔌 Fechando socket...");
            socket.close();

            System.out.println("🔌 Fechando scanner...");
            scanner.close();

            System.out.println("✅ Cliente desconectado com sucesso!");
            System.out.println("════════════════════════════════════════════\n");

        } catch (IOException e) {
            System.err.println("❌ Erro ao desconectar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.conectar();
    }
}