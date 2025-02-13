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
    // Definir registradores
    reg [7:0] b1 = 8'b00010110;
    reg [7:0] b2 = 8'b00011011;
    reg [7:0] b3 = 8'b00100100;
    reg [7:0] b4 = 8'b00101011;
    reg [7:0] b5 = 8'b00101100;

    // Ações
    initial
    begin : main
        // Identificação
        $display("Guia_0104 - Conversão por agrupamento");
        
        // Mostrar conversões
        $display("10110(2) = [%2b] [%2b] [%2b] = %d%d%0d(4)", b1[5:4], b1[3:2], b1[1:0], b1[5:4], b1[3:2], b1[1:0]);
        $display("11011(2) = [%3b] [%3b] = %d%0d(8)", b2[5:3], b2[2:0], b2[5:3], b2[2:0]);
        $display("100100(2) = [%4b] [%4b] = %d%0d(16)", b3[7:4], b3[3:0], b3[7:4], b3[3:0]);
        $display("101011(2) = [%3b] [%3b] = %d%0d(8)", b4[5:3], b4[2:0], b4[5:3], b4[2:0]);
        $display("101100(2) = [%2b] [%2b] [%2b] = %d%d%0d(4)", b5[5:4], b5[3:2], b5[1:0], b5[5:4], b5[3:2], b5[1:0]);
    end
endmodule
