public class Consultor extends Funcionario {

    private double valorHora;

    private int horasTrabalhadas;



    public Consultor(String nome, String cpf, double valorHora, int horasTrabalhadas) {

        super(nome, cpf);
        this.valorHora = valorHora;

        this.horasTrabalhadas = horasTrabalhadas;

    }



    @Override

    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }


    public double getValorHora() {
        return valorHora;
    }


    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }


}