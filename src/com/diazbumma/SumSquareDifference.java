package com.diazbumma;

public class SumSquareDifference {

    // return sum of first n natural quadratic numbers
    static int sumNaturalQuadratic(int n) {
        return (n * (n+1) * (2*n +1)) / 6;
    }

    // return sum of first n natural numbers
    static int sumNatural(int n) {
        return n/2 * (1 + (1 + (n-1)));
    }

    public static void main(String[] args) {
        // difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
        System.out.println((int) Math.pow(sumNatural(100), 2) - sumNaturalQuadratic(100));
    }
}
