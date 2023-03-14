package com.ll.test;

public class Polynomial {
    String exp;

    public Polynomial(String exp) {
        this.exp = exp;
    }

    public int calc() {
        String[] temp = exp.split(" \\+ ");
        return Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
    }

}
