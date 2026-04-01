package Aplicacoes.orientacaoAObjeto;

public class Pessoa {
    protected String name;
    protected int idade;

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    // Getters e Setters

    public String getName(){
        return name;
    }

    public int getIdade(){
        return idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
