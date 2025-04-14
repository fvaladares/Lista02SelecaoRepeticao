import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int controle = -1; // Variável de controle
        // Variável do tipo Scanner
        // utilizada para fazer a leitura dos
        // dados a partir do teclado.
        Scanner entrada = new Scanner(System.in);

//      Criando um menu para executar
//      a atividade solicitada
        do {
            System.out.println("Lista de exercícios 2 - PSC - FASEH"); // Mosta "texto" na tela
            System.out.println("Escolha abaixo o exercício que deseja executar."); // Mosta "texto" na tela
            System.out.println("\t1. Criar menu");
            System.out.println("\t2. A + B < C?");
            System.out.println("\t3. Número par ou ímpar?");
            System.out.print("Informe qual a opção desejada (-1 para sair):\\> ");
            controle = entrada.nextInt(); // Faz a leitura de um número inteiro

            switch (controle) {
                case -1:
                    System.out.println("Tem certeza que deseja sair?");
                    System.out.println("(S)im; (N)ão" );
                    String confirmacao;
                    // Le uma string e pega a primeira posição.
                    confirmacao = entrada.next();

                    if (confirmacao.equalsIgnoreCase("S")) {
                        System.out.println("Programa encerrado");
                        return;
                    } else {
                        System.out.println("Retornando...\n");
                        controle = 99;
                    }
                    break;

                case 1:
                    break;

                case 2:
                    System.out.println("Executando a atividade 2");
                    Exercicio2 exercicio2 = new Exercicio2(entrada);
                    exercicio2.executar();
                    break;

                case 3:
                    break;

                default:
                    break;
            }

        } while (controle != -1);
    }
}