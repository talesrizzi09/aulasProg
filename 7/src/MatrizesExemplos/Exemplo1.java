package MatrizesExemplos;

import java.util.Random;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        Random aleatorio = new Random();
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length;c++) {
                matriz[l][c] = aleatorio.nextInt(1, 50);
                System.out.printf("%02d ", matriz[l][c]);
            }
            System.out.println();
        }
        System.out.println("\n DIAGONAL DA MATRIZ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l == c)
                    System.out.print(matriz[l][c]+" ");
            }
        }
        System.out.println("\n Diagonal ds matriz opc 2");
        for (int i=0;i< matriz.length;i++){
            System.out.print(matriz[i][i]+" ");
        }
        System.out.println("\n Diagonal da inversa matriz");
        for (int l=0;l< matriz.length;l++){
            for (int c=0;c< matriz[l].length;c++){
                if (l+c== matriz.length-1)
                    System.out.print(matriz[l][c]+" ");
            }
        }
    }
}