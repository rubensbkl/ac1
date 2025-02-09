/**
 *
 * Pontificia Universidade Catolica de Minas Gerais
 *
 * Curso de Ciencia da Computacao
 * Arquitetura de Computadores I
 *
 * Guia 01 - v1.0 - 08 / 02 / 2025
 * 855796 - Rubens Dias Bicalho
 *
 */

module Guia_0102;
    // Definir inteiros
    integer x1 = 0;
    integer x2 = 0;
    integer x3 = 0;
    integer x4 = 0;
    integer x5 = 0;

    // Definir registradores
    reg [7:0] b1 = 8'b10011;
    reg [7:0] b2 = 8'b10101;
    reg [7:0] b3 = 8'b10110;
    reg [7:0] b4 = 8'b110010;
    reg [7:0] b5 = 8'b111011;

    // Ações
    initial
    begin : main
        // Identificação
        $display("Guia_0102 - Conversão de binário para decimal");

        // Atribuir e converter valores
        x1 = b1;
        x2 = b2;
        x3 = b3;
        x4 = b4;
        x5 = b5;
        
        // Mostrar resultados
        $display("b1 = %8b | x1 = %d", b1, x1);
        $display("b2 = %8b | x2 = %d", b2, x2);
        $display("b3 = %8b | x3 = %d", b3, x3);
        $display("b4 = %8b | x4 = %d", b4, x4);
        $display("b5 = %8b | x5 = %d", b5, x5);
    end
endmodule
