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

module Guia_0101;
    // Definir inteiros
    integer x1 = 27;
    integer x2 = 51;
    integer x3 = 725;
    integer x4 = 132;
    integer x5 = 360;

    // Definir registradores
    reg [7:0] b1 = 0;
    reg [7:0] b2 = 0;
    reg [15:0] b3 = 0;
    reg [7:0] b4 = 0;
    reg [15:0] b5 = 0;

    // Ações
    initial
    begin : main
        // Identificação
        $display("Guia_0101 - Conversão de decimal para binário");

        // Atribuir e converter valores
        b1 = x1;
        b2 = x2;
        b3 = x3;
        b4 = x4;
        b5 = x5;
        
        // Mostrar resultados
        $display("x1 = %d | b1 = %16b", x1, b1);
        $display("x2 = %d | b2 = %16b", x2, b2);
        $display("x3 = %d | b3 = %16b", x3, b3);
        $display("x4 = %d | b4 = %16b", x4, b4);
        $display("x5 = %d | b5 = %16b", x5, b5);
    end
endmodule
