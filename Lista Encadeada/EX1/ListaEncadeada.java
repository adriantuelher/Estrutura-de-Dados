public class ListaEncadeada {
    private No cabeca = new No();
    private No cauda = cabeca;
    public int tamanho = 0;

    public void addInicio(Veiculo v) {
        No elemento = new No(v, null);
        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            cabeca.proximo = elemento;
        }
        tamanho++;
    }

    public void addFim(Veiculo v) {
        if (tamanho == 0)
            addInicio(v);
        else {
            No elemento = new No(v, null);
            cauda.proximo = elemento;
            cauda = elemento;
            tamanho++;
        }
    }

    public void removerPorPlaca(String placa) {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = cabeca;
        while (atual.proximo != null) {
            if (atual.proximo.elemento.placa.equals(placa)) {
                atual.proximo = atual.proximo.proximo;
                tamanho--;
                System.out.println("Veículo com placa " + placa + " removido.");
                return;
            }
            atual = atual.proximo;
        }

        System.out.println("Veículo com placa " + placa + " não encontrado.");
    }

    public void imprimir() {
        if (tamanho == 0) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        No atual = cabeca.proximo;
        while (atual != null) {
            Veiculo v = atual.elemento;
            System.out.println("Placa: " + v.placa);
            System.out.println("Marca: " + v.marca);
            System.out.println("Modelo: " + v.modelo);
            System.out.println("Valor: R$" + v.valor);
            System.out.println("------------------------");
            atual = atual.proximo;
        }
    }
}