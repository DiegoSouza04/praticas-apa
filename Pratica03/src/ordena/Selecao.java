package ordena;

import item.Item;

public class Selecao extends Ordena {

    public int i, j;

    int comparacoes = 0, trocas = 0;

    public Selecao() {

    }

    public Selecao(Item[] vetor) {
        this.v = vetor;
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

    public void ordena() {
        int i, j, menor, n = this.v.length;
        Item aux;
        for (i = 0; i < n - 1; i++) {
            menor = i;
            for (j = i + 1; j < n; j++) {
                if (this.v[j].chave < this.v[menor].chave) {
                    menor = j;
                }
            }
            aux = this.v[i];
            this.v[i] = this.v[menor];
            this.v[menor] = aux;
        }
    }

}
