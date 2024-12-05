package DUPLA.src;

public class Lista {
    private No cabeca = new No(); 
    private No cauda = cabeca; 
    private int tamanho = 0; 

    
    public void addOrdenado(Cliente cliente) {
        No elemento = new No(cliente, null, null);

        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            No el = cabeca.proximo;
            while (el != null && el.elemento.codigo < cliente.codigo) {
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

    
    public void removeInicio() throws Exception {
        if (tamanho == 0) {
            throw new Exception("Lista vazia");
        }
        cabeca.proximo = cabeca.proximo.proximo;
        if (cabeca.proximo != null) {
            cabeca.proximo.anterior = cabeca; 
        } else {
            cauda = cabeca; 
        }
        tamanho--;
    }

    
    public void removeFim() throws Exception {
        if (tamanho == 0) {
            throw new Exception("Lista vazia");
        }
        if (tamanho == 1) {
            removeInicio(); 
        } else {
            No el = cauda.anterior; 
            el.proximo = null; 
            cauda = el; 
            tamanho--;
        }
    }

    
    public void remove(int posicao) throws Exception {
        if (tamanho == 0) {
            throw new Exception("Lista vazia.");
        }
        if (posicao >= tamanho) {
            throw new Exception("O elemento especificado não existe.");
        }
        if (posicao == 0) {
            removeInicio();
        } else if (posicao == tamanho - 1) {
            removeFim(); 
        } else {
            No el = cabeca.proximo;
            for (int i = 0; i < posicao - 1; i++) { 
                el = el.proximo;
            }
            No elementoRemover = el.proximo;
            el.proximo = elementoRemover.proximo; 
            if (elementoRemover.proximo != null) {
                elementoRemover.proximo.anterior = el; 
            }
            tamanho--;
        }
    }

   
    public void printCrescente() {
        No el = cabeca.proximo;
        while (el != null) {
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Código: " + el.elemento.codigo);
            System.out.println("Telefone: " + el.elemento.telefone);
            System.out.println("------------------------------");
            el = el.proximo;
        }
    }

   
    public void printDecrescente() {
        No el = cauda;
        while (el != cabeca) {
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Código: " + el.elemento.codigo);
            System.out.println("Telefone: " + el.elemento.telefone);
            System.out.println("------------------------------");
            el = el.anterior;
        }
    }

    
    public int tamanho() {
        return tamanho;
    }
}