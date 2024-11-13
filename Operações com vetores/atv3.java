
import java.util.Scanner;

public class atv3 {

    public static void print(String opcao, String[] n, int ultimaP) {
        switch (opcao) {
            case "2":
                if (ultimaP == 0) {
                    System.out.println("Nenhum convidado cadastrado");
                } else {
                    for (int i = 0; i < ultimaP; i++) {
                        System.out.println((i + 1) + "° Convidado: " + n[i]);
                    }
                }
                break;

            case "4":

                if ((n.length - ultimaP) == 0) {
                    System.out.println("Não há vagas disponiveis!");

                } else {
                    System.out.println("Restam " + (ultimaP - n.length) * -1 + " vagas");

                }
                break;

            default:
                System.out.println("Erro ao chamar o metodo");
                break;
        }

    }

    public static void excluir(String[] nome, int convidado, int ultimaP) {
        if (convidado > 0 && convidado <= ultimaP) {
            for (int i = convidado - 1; i < ultimaP - 1; i++) {
                nome[i] = nome[i + 1];
            }
            nome[ultimaP - 1] = null;
            System.out.println("Convidado excluído!");
        } else {
            System.out.println("Número inválido!");
        }
    }

    public static void main(String[] args) {
        String nome[] = new String[10];
        int ultimaP = 0;
        String opcao;

        try {
            Scanner sc = new Scanner(System.in);

            for (int i = 1; i > 0;) {
                System.out.println("\nEscolha uma opção: ");
                System.out.println("1- Cadastrar um convidado");
                System.out.println("2- Exibir lista de convidados");
                System.out.println("3- Excluir convidado");
                System.out.println("4- Exibir vagas restantes");
                System.out.println("0- Sair");
                opcao = sc.nextLine();

                switch (opcao) {
                    case "0":
                        i = 0;
                        System.out.println("Valeu!!");
                        break;

                    case "1":
                        if (ultimaP < 10) {
                            System.out.println("Informe o nome do convidado");
                            nome[ultimaP] = sc.nextLine();
                            ++ultimaP;
                            System.out.println("Convidado cadastrado!");
                        } else {
                            System.out.println("A vagas foram preenchidas!");
                        }
                        break;

                    case "2":
                        print(opcao, nome, ultimaP);
                        break;

                    case "3":
                        print("2", nome, ultimaP);
                        System.out.println("Qual convidado você quer exluir?");
                        int convidado = sc.nextInt();
                        sc.nextLine();
                        excluir(nome, convidado, ultimaP);
                        --ultimaP;

                        break;

                    case "4":
                        print(opcao, nome, ultimaP);
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