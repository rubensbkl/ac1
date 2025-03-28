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

module Guia_0202;
    real numbers[0:4];
    reg [7:0] letters[0:4];
    reg [15:0] binary; 
    real x, frac_part; 
    integer int_part, temp_int_part, i, y, bit_pos; 

    initial
    begin: main

        numbers[0] = 0.625000;
        numbers[1] = 1.750000;
        numbers[2] = 3.125000;
        numbers[3] = 4.312500;
        numbers[4] = 7.875000;

        letters[0] = "a";
        letters[1] = "b";
        letters[2] = "c";
        letters[3] = "d";
        letters[4] = "e";

        // Identificação
        $display("\nGuia_0202\n");

        for (i = 0; i < 5; i = i + 1) begin
            x = numbers[i];
            binary = 0;

            int_part = $floor(x);
            frac_part = x - int_part;

            for (bit_pos = 15; bit_pos >= 8; bit_pos = bit_pos - 1) begin
                binary[bit_pos] = int_part[bit_pos - 8];
            end

            for (y = 7; y >= 0; y = y - 1) begin
                frac_part = frac_part * 2;
                if (frac_part >= 1) begin
                    binary[y] = 1;
                    frac_part = frac_part - 1;
                end else begin
                    binary[y] = 0;
                end
            end

            $write("%c.) %f (10) = ", letters[i], x);
            for (y = 15; y >= 0; y = y - 1) begin
                if (y == 7) $write(".");
                    $write("%b", binary[y]);
            end
            $write(" (2)\n");
        end
        $display("\n");
    end
endmodule