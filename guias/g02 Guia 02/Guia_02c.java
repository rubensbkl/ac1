/**
 *
 * Pontificia Universidade Catolica de Minas Gerais
 *
 * Curso de Ciencia da Computacao
 * Arquitetura de Computadores I
 *
 * Guia 02 - v1.0 - 28 / 03 / 2025
 * 855796 - Rubens Dias Bicalho
 *
 */

public class Guia_02c  {

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
     * Converter valor binario para decimal com parte fracionaria. 
     * @return decimal equivalente 
     * @param  value - valor binario 
     */ 
    public static double bin2double(String value) {
        String[] parts = value.split("\\.");
        String intPart = parts[0];
        String fracPart = (parts.length > 1) ? parts[1] : "";

        double result = 0.0;

        int intLen = intPart.length();
        for (int i = 0; i < intLen; i++) {
            if (intPart.charAt(i) == '1') {
                result += Math.pow(2, intLen - 1 - i);
            }
        }

        int fracLen = fracPart.length();
        for (int i = 0; i < fracLen; i++) {
            if (fracPart.charAt(i) == '1') {
                result += Math.pow(2, -(i + 1));
            }
        }

        return result;
    }

    /**
     * Converter valor decimal para binario com parte fracionaria. 
     * @return valor binario equivalente 
     * @param  value - decimal 
     */ 
    public static String double2bin(double value) {
        if (value == 0) return "0";

        StringBuilder bin = new StringBuilder();

        int intPart = (int) value;
        double fracPart = value - intPart;

        while (intPart > 0) {
            bin.insert(0, intPart % 2);
            intPart /= 2;
        }

        if (bin.length() == 0) bin.append("0");

        if (fracPart > 0) {
            bin.append(".");

            for (int i = 0; i < 10 && fracPart > 0; i++) { 
                fracPart *= 2;
                int bit = (int) fracPart;
                bin.append(bit);
                fracPart -= bit;
            }
        }

        return bin.toString();
    }
 
    /** 
     * Converter valor binario com parte fracionaria para base indicada. 
     * @return base para a conversao 
     * @param  value - valor binario 
     */ 
    public static String dbin2base(String value, int base) {
        double decimalValue = bin2double(value);
        
        int intPart = (int) decimalValue;
        double fracPart = decimalValue - intPart;
        
        String intStr = "";
        while (intPart > 0) {
            intStr = Integer.toString(intPart % base) + intStr;
            intPart /= base;
        }

        if (intStr.equals("")) intStr = "0";

        StringBuilder fracStr = new StringBuilder();
        if (fracPart > 0) {
            fracStr.append(".");
            for (int i = 0; i < 10 && fracPart > 0; i++) { 
                fracPart *= base;
                int digit = (int) fracPart;
                fracStr.append(Integer.toString(digit));
                fracPart -= digit;
            }
        }

        return intStr + fracStr.toString();
    }

    /**
     * Converter valor com parte fracionaria de uma base para outra base indicada. 
     * @return valor equivalente na segunda base 
     * @param  value  - valor na base1 
     * @param  base1 - primeira base 
     * @param  base2 - base para a conversao 
     */ 
    public static String dbase2base(String value, int base1, int base2)  { 
        return ( "0" ); 
    }
 
    /** 
     * Operar valores em binario 
     * @return valor resultante da operacao, se valida 
     * @param  value1 - primeiro valor binario 
     * @param  op       - operacao 
     * @param  value2 - segundo  valor binario 
     */
    public static String dbinEval(String value1, String op, String value2)  { 
        return ( "0" ); 
    }

    /**
     * Acao principal.
     */
    public static void main (String [] args) { 
        System.out.println("Guia_02 - Java");
        System.out.println("855796 - Rubens Dias Bicalho");
        System.out.println(); 
        test_equals(bin2double("0.00101"), 0.15625); 
        test_equals(bin2double("0.01101"), 0.40625); 
        test_equals(bin2double("0.10001"), 0.53125); 
        test_equals(bin2double("1.10111"), 1.71875); 
        test_equals(bin2double("11.11101"), 3.90625); 
        System.out.println("1. errorTotalReport = " + test_report()); 
        test_equals(double2bin(0.625000), "0.101"); 
        test_equals(double2bin(1.750000), "1.11"); 
        test_equals(double2bin(3.125000), "11.001"); 
        test_equals(double2bin(4.312500), "100.0101"); 
        test_equals(double2bin(7.875000), "111.111"); 
        System.out.println("2. errorTotalReport = " + test_report());
        System.out.println(dbin2base("1011.1101", 16));
        test_equals(dbin2base("0.011010", 4), "0.122"); 
        test_equals(dbin2base("0.100011", 8), "0.43"); 
        test_equals(dbin2base("0.100101", 16), "0.94"); 
        test_equals(dbin2base("1.111001", 8), "1.71"); 
        test_equals(dbin2base("1011.1101", 16), "b.d"); 
        System.out.println("3. errorTotalRepor = " + test_report()); 
        test_equals(dbase2base("0.231", 4 , 2), "0"); 
        test_equals(dbase2base("0.5C2", 4 , 16), "0"); 
        test_equals(dbase2base("0.735", 8, 2), "0"); 
        test_equals(dbase2base("6.2345", 8, 4), "0"); 
        test_equals(dbase2base("B.A5E", 16, 4), "0"); 
        System.out.println("4. errorTotalReport = " + test_report());
        test_equals(dbinEval("101.01", "+", "10.011"), "0"); 
        test_equals(dbinEval("1000.001", "-", "10.01"), "0"); 
        test_equals(dbinEval("101,110", "*", "10.001"), "0"); 
        test_equals(dbinEval("10110.01", "/", "11.011"), "0"); 
        test_equals(dbinEval("1101101","%", "1011"), "0"); 
        System.out.println("5. errorTotalReport = " + test_report()); 
        System.out.print("\n\nApertar ENTER para terminar."); 
        System.console().readLine(); 
    }
}