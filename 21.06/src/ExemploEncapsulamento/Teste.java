package ExemploEncapsulamento;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        System.out.printf("Qual o nome: ");
        String nome = ler.next();
        System.out.println("Qual o sobrenome: ");
        String sobrenome = ler.next();
        Pessoa pessoaUm = new Pessoa(nome,sobrenome);
        System.out.println("Nome: "+pessoaUm.getNome());
        System.out.println("Sobrenome "+pessoaUm.getSobrenome());
        //Se precisar alterar informação
        System.out.println("Qual o nome: ");
        nome = ler.next();
        System.out.println("Qual o sobenome: ");
        sobrenome = ler.next();
        pessoaUm.setNome(nome);
        pessoaUm.setSobrenome(sobrenome);
        System.out.println("Nome: "+pessoaUm.getNome());
        System.out.println("Sobrenome: "+pessoaUm.getSobrenome());
    }
}
