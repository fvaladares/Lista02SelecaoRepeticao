public class ExercicioPreDesafio {

    public void executar() {
        int maxI = 10;
        int maxJ = 10;
        //todo(Alterar o algoritmo para exibir as coordenadas de cada ponto no formato [i,j] (espaço).
        for (int i = 0; i < maxI; i++) {
            for (int j = 0; j < maxJ; j++) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }
}
