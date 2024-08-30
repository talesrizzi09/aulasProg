package AUla23.exemploexcecao;

public class Exemplo2throw {
    public int divide(int n1, int n2) throws ArithmeticException{
        if (n2==0)
            throw new ArithmeticException("n é possivel dividir por 0 ");
            return n1/n2;

    }
}
