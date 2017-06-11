package ordena;

import item.Item;

public class Heapsort extends Ordena {

    int tamanho_do_heap;

    public Heapsort() {
    }

    public void ordena() {
        int i;

        this.build_max_heap();

        for (i = this.v.length - 1; i > 0; i--) {
            troca(0, i);
            this.tamanho_do_heap = this.tamanho_do_heap - 1;
            this.max_heapify(0);
        }
    }

    public void troca(int i, int j) {
        Item temp = new Item();

        temp.chave = this.v[i].chave;
        this.v[i].chave = this.v[j].chave;
        this.v[j].chave = temp.chave;
    }

    public void build_max_heap() {
        int i;

        this.tamanho_do_heap = this.v.length;
        for (i = this.tamanho_do_heap / 2; i >= 0; i--) {
            max_heapify(i);
        }

    }

    public void max_heapify(int i) {
        int e = 2 * i + 1;
        int d = 2 * i + 2;
        int maior;

        if ((e < this.tamanho_do_heap) && (this.v[e].chave > this.v[i].chave)) {
            maior = e;
        } else {
            maior = i;
        }

        if ((d < this.tamanho_do_heap) && (this.v[d].chave > this.v[maior].chave)) {
            maior = d;
        }

        if (maior != i) {
            troca(i, maior);
            max_heapify(maior);
        }
    }
}
