package com.diazbumma;

public class SmallestMultiple {

    static boolean checkDivisible(int n) {
        for (int i = 1; i <= 20; i++) {
            if (n % i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 40;

        while (true) {
            if (checkDivisible(num)) {
                break;
            }
            num += 20;
        }

        System.out.println(num);
    }
}
