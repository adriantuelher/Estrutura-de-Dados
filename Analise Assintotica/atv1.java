package aula2510;

import java.util.Random;
import java.util.Scanner;

public class atv1 {

    //O algoritimo tem complexidade linear ao tamanho do vetor
    public static int[] maiorMenor(int n[]) {
        int maior = n[0], menor = n[0];

        for (int i = 0; i < n.length; i++) {
            if (maior < n[i]) {
                maior = n[i];

            }else if (menor > n[i]) {
                menor = n[i];

            }
        }

        return new int[] { maior, menor };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int t;
            Random random = new Random();

            System.out.println("Informe o tamanho do vetor: ");
            t = scanner.nextInt();

            int n[] = new int[t];

            for (int i = 0; i < t; i++) {
                n[i] = random.nextInt(1000);

                /*if (n[i] < 0) {
                    n[i] = n[i] * -1;
                }*/

                System.out.println(n[i]);
            }

            int[] r = maiorMenor(n);
            System.out.println("Maior número do vetor: " + r[0]);
            System.out.println("Menor número do vetor: " + r[1]);

        } catch (Exception e) {
            System.out.println("Erro: " + e);
            main(args);
        }

        scanner.close();
    }
}