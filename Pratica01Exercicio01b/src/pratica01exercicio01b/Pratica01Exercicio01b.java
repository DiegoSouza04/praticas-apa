
package pratica01exercicio01b;

import java.util.Scanner;

/**
 *
 * @author dsouz
 */
public class Pratica01Exercicio01b {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int soma = 0;

        System.out.print("Informe um numero natural: ");
        int n = valor.nextInt();

        for (int i = 0; i <= n; i++) {
            soma += i + 5;

            System.out.println("n valendo: " + n + " ,somatório: " + soma);
        }
    }

}
