import { Pessoa } from "./pessoa.js";

export class Funcionario extends Pessoa {
  #cargo;
  constructor(nome, idade, cargo) {
    super(nome, idade);
    this.#cargo = cargo;
  }
}
