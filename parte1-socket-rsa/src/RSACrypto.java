import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para criptografia e descriptografia RSA
 * Implementa o algoritmo RSA com números primos p e q
 */
public class RSACrypto {

    // Parâmetros RSA
    private BigInteger p;  // Número primo p
    private BigInteger q;  // Número primo q
    private BigInteger n;  // Módulo (p * q)
    private BigInteger phi; // Função totiente φ(n) = (p-1)(q-1)
    private BigInteger e;  // Expoente público
    private BigInteger d;  // Expoente privado (inverso multiplicativo)

    /**
     * Construtor - Inicializa os parâmetros RSA
     * IMPORTANTE: Escolha valores de p e q diferentes dos outros grupos!
     *
     * @param p Número primo p
     * @param q Número primo q
     * @param e Expoente público (geralmente 65537 ou outro valor coprimo com phi)
     */
    public RSACrypto(long p, long q, long e) {
        this.p = BigInteger.valueOf(p);
        this.q = BigInteger.valueOf(q);
        this.e = BigInteger.valueOf(e);

        // Calcula n = p * q
        this.n = this.p.multiply(this.q);

        // Calcula phi = (p-1) * (q-1)
        BigInteger pMinus1 = this.p.subtract(BigInteger.ONE);
        BigInteger qMinus1 = this.q.subtract(BigInteger.ONE);
        this.phi = pMinus1.multiply(qMinus1);

        // Calcula d = inverso multiplicativo de e mod phi
        this.d = this.e.modInverse(this.phi);

        System.out.println("=== Parâmetros RSA Inicializados ===");
        System.out.println("p = " + this.p);
        System.out.println("q = " + this.q);
        System.out.println("n = " + this.n);
        System.out.println("φ(n) = " + this.phi);
        System.out.println("e (público) = " + this.e);
        System.out.println("d (privado) = " + this.d);
        System.out.println("===================================\n");
    }

    /**
     * Criptografa uma mensagem usando a chave pública
     * Fórmula: C = M^e mod n
     *
     * @param mensagem Texto a ser criptografado
     * @return Texto criptografado (números separados por espaço)
     */
    public String criptografar(String mensagem) {
        System.out.println(">>> CRIPTOGRAFANDO <<<");
        System.out.println("Mensagem original: " + mensagem);

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);
            int m = (int) c;  // Converte caractere para código ASCII

            // C = M^e mod n
            BigInteger M = BigInteger.valueOf(m);
            BigInteger C = M.modPow(e, n);

            resultado.append(C);
            if (i < mensagem.length() - 1) {
                resultado.append(" ");  // Separador entre blocos
            }

            System.out.println("  '" + c + "' (ASCII " + m + ") -> " + C);
        }

        String mensagemCriptografada = resultado.toString();
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);
        System.out.println();
        return mensagemCriptografada;
    }

    /**
     * Descriptografa uma mensagem usando a chave privada
     * Fórmula: M = C^d mod n
     *
     * @param mensagemCriptografada Texto criptografado (números separados por espaço)
     * @return Texto original descriptografado
     */
    public String descriptografar(String mensagemCriptografada) {
        System.out.println(">>> DESCRIPTOGRAFANDO <<<");
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

        String[] blocos = mensagemCriptografada.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String bloco : blocos) {
            BigInteger C = new BigInteger(bloco);

            // M = C^d mod n
            BigInteger M = C.modPow(d, n);

            int m = M.intValue();
            char c = (char) m;
            resultado.append(c);

            System.out.println("  " + C + " -> (ASCII " + m + ") '" + c + "'");
        }

        String mensagemOriginal = resultado.toString();
        System.out.println("Mensagem descriptografada: " + mensagemOriginal);
        System.out.println();
        return mensagemOriginal;
    }

    // ========== GETTERS - Para compartilhar chaves ==========

    /**
     * Retorna a chave pública (e, n)
     * Esta chave pode ser compartilhada publicamente
     */
    public String getChavePublica() {
        return e + "," + n;
    }

    /**
     * Retorna apenas o módulo n
     */
    public BigInteger getN() {
        return n;
    }

    /**
     * Retorna apenas o expoente público e
     */
    public BigInteger getE() {
        return e;
    }

    /**
     * Retorna apenas o expoente privado d
     * CUIDADO: Esta é a chave privada! Não compartilhe!
     */
    public BigInteger getD() {
        return d;
    }

    // ========== MAIN - Para testar a classe ==========

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   TESTE DE CRIPTOGRAFIA RSA              ║");
        System.out.println("╚══════════════════════════════════════════╝\n");

        // ========================================
        // PARÂMETROS RSA DO GRUPO
        // ========================================
        // IMPORTANTE: Estes valores foram escolhidos pelo grupo e são únicos.
        // Os mesmos valores estão documentados na planilha Dados_RSA.xlsx
        //
        // p = 61 (número primo)
        // q = 53 (número primo)
        // e = 17 (expoente público)
        //
        // Valores calculados automaticamente:
        // n = 3233 (módulo)
        // φ(n) = 3120 (função totiente)
        // d = 2753 (expoente privado)
        // ========================================

        RSACrypto rsa = new RSACrypto(61, 53, 17);

        // Teste 1: Mensagem simples
        String mensagem1 = "OI";
        String cripto1 = rsa.criptografar(mensagem1);
        String descripto1 = rsa.descriptografar(cripto1);

        System.out.println("✓ Teste 1: " + (mensagem1.equals(descripto1) ? "PASSOU" : "FALHOU"));
        System.out.println("─────────────────────────────────────────\n");

        // Teste 2: Mensagem com números
        String mensagem2 = "FIAP123";
        String cripto2 = rsa.criptografar(mensagem2);
        String descripto2 = rsa.descriptografar(cripto2);

        System.out.println("✓ Teste 2: " + (mensagem2.equals(descripto2) ? "PASSOU" : "FALHOU"));
        System.out.println("─────────────────────────────────────────\n");

        // Teste 3: Mensagem mais longa
        String mensagem3 = "Socket TCP com RSA";
        String cripto3 = rsa.criptografar(mensagem3);
        String descripto3 = rsa.descriptografar(cripto3);

        System.out.println("✓ Teste 3: " + (mensagem3.equals(descripto3) ? "PASSOU" : "FALHOU"));

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   RESUMO DA CHAVE PÚBLICA                ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Chave Pública (e, n): " + rsa.getChavePublica());
        System.out.println("\nUse estes valores no simulador da Drexel University!");
    }
}