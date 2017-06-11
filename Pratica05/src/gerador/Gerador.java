
package gerador;

import java.util.Random;


public class Gerador {
    
    int[] vetor;
    
    public Gerador(int tam){
        int i;
        Random rand = new Random();
        
        vetor = new int[tam];
        for(i = 0; i < tam; i++){
            vetor[i] = rand.nextInt(100);
        }
        
    }
    
    public int[] getVetor(){
        return this.vetor;
    }
    
}
