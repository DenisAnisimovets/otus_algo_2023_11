package com.danis.homework02;

public class Task03 {
    public static void main(String[] args) {
        //System.out.println(qVStepeniN(5, 3));
        //System.out.println(ChisloFibbonacchiIterativno(10));
        //System.out.println(ChisloFibbonacchiRecursivno(10));
        System.out.println(PoiskProstyhChisel(7));
    }

    public static long qVStepeniN(int q, int n) {
        long qVStepeniN = 1;
        for (int i = 0; i < n; i++) {
            qVStepeniN = qVStepeniN * q;
        }
        return qVStepeniN;
    }

    public static long ChisloFibbonacchiIterativno(int n) {
        if(n == 1 || n == 2) return 1;
        int pred1 = 1;
        int pred2 = 1;
        int chislo = 1;
        int tmp = 0;
        for (int i = 3; i <= n; i++) {
            tmp = chislo;
            pred2 = pred1;
            pred1 = tmp;
            chislo = pred1 + pred2;
        }
        return chislo;
    }

    public static long ChisloFibbonacchiRecursivno(int n) {
        if(n == 1 || n == 2) return 1;
        return ChisloFibbonacchiIterativno(n - 1) + ChisloFibbonacchiIterativno(n - 2);
    }

    public static long PoiskProstyhChisel(long n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            int kolvoDelitelei = 0;
            for (int j = 2; j <= i; j++) {
                if(i % j == 0) kolvoDelitelei++;
            }
            if(kolvoDelitelei == 1) count++;
        }
        return count;
    }

}


