export class Medico {
  #nome;
  #especialidade;

  constructor(nome, especialidade) {
    this.#nome = nome;
    this.#especialidade = especialidade;
    this.atendendo = false;
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
    if (this.atendendo) {
      console.log(
        `${this.getNome()} já está em atendimento. Aguarde, ${paciente.getNome()}.`,
      );
      return;
    }

    this.atendendo = true;
    console.log(`Atendimento iniciado para o paciente: ${paciente.getNome()}.`);
  }

  finalizar_consulta() {
    if (!this.atendendo) {
      console.log("O médico não está em consulta no momento.");
      return;
    }
    this.atendendo = false;
    console.log(`Consulta com finalizada com sucesso.`);
  }
}
