import java.util.Scanner;

public class VerificarPerfeito{
    static int perfeito(int n){
        int i, soma = 0;
        for(i = 1; i < n; i++){
            if(n%i == 0)
                soma = soma + i;
        }
        if(soma == n)
            return 1;
        else   
            return 0;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int num, r;
        System.out.print("Digite um número para verificar se é perfeito: ");
        num = n.nextInt();
        r = perfeito (num);
        if(r == 1)
            System.out.printf("O número %d é perfeito!", num);
        else
            System.out.printf("O número %d não é perfeito!", num);
        n.close();
    }
}