package AUla23.exemploexcecao;

public class Teste {
    public static void main(String[] args) {
        Exemplo2throw e1 = new Exemplo2throw();
        try {
            e1.divide(5,0);
        } catch (ArithmeticException e){
            System.out.println("Nao foi possivel dividir");
        }
    }
}
