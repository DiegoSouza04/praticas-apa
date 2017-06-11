package pratica01exercicio02c;

import java.util.Scanner;

/**
 *
 * @author dsouz
 */
public class Pratica01Exercicio02c {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int produto = 1;

        System.out.print("Informe um numero natural: ");
        int n = valor.nextInt();

        for (int i = 3; i <= n; i++) {
            int result = (i / 3);
            produto *= (Math.pow(result, 4)) / (i - 2);

            System.out.println("n valendo: " + n + " ,produtório: " + produto);
        }
    }

}
