package ordena;

import item.Item;
import java.util.Random;

public abstract class Ordena {

    Item[] v;

    public Item[] getVetor() {
        return v;
    }

    public void setVetor(Item[] vetor) {
        this.v = vetor;
    }
    
    public void geraVetor (int tam) {
      int i;
      Random rand = new Random ();
      
      this.v = new Item[tam];
      for (i = 0; i < tam; i++) {
          this.v[i] = new Item (rand.nextInt (100));
      }            
    }

    public void imprime() {
        int i, n = this.v.length;
        for (i = 0; i < n; i++) {
            System.out.print(this.v[i].chave + " ");
        }
        System.out.println();
    }
}
