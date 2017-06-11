package pratica01exercicio02b;

import java.util.Scanner;

/**
 *
 * @author dsouz
 */
public class Pratica01Exercicio02b {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int produto = 1;

        System.out.print("Informe um numero natural: ");
        int n = valor.nextInt();

        for (int i = 0; i <= n; i++) {
            produto *= i + 12;

            System.out.println("n valendo: " + n + " ,produtório: " + produto);
        }
    }

}
