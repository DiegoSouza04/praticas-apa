package busca;

public class BuscaBinaria {
    
    int[]a;
    
    public BuscaBinaria(int[]a){
        this.a = a;
    }
    
    public int busca(int v, int l, int r) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (v == a[m]) {
                return m;
            }
            if (v < a[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

}
