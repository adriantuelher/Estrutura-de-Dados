import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        String nome, pais, atrativos, exclue;
        int nota, opcao;

        while (true) {
            System.out.println("MENU:");
            System.out.println("1 - Inserir nova cidade");
            System.out.println("2 - Exibir lista em ordem decrescente");
            System.out.println("3 - Excluir cidade");
            System.out.println("4 - Sair");
            while (true) {
                System.out.print("Escolha uma opção: ");
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
                    break;
                } else {
                    System.out.println("Entrada inválida! Digite um número entre 1 e 5.");
                    scanner.nextLine(); 
                }
            }

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da cidade: ");
                        nome = scanner.nextLine();
                        System.out.print("Digite o país da cidade: ");
                        pais = scanner.nextLine();
                        System.out.print("Digite os atrativos da cidade: ");
                        atrativos = scanner.nextLine();

                        // Validação da nota
                        while (true) {
                            System.out.print("Digite a nota da cidade (0 a 10): ");
                            if (scanner.hasNextInt()) {
                                nota = scanner.nextInt();
                                scanner.nextLine();
                                if (nota >= 0 && nota <= 10) {
                                    break;
                                } else {
                                    System.out.println("Nota inválida! Insira um valor entre 0 e 10.");
                                }
                            } else {
                                System.out.println("Entrada inválida! Digite um número entre 0 e 10.");
                                scanner.nextLine(); 
                            }
                        }

                        Cidade cidade = new Cidade(nome, pais, atrativos, nota);
                        lista.addOrdenado(cidade);
                        System.out.println("Cidade adicionada com sucesso!");
                        break;

                    case 2:
                        System.out.println("Lista de cidades em ordem crescente:");
                        lista.printDecrescente();
                        break;

                    case 3:
                        System.out.print("Digite o nome ou país da cidade a ser excluída: ");
                        exclue = scanner.nextLine();
                        lista.remove(exclue);
                        System.out.println("Cidade removida com sucesso!");
                        break;

                    case 4:
                        System.out.println("Tchau!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
