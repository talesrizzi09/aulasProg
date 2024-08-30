package ExemploPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Juan");
        p1.setSobrenome("Welter");
        Aluno a1 = new Aluno();
        a1.setNome("Jonas");
        a1.setSobrenome("Silva");
        a1.setMatricula("A1234");
        System.out.println(p1);
        System.out.println(p1.obterDados());
        System.out.println(a1);
        System.out.println(a1.obterDados());
    }
}
