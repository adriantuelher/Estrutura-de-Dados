import java.util.Scanner;

public class Lista {
    private No cabeca = new No();
    private No cauda = cabeca;
    private int tamanho = 0;

    public void addOrdenado(Cidade cidade) {
        No elemento = new No(cidade, null, null);

        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            No el = cabeca.proximo;
            while (el != null && el.elemento.nota > cidade.nota) {
                el = el.proximo;
            }

            if (el == null) {
                cauda.proximo = elemento;
                elemento.anterior = cauda;
                cauda = elemento;
            } else if (el == cabeca.proximo) {
                elemento.proximo = cabeca.proximo;
                cabeca.proximo.anterior = elemento;
                cabeca.proximo = elemento;
            } else {
                elemento.proximo = el;
                elemento.anterior = el.anterior;
                el.anterior.proximo = elemento;
                el.anterior = elemento;
            }
        }
        tamanho++;
    }

    public void remove(String cidade) throws Exception {
        No el = cabeca.proximo;

        while (el != null) {
            if (el.elemento.nome.equals(cidade) || el.elemento.pais.equals(cidade)) {
                if (el == cabeca.proximo) {
                    removeInicio();
                } else if (el == cauda) {
                    removeFim();
                } else {
                    el.anterior.proximo = el.proximo;
                    el.proximo.anterior = el.anterior;
                    tamanho--;
                }
                return;
            }
            el = el.proximo;
        }
        throw new Exception("Elemento não encontrado.");
    }

    public void removeInicio() throws Exception {
        if (tamanho == 0)
            throw new Exception("Lista vazia.");
        cabeca.proximo = cabeca.proximo.proximo;
        if (cabeca.proximo != null) {
            cabeca.proximo.anterior = cabeca;
        } else {
            cauda = cabeca;
        }
        tamanho--;
    }

    public void removeFim() throws Exception {
        if (tamanho == 0)
            throw new Exception("Lista vazia.");
        if (tamanho == 1) {
            removeInicio();
        } else {
            No el = cauda.anterior;
            el.proximo = null;
            cauda = el;
            tamanho--;
        }
    }

    public void printDecrescente() throws Exception {
        Scanner scanner = new Scanner(System.in);
        No atual = cauda;

        if (atual == cabeca) {
            System.out.println("A lista está vazia.");
            return;
        }

        while (true) {
            if (atual == null || atual.elemento == null) {
                System.out.println("Fim da lista.");
                return;
            }

            System.out.println("Cidade atual:");
            System.out.println("Nome: " + atual.elemento.nome);
            System.out.println("País: " + atual.elemento.pais);
            System.out.println("Atrativos: " + atual.elemento.atrativos);
            System.out.println("Nota: " + atual.elemento.nota);
            System.out.println("------------------------------");

            System.out.println("1 - Próxima");
            System.out.println("2 - Anterior");
            System.out.println("3 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            int escolha;
            while (true) {
                if (scanner.hasNextInt()) {
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Entrada inválida! Digite 1, 2 ou 3.");
                    scanner.nextLine();
                }
            }

            switch (escolha) {
                case 1:
                    if (atual.anterior != null && atual.anterior != cabeca) {
                        atual = atual.anterior;
                    } else {
                        System.out.println("Você está na última cidade.");
                    }
                    break;

                case 2:
                    if (atual.proximo != null) {
                        atual = atual.proximo;
                    } else {
                        System.out.println("Você está na primeira cidade.");
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

}
