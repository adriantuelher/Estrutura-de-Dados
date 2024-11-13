
import java.util.Arrays;
import java.util.Scanner;

public class atv4 {

    public static void main(String[] args) {
        int n[] = new int[10];
        int livre = n.length, numero, posicao;
        String opcao;

        try {
            Scanner sc = new Scanner(System.in);

            for (int i = 1; i > 0;) {
                System.out.println("\nEscolha uma opção: ");
                System.out.println("1- Armazenar um numero");
                System.out.println("2- Exibir lista de numeros");
                System.out.println("3- Excluir numero");
                System.out.println("0- Sair");
                opcao = sc.nextLine();

                switch (opcao) {
                    case "0":
                        i = 0;
                        System.out.println("Valeu!!");
                        break;

                    case "1":
                        if (livre > 0) {
                            System.out.println("Informe o numero: ");
                            numero = sc.nextInt();

                            System.out.println("Escolha a posição: " + Arrays.toString(n));
                            posicao = sc.nextInt();
                            sc.nextLine();

                            if (posicao > 0 && posicao < 11) {
                                if (n[posicao - 1] == 0) {
                                    n[posicao - 1] = numero;
                                    --livre;
                                    System.out.println("Numero cadastrado!");
                                } else {
                                    System.out.println("Posição ocupada!");
                                }
                            } else {
                                System.out.println("Escolha apenas dentro do vetor!");
                            }
                        } else {
                            System.out.println("O vetor foi preenchido!");
                        }
                        break;

                    case "2":
                        if (livre != n.length) {
                            System.out.println("Vetor atual: " + Arrays.toString(n));

                        } else {
                            System.out.println("O vetor está vazio!");

                        }
                        break;

                    case "3":

                        if (livre != n.length) {
                            System.out.println("Escolha uma posição para excluir: ");
                            System.out.println(Arrays.toString(n));
                            posicao = sc.nextInt();
                            sc.nextLine();

                            if (posicao > 0 && posicao < 11) {
                                if (n[posicao - 1] != 0) {
                                    n[posicao - 1] = 0;
                                    ++livre;
                                    System.out.println("Número excluído!");
                                } else {
                                    System.out.println("Não tem número para excluir!");
                                }

                            } else {
                                System.out.println("Escolha uma opção que tenha um número!");
                            }
                        } else {
                            System.out.println("O vetor está vazio!");

                        }

                        break;
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);

        }
    }
}
