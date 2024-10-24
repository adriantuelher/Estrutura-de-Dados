import java.util.Scanner;

public class atv1 {
    public static long somaSucessiva(int n1, int n2){
        if (n2 == 0) {
            return 0;

        }if (n2 < 0) {
            return -1 * somaSucessiva(n1, n2 * -1);

        }else{
            return n1 + somaSucessiva(n1, n2 - 1);
            
        }

        
        
    }

    
      
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Digite o primeiro valor?");
            n1 = sc.nextInt();

            System.out.println("Digite o segundo valor?");
            n2 = sc.nextInt();
        
            System.out.println(somaSucessiva(n1, n2));
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        

        sc.close();
    }
}