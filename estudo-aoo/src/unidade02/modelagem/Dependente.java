package unidade02.modelagem;

public class Dependente extends Candidato {
    private String vinculo;
    private double valor;

    public Dependente(String nome, String cpf, String vinculo, double valor){
        super(nome, cpf);
        this.vinculo = vinculo;
        this.valor = valor;
    }
}
