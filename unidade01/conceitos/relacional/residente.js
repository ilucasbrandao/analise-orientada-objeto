import { Funcionario } from "./funcionarios.js";

export class Resident extends Funcionario {
  #especialidade;

  constructor(nome, idade, cargo, especialidade) {
    super(nome, idade, cargo);
    this.#especialidade = especialidade;
  }

  realizar_procedimento() {
    console.log(
      `O residente ${this.getNome()} está realizando um procedimento de ${this.#especialidade}.`,
    );
  }
}
