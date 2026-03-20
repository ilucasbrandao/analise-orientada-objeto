import { Paciente } from "./paciente.js";

export class Medico {
  #nome;
  #especialidade;

  constructor(nome, especialidade) {
    this.#nome = nome;
    this.#especialidade = especialidade;
  }

  getNome() {
    return this.#nome;
  }

  getEspecialidade() {
    return this.#especialidade;
  }

  setNome(nome) {
    this.#nome = nome;
    return this.#nome;
  }

  setEspecialidade(especialidade) {
    this.#especialidade = especialidade;
    return this.#especialidade;
  }

  realizar_consulta(paciente) {
    console.log(`Atendimento aberto para o paciente: ${paciente.getNome()}`);
  }
}
