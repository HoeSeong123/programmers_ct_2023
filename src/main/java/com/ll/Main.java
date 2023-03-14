package com.ll;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long number = 1600851475143L;

        List<Long> prime = primeNumber(number);
        for(long num : prime) {
            if(number % num == 0) {
                number /= num;
            }
        }
        System.out.println(number);

    }


    static List<Long> primeNumber(long n) {
        List<Long> prime = new ArrayList<>();
        for (long i = 2; i<=(long)Math.sqrt(n); i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        return prime;
    }

    static boolean isPrime(long n) {
        for (long i = 2; i<=(long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}