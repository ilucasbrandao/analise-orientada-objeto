import { Paciente } from "./paciente.js";
import { Medico } from "./medico.js";

const paciente1 = new Paciente("Lucas", 28);
const medico1 = new Medico("Dr. Silva", "Cardiologia");
const paciente2 = new Paciente("Julianne", 27);
const medico2 = new Medico("Dr(a): Maria", "Ginecologista");

// Fazendo eles conversarem:
paciente1.solicitar_consulta(medico1);
medico1.finalizar_consulta();
paciente2.solicitar_consulta(medico1);
