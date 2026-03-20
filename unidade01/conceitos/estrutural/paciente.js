export class Paciente {
  #nome;
  #idade;
  constructor(nome, idade) {
    this.#nome = nome;
    this.#idade = idade;
  }

  getNome() {
    return this.#nome;
  }

  getIdade() {
    return this.#idade;
  }

  setNome(nome) {
    this.#nome = nome;
    return this.nome;
  }

  setIdade(idade) {
    this.#idade = idade;
    return this.#idade;
  }

  solicitar_consulta(medico) {
    if (!medico) {
      throw Error("Médico não localizado.");
    }
    console.log(
      `O paciente: ${this.#nome} solicitou uma consulta com o médico: ${medico.getNome()}`,
    );
  }
}
