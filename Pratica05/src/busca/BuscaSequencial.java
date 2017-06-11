package busca;

public class BuscaSequencial {
    
    int[]a;
    
    public BuscaSequencial(int []a){
        
        this.a = a;
    }

    public int busca(int v, int l, int r) {
        for (int i = l; i <= r; i++)
            if (v == a[i]) 
                return i;
        return -1;
    }
}