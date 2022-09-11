package com.mycompany.atividades;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        int i=0, k=0;
        int N[] = new int[100];
        
        while (k != 100) {
            if (i % 7 != 0 || i % 10 == 7) {
                N[k] = i;
                System.out.println(N[k]);
                k++;
            }
            i++;
        }
    }
}