package relacional;

public class Main {
    public static void main(String[] args) {

        // Criando instâncias de diferentes tipos de médicos
        Medico medico0 = new Medico("Dr. José", 42, "Cirurgião", "Cirurgião Geral");
        Medico medico1 = new Anestesista("Dr. Ana", 30, "Anestesista", "Aplicações");
        Medico medico2 = new Obstetra("Dr. Carlos", 55, "Obstetra", "Verificar situação");
        Medico medico3 = new Pediatra("Dr. Pedro", 42, "Pediatra", "Pediatria");

        Paciente paciente1 = new Paciente("João", 25, "Gripe");

        paciente1.solicitarProcedimento(medico0);
        paciente1.solicitarProcedimento(medico1);
        paciente1.solicitarProcedimento(medico2);
        paciente1.solicitarProcedimento(medico3);

        // Chamando o método realizarAcaoEspecifica de cada médico
        medico1.realizarProcedimento();
        medico2.realizarProcedimento();
        medico3.realizarProcedimento();
    }
}