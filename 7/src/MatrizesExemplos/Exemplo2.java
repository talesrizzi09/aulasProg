package MatrizesExemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = {{1,2,3},{4,5,6,},{7,8,9},{10,11,12,}};
        System.out.println("A quantidade de linhas da matriz é "+matriz.length);
        System.out.println("A quantidade de colunas da matirz é "+matriz[0].length);
        for (int l=0;l< matriz.length;l++){
            for (int c=0;c< matriz[l].length;c++){
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.println();
        }
        System.out.println("Usando o for simplificado");
        for(int[] linha : matriz){
            for (int c : linha){
                System.out.printf("%02d ",c);
            }
            System.out.println();
        }
    }
}
