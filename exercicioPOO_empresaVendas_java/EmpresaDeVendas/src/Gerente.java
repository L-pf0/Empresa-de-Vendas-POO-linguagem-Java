public class Gerente extends Funcionario {

    private double bonificacao;


    public Gerente(String nome, String cpf, double bonificacao) {

        super(nome, cpf);
        this.bonificacao = bonificacao;

    }

    @Override

    public double calcularSalario() {

        return 6 * SALARIO_MINIMO + bonificacao;

    }

    public double getBonificacao() {

        return bonificacao;
    }



}