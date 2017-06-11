/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica05;

import busca.BuscaBinaria;
import busca.BuscaSequencial;
import busca.BuscaSequencialSentinela;
import gerador.Gerador;
import java.util.Random;

/**
 *
 * @author 314112699
 */
public class Pratica05 {

    public static void main(String[] args) {
        int n, resposta;
        int[] vet;
        Random rand = new Random();

        for (n = 10; n < 1000; n *= 10) {
            Gerador gerador = new Gerador(n);
            vet = gerador.getVetor();

            int valor = rand.nextInt(100);

            BuscaSequencial bs = new BuscaSequencial(vet);
            resposta = bs.busca(valor, 0, n - 1);

            System.out.println("Busca Sequencial");
            if (resposta == -1) {
                System.out.println("O número " + valor + " não foi encontrado no vetor!");
            } else {
                System.out.println("O número " + valor + " foi encontrado na posição: " + resposta);
            }
        /*
            BuscaSequencialSentinela bss = new BuscaSequencialSentinela(vet);
            resposta = bss.busca(valor, 0, n - 1);

            System.out.println("Busca Sequencial Sentinela");
            if (resposta == -1) {
                System.out.println("O número " + valor + " não foi encontrado no vetor!");
            } else {
                System.out.println("O número " + valor + " foi encontrado na posição: " + resposta);
            }
          */
            BuscaBinaria bn = new BuscaBinaria(vet);
            resposta = bn.busca(valor, 0, n - 1);
            System.out.println("Busca Binaria");
            if (resposta == -1) {
                System.out.println("O número " + valor + " não foi encontrado no vetor!");
            } else {
                System.out.println("O número " + valor + " foi encontrado na posição: " + resposta);
            }
        }
    }

}
