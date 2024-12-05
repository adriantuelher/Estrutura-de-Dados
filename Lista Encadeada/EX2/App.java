import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1 - Inserir novo cliente");
            System.out.println("2 - Exibir lista em ordem crescente");
            System.out.println("3 - Exibir lista em ordem decrescente");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  
            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefone = scanner.nextLine();
                    
                    
                    Cliente cliente = new Cliente(nome, telefone);
                    lista.addOrdenado(cliente);
                    System.out.println("Cliente inserido com sucesso!");
                    break;

                case 2:
                    
                    System.out.println("Lista de clientes em ordem crescente:");
                    lista.printCrescente();
                    break;

                case 3:
                    
                    System.out.println("Lista de clientes em ordem decrescente:");
                    lista.printDecrescente();
                    break;

                case 4:
                    
                    System.out.println("Saindo");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
