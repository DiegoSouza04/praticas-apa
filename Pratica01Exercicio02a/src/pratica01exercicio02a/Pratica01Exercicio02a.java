
package pratica01exercicio02a;

import java.util.Scanner;

public class Pratica01Exercicio02a {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int produto = 1;

        System.out.print("Informe um numero natural: ");
        int n = valor.nextInt();

        for (int i = 1; i <= n; i++) {
            produto *= i;

            System.out.println("n valendo: " + n + " ,produtório: " + produto);
        }
    }

}
