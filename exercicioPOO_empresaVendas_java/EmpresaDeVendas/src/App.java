import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // A lista é do tipo da superclasse: aceita qualquer subclasse

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Vendedor("Ana Luiza", "438.271.605-19", 150.00, 12));
        funcionarios.add(new Consultor("Luisa Franzoni", "702.583.146-27", 80.00, 120));
        funcionarios.add(new Gerente("Lucas Franzoni", "159.846.320-58", 2500.00));




        // Controle de ponto: cada registro guarda o funcionário, a entrada e a saída

        List<RegistroPonto> registros = new ArrayList<>();

        registros.add(new RegistroPonto(funcionarios.get(0),
                LocalDateTime.of(2026, 10, 26, 8, 0),
                LocalDateTime.of(2026, 10, 26, 17, 30)));

        registros.add(new RegistroPonto(funcionarios.get(1),
                LocalDateTime.of(2026, 10, 26, 9, 0),
                LocalDateTime.of(2026, 10, 26, 18, 0)));

        System.out.println("Folha de pagamento: ");

        for (Funcionario f : funcionarios) {

            System.out.printf("%s | %s | R$ %.2f%n",
                    f.getNome(),
                    f.getClass().getSimpleName(),
                    f.calcularSalario());

            if (f instanceof Vendedor) {

                Vendedor v = (Vendedor) f;
                System.out.println("vendas realizadas: " + v.getNumeroVendas());

            }

            for (RegistroPonto r : registros) {

                if (r.getFuncionario() == f) {

                    System.out.println("ponto: " + r.getEntrada()
                            + " ---> " + r.getSaida());

                }


            }
        }
    }
}