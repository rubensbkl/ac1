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
        StringBuilder hex = new StringBuilder();
        for (char c : value.toCharArray()) {
            hex.append(String.format("%02X ", (int) c));
        }
        return hex.toString().trim();
    }

    public static String ASCII2bin(String value) {
        StringBuilder bin = new StringBuilder();
        for (char c : value.toCharArray()) {
            bin.append(String.format("%08d ", Integer.parseInt(Integer.toBinaryString(c))));
        }
        return bin.toString().trim();
    }

    /**
     * Converter valor em hexadecimal para ASCII.
     * @return caractere(s) em codigo ASCII
     * @param value - hexadecimal equivalente(s)
     */
    public static String hex2ASCII(String value) {
        value = value.replaceAll("\\s+", "");

        if (!value.matches("[0-9A-Fa-f]+")) {
            throw new IllegalArgumentException("A string hexadecimal contém caracteres inválidos.");
        }

        if (value.length() % 2 != 0) {
            throw new IllegalArgumentException("A string hexadecimal deve ter um número par de caracteres.");
        }
    
        StringBuilder ascii = new StringBuilder();
        for (int i = 0; i < value.length(); i += 2) {
            String hexPair = value.substring(i, i + 2);
            int decimalValue = hexToDecimal(hexPair);
            ascii.append((char) decimalValue);
        }
    
        return ascii.toString();
    }

    private static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int digitValue = hexCharToDecimal(c);
            decimal = decimal * 16 + digitValue;
        }
        return decimal;
    }

    private static int hexCharToDecimal(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        } else {
            throw new IllegalArgumentException("Caractere inválido: " + c);
        }
    }

    public static String octal2ASCII(String octalString) {
        StringBuilder ascii = new StringBuilder();
        String[] octalValues = octalString.split("\\s+");
    
        for (String octal : octalValues) {
            int decimalValue = Integer.parseInt(octal, 8); 
            ascii.append((char) decimalValue);
        }
    
        return ascii.toString();
    }

    /**
     * Acao principal.
     */
    public static void main (String [] args) {
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
        test_equals(ASCII2hex("PUC-Minas"), "50 55 43 2D 4D 69 6E 61 73");
        test_equals(ASCII2hex("2025-01"), "32 30 32 35 2D 30 31");
        test_equals(ASCII2bin("Belo Horizonte - M.G."), "01000010 01100101 01101100 01101111 00100000 01001000 01101111 01110010 01101001 01111010 01101111 01101110 01110100 01100101 00100000 00101101 00100000 01001101 00101110 01000111 00101110");
        test_equals(octal2ASCII("156 157 151 164 145"), "noite");
        test_equals(hex2ASCII("4D 61 6E 68 61"), "Manha");
        System.out.println("5. errorTotalReport = " + test_report());
        System.out.print("\n\nApertar ENTER para terminar.");
        System.console().readLine();
    }
}