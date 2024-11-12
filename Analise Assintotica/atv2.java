package aula2510;

import java.util.Random;
import java.util.Scanner;

public class atv2 {

    //O algoritimo tem complexidade linear ao tamanho do vetor
    public static int[] maiorMenor(int n[]) {
        int maior1 = 0, maior2 = 0, maior3 = 0;

        for (int i = 0; i < n.length; i++) {
            if (maior1 < n[i]) {
                maior3 = maior2;
                maior2 = maior1;
                maior1 = n[i];

            } else if (maior2 < n[i]) {
                maior3 = maior2;
                maior2 = n[i];
            } else if (maior3 < n[i]) {
                maior3 = n[i];
            }
        }

        return new int[] { maior1, maior2, maior3 };
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

                if (n[i] < 0) {
                    n[i] = n[i] * -1;
                }

                System.out.println(n[i]);
            }

            int[] r = maiorMenor(n);
            System.out.println("Maior número do vetor: " + r[0]);
            System.out.println("Segundo maior número do vetor: " + r[1]);
            System.out.println("Terceiro maior número do vetor: " + r[2]);

        } catch (Exception e) {
            System.out.println("Erro: " + e);
            main(args);
        }

        scanner.close();
    }
}