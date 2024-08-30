package ExemploFinal;

public class Exemplo1 {
    //declarando variável do tipo final
    final double numero;
    //criando uma constante, ela deve ser inicializada no momento da declaração
    //acesso universal -> public
    //existe independente da criação de instância -> static
    //n]ão pode ser modificada -> final
    public static final double PI = 3.141592653589793;


    //como não foi definido um valor no momento da declaração, este valor
    //deverá ser atribuído até o final do construtor
    public Exemplo1(){
        numero = 10;
    }
}
