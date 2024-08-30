package ExemploArquivo;

import java.io.*;

public class GravarPessoa {
    public static void main(String[] args) {
        File caminho = new File("C:/Users/Cimol/Documents/aula23");
        if (!caminho.exists()){
            System.out.println("Caminho não existe, tentando criar...");
            caminho.mkdirs();
            System.out.println("[ok]");
        }
    File arquivo = new File(caminho,"pessoas.db");
        try{
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
        Pessoa p1 = new Pessoa();
        p1.setNome("Juan");
        p1.setSobrenome("Welter");
        //escrevendo p1 dentro do arquivo
        objEscrita.writeObject(p1);
        objEscrita.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado ou não pode ser criado");
        }
        catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
