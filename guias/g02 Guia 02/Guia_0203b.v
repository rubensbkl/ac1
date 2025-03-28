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

module Guia_0203;
    // Definição dos valores binários com 16 bits
    reg [15:0] b1 = 16'b0000000001101000;
    reg [15:0] b2 = 16'b0000000010001100;
    reg [15:0] b3 = 16'b0000000010010100;
    reg [15:0] b4 = 16'b0000000111100100;
    reg [15:0] b5 = 16'b0000101111010000;

    initial begin
        // Identificação
        $display("\nGuia_0203\n");

        // Mostrar resultados
        $display("a.) %b.%b -> (4)  = %o.%o%o%o", b1[8:8], b1[7:2], b1[9:8], b1[7:6], b1[5:4], b1[3:2]);
        $display("b.) %b.%b -> (8)  = %o.%o", b2[8:8], b2[7:2], b1[10:8], {b2[7:5], b2[4:2]});
        $display("c.) %b.%b -> (16) = %h.%h", b3[8:8], b3[7:2], b3[11:8], {b3[7:4], b3[3:0]});
        $display("d.) %b.%b -> (8)  = %o.%o", b4[8:8], b4[7:2], b4[10:8], {b4[7:5], b4[4:2]});
        $display("e.) %b.%b -> (16) = %h.%h", b5[11:8], b5[7:4], b5[11:8], b5[7:4]);
        $display("\n");
    end
endmodule
