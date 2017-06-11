package pratica01exercicio04;

import java.util.Random;

/**
 *
 * @author 314112699
 */
public class Exercicio04 {

    int[] vetor = new int[10];

    public void preenche() {

        Random r = new Random();



        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(100);
            System.out.println("Posição: " + i + " Elemento: " + vetor[i]);
        }
        System.out.println("----------------------------------------------------");
    }

    public void trocar() {  
        int aux;
        
        aux = vetor[0];
        vetor[0] = vetor[9];
        vetor[9] = aux;
    }
    public void imprime() {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
   
    
}
