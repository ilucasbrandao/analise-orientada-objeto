class Autor {
  constructor(nome, nacionalidade) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
  }
}

class Livro {
  constructor(titulo, autor, n_paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.n_paginas = n_paginas;
  }
}

class Cliente {
  constructor(nome, endereco) {
    this.nome = nome;
    this.endereco = endereco;
  }
}

class Biblioteca {
  constructor(livro, cliente) {
    this.livro = livro;
    this.cliente = cliente;
  }

  exibir_infos() {
    console.log(`Livro: ${this.livro.titulo}`);
    console.log(`Autor: ${this.livro.autor.nome}`);
    console.log(`Nacionalidade do autor: ${this.livro.autor.nacionalidade}`);
    console.log(`Número de páginas do livro: ${this.livro.n_paginas}`);
    console.log(`Cliente: ${this.cliente.nome}`);
    console.log(`Endereço do cliente: ${this.cliente.endereco}`);
  }
}

const autor = new Autor("Julio Verne", "França");
const livro = new Livro("Viagem ao centro da terra", autor, 350);
const cliente = new Cliente("Lucas de Sousa Brandão", "Itapipoca/CE");
const biblioteca = new Biblioteca(livro, cliente);
biblioteca.exibir_infos();
