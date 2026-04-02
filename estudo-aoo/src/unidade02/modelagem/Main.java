package unidade02.modelagem;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE CONTROLE CLUBE SOCIAL ---");

        Socio socio1 = new Socio("Lucas Brandao", "123.456.789-00", 456487, 540);

        socio1.status();
        socio1.apresentarPedidoAceitacao();

        // Simulação de Extensão (O sócio decide adicionar dependente)
        socio1.adicionarDependente("Sophia Luz", "555.554.235-89", "Filha", 400);

        socio1.status();

        // Chamando o processo de pagamento
        realizarProcessoPagamento(socio1, 950);

        // Se quiser atualizar o saldo devedor de fato, chame:
        // socio1.quitarMensalidade(950);
    }

    public static void realizarProcessoPagamento(Socio s, double valor) {
        // Validação (Regra de Negócio/Fluxo de Exceção)
        if(valor < s.saldoDevedor){
            System.err.println("Erro: valor insuficiente.");
        }
        else {
            // Fluxo Principal
            System.out.println("Processando pagamento do sócio: " + s.nome);
            System.out.println("Sucesso! Recibo emitido no valor de R$ " + valor);
        }
    }
}

/*

Encapsulamento: Você protegeu os dados sensíveis (como numeroCartao e totalDependente) usando private.

Herança (Generalização): Socio e Dependente herdam de Candidato, reaproveitando os atributos nome e cpf.

Casos de Uso Comportamentais: O metodo apresentarPedidoAceitacao contém a lógica de decisão (aprovado ou rejeitado).

Associação de Inclusão (<<include>>): O metodo quitarMensalidade inclui obrigatoriamente o registrarMovimento.

Associação de Extensão (<<extend>>): O metodo adicionarDependente funciona como uma extensão opcional que altera o estado do sócio (aumenta o saldo devedor).

Modificadores de Acesso: Você usou protected corretamente para permitir que as classes filhas acessem os dados básicos da classe pai.

*/