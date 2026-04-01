package Aplicacoes.orientacaoAObjeto;

public class Studante extends Pessoa {
    private String serie;

    public Studante(String name, int idade, String serie) {
        super(name, idade);
        this.serie = serie;
    }

    public String getSerie(){
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
