public class Vendedor extends Funcionario {

    private double comissao;

    private int numeroVendas;



    public Vendedor(String nome, String cpf, double comissao, int numeroVendas) {

        super(nome, cpf); 
        
        this.comissao = comissao;

        this.numeroVendas = numeroVendas;
        
    }

    @Override

    public double calcularSalario() {
        return SALARIO_MINIMO + (comissao * numeroVendas);
    }


    public double getComissao() {
        return comissao;
    }


    public int getNumeroVendas() {
        return numeroVendas;
    }





}