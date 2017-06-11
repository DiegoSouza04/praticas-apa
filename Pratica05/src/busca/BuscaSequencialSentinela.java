
package busca;

public class BuscaSequencialSentinela {
    
    int[]a;
    
    public BuscaSequencialSentinela(int []a){
        this.a = a;
    }

    public int busca(int v, int l, int r) {
        int i, n = r + 1;
        a[n] = v;
        for (i = l; v != a[i]; i++);
        if (i < n) {
            return (i); /*Chave encontrada!*/
        } else {
            return (-1); /*Sentinela encontrada.*/
        }
    }

}
