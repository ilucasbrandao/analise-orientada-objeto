// 1. A INTERFACE (O Contrato - BP10)
// Define um comportamento que QUALQUER classe pode ter
interface Plantonista {
    void realizarPlantao(); // Método abstrato (sem corpo)
}

// 2. A CLASSE ABSTRATA (O Molde - Conceito Estrutural)
// Define o que todos os funcionários TÊM em comum
abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método Comum (Reúso de código)
    public void exibirDados() {
        System.out.println("Funcionário: " + nome + " | Salário: R$ " + calcularSalario());
    }

    // Método Abstrato (Obrigatório as subclasses implementarem - Polimorfismo)
    public abstract double calcularSalario();
}

// 3. SUBCLASSES (Especialização - Conceito Relacional)

// Médico É UM Funcionário e FAZ Plantão
class Medico extends Funcionario implements Plantonista {
    public Medico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + 2000; // Bónus de especialidade
    }

    @Override
    public void realizarPlantao() {
        System.out.println(nome + " está de plantão na Emergência.");
    }
}

// Administrativo É UM Funcionário, mas NÃO faz plantão
class Administrativo extends Funcionario {
    public Administrativo(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase; // Salário seco
    }
}

class Enfermeiro extends Funcionario implements Plantonista {
    public Enfermeiro(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return this.salarioBase + 500;
    }
    @Override
    public void realizarPlantao(){
        System.out.println(nome + " está de plantão.");
    }
}

// 4. CLASSE PRINCIPAL (Execução)
public class SistemaHospitalar {
    public static void main(String[] args) {
        // Criando os objetos (Instanciação)
        Medico med = new Medico("Dr. Arnaldo", 5000);
        Administrativo adm = new Administrativo("Carla RH", 3000);
        Enfermeiro enfer = new Enfermeiro("Ana Alves", 2800);

        System.out.println("--- Relatório de Funcionários ---");
        med.exibirDados();
        adm.exibirDados();
        enfer.exibirDados();

        System.out.println("\n--- Ações de Hoje ---");
        med.realizarPlantao();
        enfer.realizarPlantao();
        // adm.realizarPlantao(); // Se tentares isto, o Java dará erro (Segurança do código!)
    }
}