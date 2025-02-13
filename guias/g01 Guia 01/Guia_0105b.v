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

module Guia_0105;
   // Definir variáveis
   integer x = 0; // decimal
   reg [0:8][7:0] a = "PUC-Minas"; // char array[8] (8x8 bits - little Endian)
   reg [0:6][7:0] b = "2025-01"; // char array[7] (7x8 bits - little Endian)
   reg [0:20][7:0] c = "Belo Horizonte - M.G."; // char array[14] (14x8 bits - little Endian)
   reg [0:4][7:0] d = { 8'o156 , 8'o157 , 8'o151 , 8'o164 , 8'o145}; // octal
   reg [0:4][7:0] e = { 8'h4d , 8'h61 , 8'h6e , 8'h68 , 8'h61}; // hexadecimal

   // Ações
   initial
   begin : main
      // Identificação
      $display("Guia_0105 - Conversão entre símbolos e códigos ASCII");
      
      $write ( "a = \"%s\" = " , a);
      for ( x = 0; x < 9; ++x ) begin
        $write ( "%h " , a[x] );
      end
      $write( "(16_ASCII)\n" );

      $write ( "b = \"%s\" = " , b);
      for ( x = 0; x < 7; ++x ) begin
        $write ( "%h " , b[x] );
      end
      $write( "(16_ASCII)\n" );

      $write ( "c = \"%s\" = " , c);
      for (x = 0; x < 21; ++x ) begin
        $write ( "%b " , c[x] );
      end
      $write( "(2_ASCII)\n" );

      $write ( "d = " );
      for (x = 0; x < 5 ; ++x ) begin
         $write ( "%o " , d[x] );
      end
      $write ( "(8) = " );
      for ( x = 0; x < 5; ++x ) begin
        $write ( "%c " , d[x]);
      end
      $write( "(ASCII)\n" );

      $write ( "e = " );
      for (x = 0; x < 5 ; ++x ) begin
         $write ( "%h " , e[x] );
      end
      $write ( "(16) = " );
      for (x = 0; x < 5; ++x) begin
         $write ( "%c " , e[x] );
      end
      $write( "(ASCII)\n" );
   end
endmodule