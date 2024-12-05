import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Remover veículo por placa");
            System.out.println("3. Imprimir todos os veículos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Digite a marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    lista.addFim(new Veiculo(placa, marca, modelo, valor));
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a placa do veículo a ser removido: ");
                    String placaRemover = scanner.nextLine();
                    lista.removerPorPlaca(placaRemover);
                    break;

                case 3:
                    lista.imprimir();
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
