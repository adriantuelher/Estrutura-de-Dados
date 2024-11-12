
import java.util.Random;

public class atv5 {

    public static void imprime(int n[]) {
        int vaiImprimir = -1;
        boolean imprimiu[] = new boolean[n.length];
        System.out.println("\n");

        //a cada vez que o sistema entra em um n[i]
        //ele verfifica todo o vetor procurando o menor número
        for (int i = 0; i < n.length; i++) {
            //para isso toda vez ele inicializa a variavel menor
            //com um valor muito grande, para que seja obrigado a entrar
            //no if no n[0], e assim verificar todos os elementos
            //e evitar que o menor número sempre seja impresso
            //A variavel vaiImprimir armazena a posição do número impresso
            //evitando tambem de ser o mesmo a entrar no if toda vez

            int menor = 10000;
            for (int j = 0; j < n.length; j++) {
                if (!imprimiu[j] && n[j] < menor) {
                    menor = n[j];
                    vaiImprimir = j;
                }
            }

            imprimiu[vaiImprimir] = true;
            System.out.println(i + 1 + "° menor número do vetor: " + menor);
        }
    }

    public static void main(String[] args) {

        try {
            Random r = new Random();
            int n[] = new int[10];

            for (int i = 0; i < 10; i++) {
                n[i] = r.nextInt(1000);
                System.out.print(n[i] + " ");
            }

            imprime(n);

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
