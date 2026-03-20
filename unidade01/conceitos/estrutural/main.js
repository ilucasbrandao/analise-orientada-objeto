import { Paciente } from "./paciente.js";
import { Medico } from "./medico.js";

const paciente1 = new Paciente("Lucas", 28);
const medico1 = new Medico("Dr. Silva", "Cardiologia");

// Fazendo eles conversarem:
paciente1.solicitar_consulta(medico1);
medico1.realizar_consulta(paciente1);
