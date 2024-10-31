package aula2510;

import java.util.Scanner;

public class atv3 {
    public static boolean estaAqui(int[] n, int a) {
        int metade = (n.length - 1) / 2;

        /*while (inicio <= fim) {

            if (n[metade] == a) {
                return true;

            } else if (n[metade] > a) {
                inicio = metade + 1;

            } else {
                fim = metade - 1;
            }
        }*/

        for (int i = 0; i < n.length; i++) {

            if (n[metade] == a) {
                metade = a;
                return true;

            } else if (n[metade] > a) {
                metade = (metade / 2) - metade;

            } else if (a <= n.length && n[metade] < a) {
                metade = (metade / 2) + metade;
                System.out.println(metade);
            } else {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        try {
            int a;
            int[] n = { 1, 2, 3, 4, 5, 6, 7 };

            System.out.println("Escolha um número: ");
            a = s.nextInt();

            if (estaAqui(n, a)) {
                System.out.println("O número que você escolheu está no vetor");
            } else {
                System.out.println("O número que você escolheu não está no vetor");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            main(args);
        }

        s.close();
    }
}