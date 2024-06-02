package Testes;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "PAULO" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 3 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            else {
                System.out.println("O Candidato " + candidato + " nao foi selecionado para a vaga");
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analiseCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println( salarioPretendido + "  - LIGAR PARA CANDIDATO");
        }
        else if (salarioBase == salarioPretendido) {
            System.err.println(salarioPretendido + " - LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");
        }
        else {
            System.err.println( salarioPretendido + " - AGUARDANDO RESULTADO DE DEMAIS CANDIDATOS");
        }
        
    };
}
