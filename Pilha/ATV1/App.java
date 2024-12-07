import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PilhaVagao p = new PilhaVagao();

        while (true) {
            System.out.println("Fale o tamanho: ");
            int tamanho = scanner.nextInt();

            if (tamanho == 0) {
                break;
            }

            

            while (true) {
                System.out.println("Escolha as opções: ");
                int opcoes = scanner.nextInt();

                if (opcoes == 0) {
                    break;
                }

                String op = String.valueOf(opcoes);

                int[] verifica = new int[tamanho];   
                for (int i = 0; i < tamanho; i++) {
                    verifica[i] = Character.getNumericValue(op.charAt(i));   
                }

                if (p.pode(tamanho, verifica)) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Não");
                }
            }
        }
        scanner.close();
    }
}
