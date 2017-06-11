
package pratica06;

import ordena.Heapsort;

public class Pratica06 {


    public static void main(String[] args) {
       int tam;
       for(tam = 10; tam <= 1000; tam *=10){
           System.out.println("--- Heapsort: vetor com " + tam + " elementos ---");
           Heapsort h = new Heapsort();
           h.geraVetor(tam);
           h.imprime();
           h.ordena();
           h.imprime();
       }
    }
    
}
