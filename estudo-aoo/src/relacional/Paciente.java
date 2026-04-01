package relacional;

public class Paciente extends Pessoa {
    private String doenca;

    // Constructor
    public Paciente(String nome, int idade, String doenca){
        super(nome, idade);
        this.doenca = doenca;
    }

    // Getters e Setters
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return super.getIdade();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void solicitarProcedimento(Medico medico) {
        System.out.println("O paciente " + this.nome + " solicitou um procedimento ao médico " + medico.getNome());
        medico.realizarProcedimento();
    }
}
