import { Funcionario } from "./funcionarios.js";

export class Medico extends Funcionario {
  #especialidade;

  constructor(nome, idade, cargo, especialidade) {
    super(nome, idade, cargo);
    this.#especialidade = especialidade;
  }

  realizar_procedimento() {
    console.log(`${this.getNome()} Realizando um procedimento genérico...`);
  }
}

// Subclasse Anestesista
export class Anestesista extends Medico {
  realizar_procedimento() {
    console.log(`Aplicação de uma injeção anastésica por ${this.getNome()}`);
  }
}

// Subclasse Obstetra
export class Obstetra extends Medico {
  realizar_procedimento() {
    console.log(
      `${this.getNome()} Preparando e retirando o bebê durante o parto por ${this.getNome()}`,
    );
  }
}
