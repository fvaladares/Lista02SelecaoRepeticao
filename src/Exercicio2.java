import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    private double numeroA;
    private double numeroB;
    private double numeroC;
    private boolean somaMenorQueC;
    private Scanner entrada;

    // Construtor - Utilizado para inicializar o objeto
    // Recebe como parâmetro o Scanner
    public Exercicio2(Scanner entrada) {
        this.entrada = entrada;
    }

    public void executar() {
        System.out.println("Informe o número correspondente à variável A");
        numeroA = entrada.nextDouble();
        System.out.println("Informe o número correspondente à variável B");
        numeroB = entrada.nextDouble();
        System.out.println("Informe o número correspondente à variável C");
        numeroC = entrada.nextDouble();

        /*
            numeroA = 10;
            numeroB = 20;
            numeroC = 5;
            somaMenorQueC = (numeroA + numeroB) < numeroC;
            somaMenorQueC = (10 + 20) < 5
                                30    < 5 (F)
            somaMenorQueC == False
         */
        somaMenorQueC = (numeroA + numeroB) < numeroC;

        if (somaMenorQueC) {
            System.out.println("A soma de A + B é MENOR DO C");
        } else {
            System.out.println("A soma de A + B é MAIOR QUE, OU IGUAL A C.");
        }
        System.out.println();
    }
}
