package estrutural;
public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. Adriano", "Médico Geral");
        Paciente paciente = new Paciente("Maria Julia", 19);

        paciente.solicitarConsulta(medico);
    }
}