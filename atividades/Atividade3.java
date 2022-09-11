package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int somaPar=0, quantImpar=0;
        int vetor[] = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Valores pares: ");
        for (int i = 0; i < 6; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + ", ");
                somaPar = somaPar + vetor[i];
            }
        }
        System.out.println();
        System.out.println("Soma dos valores pares: " + somaPar);
        
        System.out.println("Valores impares: ");
        for (int i = 0; i < 6; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + ", ");
                quantImpar++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de valores impares: " + quantImpar);
    }
}