
package pratica01exercicio01c;

import java.util.Scanner;

public class Pratica01Exercicio01c {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int soma = 0;

        System.out.print("Informe um numero natural: ");
        int n = valor.nextInt();

        for (int i = 2; i <= n; i++) {

            int result = (i - 3);
            soma += (Math.pow(result, 2)) / (i - 1);

            System.out.println("n valendo: " + n + " ,somatório: " + soma);
        }

    }
}
