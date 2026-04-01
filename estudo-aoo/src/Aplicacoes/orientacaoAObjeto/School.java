package Aplicacoes.orientacaoAObjeto;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String nomeEscola;
    private List<Pessoa> membros;

    public School(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.membros = new ArrayList<>();
    }

    // Metodo para adicionar qualquer pessoa (ou estudante) à escola
    public void adicionarMembro(Pessoa pessoa) {
        membros.add(pessoa);
    }


    // Metodo para adicionar qualquer pessoa (ou estudante) à escola
    public void exibirRelatorio() {
        System.out.println("--- Relatório da Escola: " + nomeEscola + " ---");
        int qtdAluno = 0;
        int qtdFuncionario = 0;

        for (Pessoa p : membros) {
            System.out.print("Nome: " + p.getName() + " | idade: " + p.getIdade());

            if (p instanceof Studante) {
                qtdAluno++;
                Studante s = (Studante) p;
                System.out.println(" | Cargo: Estudante | Série: " + s.getSerie());
            } else {
                qtdFuncionario++;
                System.out.println(" | Cargo: Funcionário/Outro");
            }
        }
        System.out.println("A quantidade de alunos é: " + qtdAluno);
        System.out.println("A quantidade de funcionários é: " + qtdFuncionario);
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
}
