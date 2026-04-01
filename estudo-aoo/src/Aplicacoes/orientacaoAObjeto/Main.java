package Aplicacoes.orientacaoAObjeto;

public class Main {
    public static void main(String[] args) {
        School escola = new School("Escola dos Sonhos");
        Pessoa pessoa1 = new Pessoa("Carlos", 45);
        Pessoa pessoa2 = new Pessoa("José Carlos", 52);
        Studante estudante1 = new Studante("Maria Joaquina", 15, "9° ano");
        Studante estudante2 = new Studante("Sophia Luz",7, "2º ano");

        escola.adicionarMembro(pessoa1);
        escola.adicionarMembro(estudante1);
        escola.adicionarMembro(estudante2);
        escola.adicionarMembro(pessoa2);

        escola.exibirRelatorio();
    }
}
