import java.time.LocalDateTime;

public class RegistroPonto {


    private final Funcionario funcionario;

    private final LocalDateTime entrada;

    private final LocalDateTime saida;



    public RegistroPonto(Funcionario funcionario, LocalDateTime entrada, LocalDateTime saida) {

        this.funcionario = funcionario;
        this.entrada = entrada;
        this.saida = saida;

    }




    public Funcionario getFuncionario() {
        return funcionario;

        
    }


    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {

        return saida;
    }



}