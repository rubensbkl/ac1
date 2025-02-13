/**
 *
 * Pontificia Universidade Catolica de Minas Gerais
 *
 * Curso de Ciencia da Computacao
 * Arquitetura de Computadores I
 *
 * Guia 01 - v1.0 - 09 / 02 / 2025
 * 855796 - Rubens Dias Bicalho
 *
 */

public class Guia_01c {

    /**
     * Contador de erros.
     */
    private static int errors = 0;

    /**
     * Testar se dois valores sao iguais.
     * @param x - primeiro valor
     * @param y - segundo valor
     */
    public static void test_equals(Object x, Object y) {
        if (("" + x).compareTo("" + y) != 0)
        errors = errors + 1;
    }

    /**
     * Exibir o total de erros.
     * @return mensagem com o total de erros
     */
    public static String test_report() {
        return ("" + errors);
    }

    /**
     * Converter valor decimal para binario.
     * @return binario equivalente
     * @param value - valor decimal
     */
    public static String dec2bin(int value) {
        String result = "";

        while (value > 0) {
            int bit = value % 2;
            value /= 2;
            result = bit + result;
        }

        return result.isEmpty() ? "0" : result;
    }

    /**
     * Converter valor binario para decimal.
     * @return decimal equivalente
     * @param value - valor binario
     */
    public static int bin2dec(String value) {
        int decimal = 0;
        int tamanho = value.length();
    
        for (int i = 0; i < tamanho; i++) {
            int bit = value.charAt(i) - '0';
            decimal += bit * (1 << (tamanho - i - 1));
        }
        return decimal;
    }

    /**
     * Converter valor decimal para base indicada.
     * @return base para a conversao
     * @param value - valor decimal
     */
    public static String dec2base(int value, int base) {
        char[] digits = "0123456789ABCDEF".toCharArray();
        StringBuilder result = new StringBuilder();
    
        while (value > 0) {
            int bit = value % base;
            result.insert(0, digits[bit]);
            value = value / base;
        }

        return result.toString();
    }
    

    /**
     * Converter valor binario para base indicada.
     * @return valor equivalente na base indicada
     * @param value - valor binario
     * @param base - para a conversao
     */
    public static String bin2base(String value, int base) {
        int decimal = bin2dec(value);
        return dec2base(decimal, base);
    }

    /**
     * Converter valor em ASCII para hexadecimal.
     * @return hexadecimal equivalente
     * @param value - caractere(s) em codigo ASCII
     */
    public static String ASCII2hex(String value) {
        return ("0");
    }

    /**
     * Converter valor em hexadecimal para ASCII.
     * @return caractere(s) em codigo ASCII
     * @param value - hexadecimal equivalente(s)
     */
    public static String hex2ASCII(String value) {
        return ( "0" );
    }

    /**
     * Acao principal.
     */
    public static void main (String [ ] args) {
        System.out.println("Guia_01 - Java");
        System.out.println("855796 - Rubens Dias Bicalho");
        System.out.println();
        test_equals(dec2bin(27), "11011");
        test_equals(dec2bin(51), "110011");
        test_equals(dec2bin(725), "1011010101");
        test_equals(dec2bin(132), "10000100");
        test_equals(dec2bin(360), "101101000");
        System.out.println("1. errorTotalReport = " + test_report());
        test_equals(bin2dec("10011"), 19);
        test_equals(bin2dec("10101"), 21);
        test_equals(bin2dec("10110"), 22);
        test_equals(bin2dec("110010"), 50);
        test_equals(bin2dec("111011"), 59);
        System.out.println("2. errorTotalReport = " + test_report());
        test_equals(dec2base(54, 4), "312");
        test_equals(dec2base(67, 8), "103");
        test_equals(dec2base(76, 16), "4C");
        test_equals(dec2base(157, 16), "9D");
        test_equals(dec2base(731, 16), "2DB");
        System.out.println("3. errorTotalReport = " + test_report());
        test_equals(bin2base("10110", 4), "112");
        test_equals(bin2base("11011", 8), "33");
        test_equals(bin2base("100100", 16), "24");
        test_equals(bin2base("101011", 8), "53");
        test_equals(bin2base("101100", 4), "230");
        System.out.println("4. errorTotalReport = " + test_report());
        test_equals(ASCII2hex("PUC-Minas"), "50 55 43 2d 4d 69 6e 61 73");
        test_equals(ASCII2hex("2025-01"), "32 30 32 35 2d 30 31");
        test_equals(ASCII2hex("Belo Horizonte - M.G."), "01000010 01100101 01101100 01101111 00100000 01001000 01101111 01110010 01101001 01111010 01101111 01101110 01110100 01100101 00100000 00101101 00100000 01001101 00101110 01000111 00101110");
        // OBS.: A seguir, exemplos apenas para os primeiros, acrescentar todos os outros códigos propostos!
        test_equals(hex2ASCII("164 ..."), "noite"); // OBS.: 164 e' o primeiro octal (0o164)!
        test_equals(hex2ASCII("4E ... "), "Manha"); // OBS.: 4E e' o primeiro hexadecimal (0x4E)!
        System.out.println("5. errorTotalReport = " + test_report());
        System.out.print("\n\nApertar ENTER para terminar.");
        System.console().readLine();
    }
}