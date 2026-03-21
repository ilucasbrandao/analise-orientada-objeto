import { Pessoa } from "./pessoa.js";

export class Paciente extends Pessoa {
  #doenca;
  constructor(nome, idade, doenca) {
    super(nome, idade);
    this.#doenca = doenca;
  }

  solicitar_procedimento(medico) {
    console.log(
      `O paciente ${this.getNome()} solicitou atendimento ao ${medico.getNome()}.`,
    );
    medico.realizar_procedimento();
  }
}
