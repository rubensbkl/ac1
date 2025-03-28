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

module Guia_0204;
    reg [15:0] b1 = 16'b0000000010110100;
    reg [15:0] b2 = 16'b0000010111000010;
    reg [15:0] b3 = 16'b0000000111011101;
    reg [15:0] b4 = 16'b0110010011100101;
    reg [15:0] b5 = 16'b1011101001011110;

    initial begin
        // Identificação
        $display("\nGuia_0204\n");

        // Mostrar resultados
        $display("a.) %o,%o%o%o(4)  -> 0.%b(2)", b1[9:8], b1[7:6], b1[5:4], b1[3:2], b1[7:0]);
        $display("b.) %x,%x%x%x(16) -> %o.%o%o%o%o%o%o(4)", b2[15:12], b2[11:8], b2[7:4], b2[3:0], b2[13:12], b2[11:10], b2[9:8], b2[7:6], b2[5:4], b2[3:2], b2[1:0]);
        $display("c.) %o,%o%o%o(8)  -> 0.%b(2)", b3[11:9], b3[8:6], b3[5:3], b3[2:0], b3[8:0]);
        $display("d.) %o,%o%o%o%o(8) -> %o%o.%o%o%o%o%o%o(4)", b4[14:12], b4[11:9], b4[8:6], b4[5:3], b4[2:0], b4[15:14], b4[13:12], b4[11:10], b4[9:8], b4[7:6], b4[5:4], b4[3:2], b4[1:0]);
        $display("e.) %x,%x%x%x(16) -> %o%o.%o%o%o%o%o%o(4)", b5[15:12], b5[11:8], b5[7:4], b5[3:0], b5[15:14], b5[13:12], b5[11:10], b5[9:8], b5[7:6], b5[5:4], b5[3:2], b5[1:0]);
        $display("\n");
    end
endmodule
