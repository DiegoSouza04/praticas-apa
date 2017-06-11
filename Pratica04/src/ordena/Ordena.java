package ordena;

import item.Item;

public abstract class Ordena {

    Item[] v;

    public Item[] getVetor() {
        return v;
    }

    public void setVetor(Item[] vetor) {
        this.v = vetor;
    }

    public void imprime() {
        int i, n = this.v.length;
        for (i = 0; i < n; i++) {
            System.out.print(this.v[i].chave + " ");
        }
        System.out.println();
    }
}
