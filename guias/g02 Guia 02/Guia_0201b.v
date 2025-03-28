/**
 *
 * Pontificia Universidade Catolica de Minas Gerais
 *
 * Curso de Ciencia da Computacao
 * Arquitetura de Computadores I
 *
 * Guia 02 - v1.0 - 09 / 02 / 2025
 * 855796 - Rubens Dias Bicalho
 *
 */

module Guia_0201;
    
    reg [6:0] a = 7'b000101;
    reg [6:0] b = 7'b001101;
    reg [6:0] c = 7'b010001;
    reg [6:0] d = 7'b110111;
    reg [6:0] e = 7'b1111101;

    // FUNÇÃO: Binario fracionário para decimal fracionario.
    function real bin2decimal;
        input [6:0] bin;
        input integer comma;
        real decimal;
        real power;
        integer i;
        begin
            decimal = 0.0;

            // Parte inteira
            power = 1.0;
            for (i = comma; i < 7; i++) begin
                if (bin[i] == 1) begin
                    decimal = decimal + power;
                end
                power = power * 2;
            end

            // Parte fracionária
            power = 0.5;
            for (i = comma - 1; i >= 0; i--) begin
                if (bin[i] == 1) begin
                    decimal = decimal + power;
                end
                power = power / 2.0;
            end

            bin2decimal = decimal;
        end
    endfunction

    // Ações
    initial
    begin : main 
        // Identificação
        $display("\nGuia_0201\n");

        // Mostrar resultados
        $display ("a.) %-b (2) = %f (10)", a, bin2decimal(a, 5));
        $display ("b.) %-b (2) = %f (10)", b, bin2decimal(b, 5));
        $display ("c.) %-b (2) = %f (10)", c, bin2decimal(c, 5));
        $display ("d.) %-b (2) = %f (10)", d, bin2decimal(d, 5));
        $display ("e.) %-b (2) = %f (10)", e, bin2decimal(e, 5));
        $display("\n");
    end
endmodule