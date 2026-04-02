package unidade02.modelagem;

public class Socio extends Candidato {
    private int numeroCartao;
    protected double saldoDevedor;
    private int totalDependente;
    private double transacao;

    public Socio(String nome, String cpf, int numeroCartao, double saldoDevedor) {
        super(nome, cpf);
        this.numeroCartao = numeroCartao;
        this.saldoDevedor = saldoDevedor;
        totalDependente = 0;
    }

    public void quitarMensalidade(double valorPago) {
        if (valorPago > 0) {
            transacao = valorPago - saldoDevedor;
            this.saldoDevedor = transacao;
            System.out.println("Pagamento realizado! Novo saldo: R$ "+ saldoDevedor);

            // Inclusão (Include)
            registrarMovimento("Pagamento Mensalidade:", valorPago);
        } else {
            System.err.println("Erro: Valor de pagamento inválido.");
        }
    }

    public void registrarMovimento(String tipo, double valorPago) {
        System.out.println("LOG: " + tipo + "de R$ " + valorPago + " registrado no sistema.");
    }

    public void adicionarDependente(String nome, String cpf, String tipo, double valor){
        this.saldoDevedor += valor;
        totalDependente++;
        System.out.println("Dependente: " + nome + " cadastrado com sucesso.");
    }

    public void status() {
        System.out.println("--- DADOS DO SOCIO: ---");
        System.out.println(nome + " || " + cpf + " || " + numeroCartao + " || " + saldoDevedor + " || " + totalDependente);
    }
}


