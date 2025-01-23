public class Fila {
    static final int TAM_MAX = 50;
    int inicio = 0; 
    int fim = 0; 
    int tamanho = 0;

    Carta vetor[] = new Carta[TAM_MAX];

    public void enfileirar(Carta p) throws Exception{
        if (isFull())
            throw new Exception("Fila cheia");
        vetor[fim] = p;
        fim++;
        if (fim == TAM_MAX)
            fim = 0;
        
        tamanho++;
    }

    public Carta desenfileirar() throws Exception{
        if (isEmpty())
            throw new Exception("Fila vazia");
        Carta aux = vetor[inicio];
        inicio++;
        if (inicio == TAM_MAX)
            inicio = 0;
        tamanho--;
        return aux;
    }


    public boolean isFull() {
        return tamanho == TAM_MAX;
    }
    public boolean isEmpty() {
        return tamanho == 0;
    }
}
