public abstract class Funcionario { //coloquei abstract para não existir funcionário genérico e não criar "Funcionario" solto...


    protected static final double SALARIO_MINIMO = 1621.00;

    private String nome;

    private String cpf;


    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }



    
    public abstract double calcularSalario();





    // Getters

    public String getNome() {

        return nome;

    }

    public String getCpf() {

        return cpf;

    }



}