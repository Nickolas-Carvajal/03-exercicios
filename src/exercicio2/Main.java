package exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        double[] alvo;
        System.out.println("Nome --> ");
        paciente.nome = sc.next();
        System.out.println("Idade --> ");
        paciente.idade = sc.nextInt();

        System.out.println("Frequência Máxima: " + paciente.frequenciaMaxima());
        alvo= paciente.frequenciaAlvo();
        //double[] aux = paciente.frequenciaAlvo();
        //String vetor = Arrays.toString(aux);
        System.out.println("Início da frequência Alvo: " + alvo[0]);
        System.out.println("Fim da frequência Alvo: " + alvo[1]);
    }
}
