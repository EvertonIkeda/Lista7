package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int j=0, l;
        double a;
        double vetor1[] = new double[10];
        double vetor2[] = new double[10];
        double uniao[] = new double[20];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor do primeiro vetor: ");
            vetor1[i] = sc.nextDouble();
            l = 0;
            for (int k = 0; k < j; k++) {
                if (vetor1[i] == uniao[k]) {
                    l++;
                }
            }
            if (l == 0) {
                uniao[j] = vetor1[i];
                j++;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor do segundo vetor: ");
            vetor2[i] = sc.nextDouble();
            l = 0;
            for (int k = 0; k < j; k++) {
                if (vetor2[i] == uniao[k]) {
                    l++;
                }
            }
            if (l == 0) {
                uniao[j] = vetor2[i];
                j++;
            }
        }
        
        for (int i = 0; i < j-1; i++) {
            for (int k = i; k < j; k++) {
               if (uniao[k] < uniao[i] ) {
                   a = uniao[k];
                   uniao[k] = uniao[i];
                   uniao[i] = a;
               }
            }
        }
        
        System.out.println("");
        System.out.println("Uniao dos vetores: ");
        for (int i = 0; i < j; i++) {
            System.out.print(uniao[i] + ", ");
        }
    }
}