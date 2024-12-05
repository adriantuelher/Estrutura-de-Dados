package DUPLA.src;

public class Cliente {
    private static int contador = 0;
    public String nome;
    public String telefone;
    public int codigo = 0;
    
    public Cliente(String nome, String telefone) {
        this.codigo = ++contador;
        this.nome = nome;
        this.telefone = telefone;
    } 
}
