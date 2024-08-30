package ExemploFinal;

public class Teste {
    public static void main(String[] args) {
        Exemplo1 ex = new Exemplo1();
        //não é possível trocar o valor de um atributo final
        //ex.numero = 25;
        //lendo o valor de uma constante
        System.out.println(Exemplo1.PI);
    }
}
