public class PilhaVagao {
    static final int max = 1000;
    Vagao[] pilha = new Vagao[max];
    int topo = -1;

    public boolean isVazia(){
        return topo == -1;

    }

    public int getTamanho(){
        return topo + 1;

    }

    public void push(Vagao v) throws Exception{
        if (topo == max - 1) {
            throw new Exception("Não há espaço disponivel");

        }

        pilha[++topo] = v;
    }

    public Vagao pop() throws Exception{
        if (isVazia()) {
            throw new Exception("Está vazia");
        }

        return pilha[topo--];
    }

    public Vagao deCima() {
        if (isVazia()) {
            return null;
        }
        return pilha[topo];
    }

    public static boolean pode(int tamanho, int[] verifica) throws Exception {
        PilhaVagao pilha = new PilhaVagao();
        int proximoVagao = 1;
        int i = 0;

        while (proximoVagao <= tamanho || !pilha.isVazia()) {
            if (!pilha.isVazia() && pilha.deCima().numero == verifica[i]) {
                pilha.pop();
                i++;

            } else if (proximoVagao <= tamanho) {
                pilha.push(new Vagao(proximoVagao++));

            } else {
                return false;

            }
        }

        return true;
    }

}
