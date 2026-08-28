package lambda.primo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        OperacaoPrimo numeroPrimo = n -> {
            if(n <= 1)
                return false;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0)
                    return false;
            }
                return true;
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (numeroPrimo.verificarPrimo(n)){
            System.out.println("O número " + n + " é primo.");
        }  else {
            System.out.println("O número " + n + " não é primo.");
        }
        sc.close();

    }
}
