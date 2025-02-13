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

module Guia_0102;
    // Definir inteiros
    integer x1 = 54;
    integer x2 = 67;
    integer x3 = 76;
    integer x4 = 157;
    integer x5 = 731;

    // Definir registradores
    reg [15:0] b1 = 0;
    reg [15:0] b2 = 0;
    reg [15:0] b3 = 0;
    reg [15:0] b4 = 0;
    reg [15:0] b5 = 0;

    // Ações
    initial
    begin : main
        // Identificação
        $display("Guia_0103 - Conversão de decimal para outras bases");

        // Atribuir e converter valores
        b1 = x1;
        b2 = x2;
        b3 = x3;
        b4 = x4;
        b5 = x5;
        
        // Mostrar resultados
        $display("%d (10) = %b (2) = %o (8) = %x (16)", x1, b1, b1, b1);
        $display("%d (10) = %b (2) = %o (8) = %x (16)", x2, b2, b2, b2);
        $display("%d (10) = %b (2) = %o (8) = %x (16)", x3, b3, b3, b3);
        $display("%d (10) = %b (2) = %o (8) = %x (16)", x4, b4, b4, b4);
        $display("%d (10) = %b (2) = %o (8) = %x (16)", x5, b5, b5, b5);
    end
endmodule
