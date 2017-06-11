package ordena;

import item.Item;

public class Quicksort extends Ordena {

    public int i, j;
    int comparacoes = 0, trocas = 0;

    public Quicksort() {
    }

    public Quicksort(Item[] vetor) {
        this.v = vetor;
    }

    public void quicksort() {
        this.ordena(0, this.v.length - 1);
    }

    public void ordena(int e, int d) {
        this.particao(e, d);
        if (e < this.j) {
            this.ordena(e, this.j);
        }
        if (this.i < d) {
            this.ordena(this.i, d);
        }
    }

    public void particao(int e, int d) {
        Item x;
        Item aux;
        this.i = e;
        this.j = d;
        x = this.v[(this.i + this.j) / 2];
        do {
            while (this.v[this.i].chave < x.chave) {
                comparacoes++;
                this.i++;
            }
            while (this.v[this.j].chave > x.chave) {
                comparacoes++;
                this.j--;
            }
            if (this.i <= this.j) {
                trocas++;
                aux = this.v[this.i];
                this.v[this.i] = this.v[this.j];
                this.v[this.j] = aux;
                this.i++;
                this.j--;
            }
        } while (this.i <= this.j);
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(int comparacoes) {
        this.comparacoes = comparacoes;
    }

    public int getTrocas() {
        return trocas;
    }

    public void setTrocas(int trocas) {
        this.trocas = trocas;
    }

}


