import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        Carta c;
        Scanner sc = new Scanner(System.in);

        try {
            int qtdCartas = 0;
            int numCartas = 1;
            boolean t = true;

            while (t) {
                System.out.println("Quantas cartas: ");
                qtdCartas = sc.nextInt();
                if (qtdCartas >= 2 && qtdCartas <= 50) {
                    while (qtdCartas > 0) {
                        fila.enfileirar(new Carta(numCartas));
                        numCartas++;
                        qtdCartas--;
                    }

                    System.out.println("Descarte: ");
                    while (fila.tamanho > 1) {
                        c = fila.desenfileirar();
                        System.out.print(c.numero + ", ");
                        c = fila.desenfileirar();
                        fila.enfileirar(c);

                    }

                    c = fila.desenfileirar();
                    System.out.println("\nCarta restante: " + c.numero);

                    t = false;
                } else {
                    System.out.println("Informe uma quantidade maior que 2 e menor que 50!");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
