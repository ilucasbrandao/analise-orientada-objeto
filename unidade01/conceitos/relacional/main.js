import { Medico, Anestesista, Obstetra } from "./medico.js";
import { Resident } from "./residente.js";
import { Paciente } from "./paciente.js";

let paciente = new Paciente("Maria", 28, "Entrando em trabalho de parto");
let medico = new Medico("Dr. José", 45, "Médico", "Cardiologia");
let anestesista = new Anestesista("Dra. Ana", 38, "Anestesista", "Anestesia");
let obstetra = new Obstetra("Dr. Carlos", 50, "Obstetra", "Obstetrícia");
let residente = new Resident("Dr. Lucas", 30, "Residente", "Pediatria");
paciente.solicitar_procedimento(medico); // O paciente Maria solicitou atendimento. Dr. José Realizando um procedimento genérico...
anestesista.realizar_procedimento(); // Aplicação de uma injeção anastésica por Dra. Ana
obstetra.realizar_procedimento(); // Dr. Carlos Preparando e retirando o bebê durante o parto por Dr. Carlos
residente.realizar_procedimento(); // O residente Dr. Lucas está realizando um procedimento de Pediatria.
