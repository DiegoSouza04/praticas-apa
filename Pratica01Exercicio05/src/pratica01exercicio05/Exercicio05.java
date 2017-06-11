package pratica01exercicio05;

import java.util.Random;

/**
 *
 * @author 314112699
 */
public class Exercicio05 {

    int vet[] = new int[10];

    public void parImpar() {

        Random r = new Random();

        int cont = 0;
        int contPar = 0;
        int contImpar = 0;
        System.out.println("Impressão do vetor:");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(100);

            if (vet[i] % 2 == 0) {
                contPar += 1;
            } else {
                contImpar += 1;
            }
            cont += 1;
            System.out.println((cont) + "ª Posicao | Elemento: " + vet[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("O vetor possui " + contPar + " elementos pares e "  + contImpar + " elementos ímpares.");
    }
}
