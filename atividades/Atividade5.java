package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=0, k, l;
        
        System.out.println("Informe a quantidade de linhas a ser gerada: ");
        l = sc.nextInt();
        if (l >= 0) {
            n = l;
        } else {
            System.out.println("Valor informado invalido");
            System.exit(0);
        }
        
        int pascal[] = new int[n+1];
        pascal[0] = 1;
        
        for (int i = 0; i <= n; i++) {
            System.out.println();
            l = 0;
            for (int j = 0; j <= i; j++) {
                k = l + pascal[j];
                l = pascal[j];
                pascal[j] = k;
                System.out.print(pascal[j] + ", ");
            }
        }
    }
}