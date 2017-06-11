package pratica01exercicio06;

import java.util.Random;

public class Exercicio06 {

    int matriz[][] = new int[10][10];
    int i, j;

    public void preenche() {

        Random r = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                this.matriz[i][j] = r.nextInt(100);
                System.out.printf("%d  ", this.matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public void diagonalPrincipal() {
        System.out.println("Diagonal Principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i] + " ");
        }
    }

    public void diagonalSecundaria() {
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i <= matriz.length - 1; i++) {
            System.out.println(matriz[i][matriz.length - 1  - i] + " ");
        }

    }
}
