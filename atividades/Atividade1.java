package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor para A: ");
            A[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor para B: ");
            B[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            C[i] = A[i] - B[i] * A[i];
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }
    }
}