package com.diazbumma;

public class EvenFibonacci {

    static int lookup[] = new int[50];

    //fibonacci index start at 0
    //f0 = 1
    //f1 = 2
    static {
        lookup[0] = 1;
        lookup[1] = 2;
    }

    static int fibonacci(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 2;
        if (lookup[n] == 0) {
            lookup[n] = fibonacci(n-1) + fibonacci(n-2);
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        //assuming f40 is still under 4 million
        fibonacci(40);
        
        int sumEven = 0;
        int ittr = 0;
        while (lookup[ittr] <= 4_000_000) {
            if (lookup[ittr] % 2 == 0)
                sumEven += lookup[ittr];
            ittr++;
        }

        System.out.println("sumEven " + sumEven);
    }
}
