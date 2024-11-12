
import java.util.Random;

public class atv6 {

    public static void outroVetor(int n1[], int n2[]) {
        Random r = new Random();
        int n3[] = new int[10];

        for(int i = 0; i < n1.length; i++){
            int sorte = r.nextInt(2 ) + 1;

            if ((sorte % 2) == 0) {
                n3[i] = n1[i];

            } else {
                n3[i] = n2[i];
                
            }

            System.out.print(n3[i] + " ");
        }
    }

    public static void main(String[] args) {

        try {
            Random r = new Random();
            int n1[] = new int[10];
            int n2[] = new int[10];

            for(int i = 0; i < 10; i++) {
                n1[i] = r.nextInt(1000);
                System.out.print(n1[i] + " ");
            }

            System.out.println("\n");

            for(int i = 0; i < 10; i++) {
                n2[i] = r.nextInt(10);
                System.out.print(n2[i] + " ");
            }

            System.out.println("\n");

            outroVetor(n1, n2);

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
