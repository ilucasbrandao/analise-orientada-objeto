package estrutural;
public class Medico {
    private String nome;
    private String especialidades;

    public Medico(String nome, String especialidades){
        this.nome = nome;
        this.especialidades = especialidades;
    }

    // Getters e Setters

    public String getNome(){
        return nome;
    }

    public String getEspecialidades(){
        return especialidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    // Métodos para realizar a consulta
    public void realizarConsulta(Paciente paciente){
        System.out.println("O médico " + this.nome +
                " realizou uma consulta do paciente: " +
                paciente.getNome());
    }
}
