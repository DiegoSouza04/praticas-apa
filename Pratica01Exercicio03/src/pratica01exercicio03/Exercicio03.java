package pratica01exercicio03;

import java.util.Random;

public class Exercicio03 {

    int vet[] = new int[10];

    public void preenche() {

        Random r = new Random();

        int cont = 0;

        System.out.println("Impressão do vetor:");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(100);
            cont += 1;
            System.out.println((cont) + "ª Posicao | Elemento: " + vet[i]);
        }
        System.out.println("----------------------------------------------------");
    }

    public void parImpar() {
        if (vet[0] % 2 == 0) {
            System.out.println("O elemento: " + vet[0] + " na 1ª posição é par");
        } else {
            System.out.println("O elemento: " + vet[0] + " na 1ª posição não é par");
        }
    }
}
