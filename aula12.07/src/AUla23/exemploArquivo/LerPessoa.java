package AUla23.exemploArquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerPessoa {
    public static void main(String[] args) {
        File caminho = new File("C:/Users/Cimol/Documents/aula23");
        File arquivo = new File(caminho,"pessoas.db");
        try {
            ObjectInputStream objLeitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = (Pessoa) objLeitura.readObject();
            System.out.println(p1);
            objLeitura.close();
        }catch (ClassNotFoundException e){
            System.out.println("Erro ao localizar a classe");
        }
        catch (IOException e){
            System.out.println("erro ao ler o arquivo");
        }
    }
}
