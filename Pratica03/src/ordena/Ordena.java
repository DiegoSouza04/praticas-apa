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

    public void preenche() {
        Random rand = new Random();

        for (int i = 0; i < this.v.length; i++) {
            int valor = rand.nextInt(100);
            this.v[i] = new Item(valor);
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
