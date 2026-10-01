import java.util.Scanner;

public class VerificarPrimo {
    static int primo(int n){
    int i,qnt = 0;
    for(i = 1; i <= n; i++){
        if(n%i <= 0)
            qnt++;
    }  

    if(qnt == 2)
        return 1;
    else 
        return 0;    
    }
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int num, r;
        System.out.print("Digite o número para verificar se é primo: ");
        num = n.nextInt();
        r = primo(num);
        if(r == 1)
            System.out.printf("O número %d é primo!", num);
        else 
            System.out.printf("O número %d não é primo!", num);
        n.close();
    }
}