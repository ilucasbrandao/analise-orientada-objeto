package estrutural;
public class Paciente {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Paciente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return      idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void solicitarConsulta(Medico medico){
        System.out.println("Paciente: " +
                this.getNome() + " solicitou uma consulta com " +
                medico.getNome());
        medico.realizarConsulta(this);
    }
}
