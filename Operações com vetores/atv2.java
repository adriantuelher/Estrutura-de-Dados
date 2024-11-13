import java.util.Random;

public class atv2 {
    static int ultimaP = 0;
    static int n[] = new int[100];

    public static void opcoes(int opcao, int numero) {
        int j = n.length - 1;

        switch (opcao) {
            case 1:
                System.out.print("opcao 1 ");
                while (j != 0) {
                    n[j] = n[j - 1];
                    j--;
                }
                n[0] = numero;
                ultimaP++;

                break;

            case 2:
                System.out.print("opcao 2 ");
                n[ultimaP] = numero;
                ultimaP++;

                break;

            case 3:
                System.out.print("opcao 3 ");
                for (int i = ultimaP; i == ultimaP; ultimaP++) {
                    n[i] = n[i - 1];
                    n[i - 1] = numero;
                }

                break;
        }
    }

    public static void main(String[] args) {

        try {
            Random r = new Random();
            int opcao, numero;

            for (int i = 0; i < 100; i++) {
                opcao = r.nextInt(3) + 1;
                numero = r.nextInt(100);
                opcoes(opcao, numero);

                System.out.print(" ");
            }

            System.out.println("\n");
            System.out.println("Vetor final: ");

            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}