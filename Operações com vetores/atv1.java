import java.util.Arrays;
import java.util.Random;

public class atv1 {

    public static int[] semPar(int n[]) {
        int contador = 0;
        for (int i = 0; i < n.length; i++) {
            //verifica se é impar, se não for, apenas ignora o atual número
            //ao ignorar, o i recebe um valor a mais e o contador continua com o mesmo valor
            //quando o número for impar novamente, ele será morvido para a posição do par
            //fazendo assim, evita que o vetor seja estourado com um n[i] = n[i + 1]
            if (n[i] % 2 != 0) {  
                n[contador] = n[i];  
                contador++;  
            }
        }

        //ja aqui, o i recebe o valor do contador, que mostra o ultimo impar
        //e a partir dessa posição, substitui todos os outros por 0
        for(int i = contador; i < n.length; i++){
            n[i] = 0;
        }

        return n;
    }

    public static void main(String[] args) {

        try {
            Random r = new Random();
            int n[] = new int[10];

            for (int i = 0; i < 10; i++) {
                n[i] = r.nextInt(10);
                System.out.print(n[i] + " ");
            }

            System.out.println("Sem par: " + Arrays.toString(semPar(n)));

        } catch (Exception e) {
            System.out.println("Erro: " + e);
            main(args);
        }
    }
}