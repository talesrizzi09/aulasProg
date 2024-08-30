package AUla23.exemploArquivo;

import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Field;

public class GravarPessoa {
    public static void main(String[] args) {
        File caminho = new File("C:/Users/Cimol/Documents/aula23");
        if (!caminho.exists()){
            System.out.println("Caminho não existe, tentando criar...");
            caminho.mkdirs();
            System.out.println(" [OK]");
        }
        File arquivo = new File(caminho,"pessoas.db");
        try{
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa p1= new Pessoa();
            p1.setNome("Joninhas");
            p1.setSobrenome("souza");
            objEscrita.writeObject(p1);
            objEscrita.close();
        }catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado ou nao pode ser criado");
        }
        catch (IOException e){
            System.out.println("erro ao ler arquivo");
        }
    }
}
