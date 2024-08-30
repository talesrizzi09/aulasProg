package ExemploEncapsulamento;

import java.util.Random;

public class Conta {
    String titular;
    private String identificador;
    private float saldo;
    //criando um atributo estatico
    static String nomeBanco;

    public Conta(String titular, float saldo) {
        this.titular = titular;
        this.identificador = identificador;
        this.saldo = saldo;
        geraIdentificador();
    }

    public String getIdentificador(){
        return identificador;
    }

    boolean sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    void depositar(float valor) {
        saldo += valor;
    }

    private void geraIdentificador(){
        String identificador = "";
        Random aleatorio = new Random();
        for (int i=0; i<4; i++){
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.identificador = identificador;
    }

    String verificaSaldo() {
        return String.format("Seu saldo é de R$%.2f", saldo);
    }
}

