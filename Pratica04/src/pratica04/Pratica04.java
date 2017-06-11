
package pratica04;

import java.util.Random;
import ordena.Quicksort;
import item.Item;
import java.util.Scanner;

public class Pratica04 {


    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int i, chave, tamanho;
        
        System.out.println("Informe o tamanho do vetor: [10, 100, 1000, 10000, 100000]:");
        tamanho = valor.nextInt();
        
        
        Item [] vet = new Item[tamanho];
        Item [] vetl = new Item[100];
        Item [] vetm = new Item[1000];
        Item [] vetn = new Item[10000];
        Item [] veto = new Item[100000];
        Random rand = new Random();
        
        for(i = 0; i < vet.length; i++){
            chave = rand.nextInt(100);
            vet[i] = new Item(chave);
        }
        
        System.out.println("Vetor tamanho " + tamanho);
        Quicksort qsk = new Quicksort(vet);
        qsk.imprime();
        qsk.quicksort();
        qsk.imprime();
        System.out.println("Tamanho:" + vet.length + " Comparacoes: " + qsk.getComparacoes() + " Trocas: " + qsk.getTrocas());
    }
}
