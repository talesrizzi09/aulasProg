package ExemploMetodo;

import java.util.Scanner;

public class Exemplo1 {
    static int soma(int n1, int n2, int n3){
        int r = n1+n2+n3;
        return r;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Digite um número: ");
        n1 = ler.nextInt();
        System.out.print("Digite outro número: ");
        n2 = ler.nextInt();
        int resposta = soma(n1,n2);
        System.out.println("A soma vale "+resposta);
    }
}
