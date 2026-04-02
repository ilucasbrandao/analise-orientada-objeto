package unidade02.modelagem;

public class Candidato {
    protected String nome;
    protected String cpf;

    public Candidato(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void apresentarPedidoAceitacao(){
        System.out.println("O candidato " + this.nome + " submeteu um pedido de aceitação.");

        // REGRA DE NEGOCIO
        if(this.cpf != null && !this.cpf.isEmpty()) {
            System.out.println("Candidato: " + this.nome + " foi aprovado.");
        } else {
            System.err.println("REJEIÇÃO: Candidato com dados incompletos.");
        }
    }
}
