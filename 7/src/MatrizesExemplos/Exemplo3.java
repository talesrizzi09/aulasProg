package MatrizesExemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        for(int l=0;l<4;l++){
            for(int c=0;c<3;c++){
                System.out.printf("Matriz [%d][%d]: ",l,c);
                matriz[l][c] = ler.nextInt();
            }
        }
        for(int l=0;l<4;l++){
            for(int c=0;c<3;c++) {
                System.out.printf("%02d ", matriz[l][c]);
            }
            System.out.println();
        }

    }
}
