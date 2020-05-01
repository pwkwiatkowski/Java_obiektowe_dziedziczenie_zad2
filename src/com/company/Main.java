package com.company;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        System.out.println(kalkulatorPodstawowy.dodaj(10,20));
        System.out.println(kalkulatorPodstawowy.odejmij(10,20));

        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystyczny.dodaj(10,20));
        System.out.println(kalkulatorStatystyczny.odejmij(10,20));
        System.out.println(kalkulatorStatystyczny.sinus(0.5));
    }
}

class Kalkulator {
    public int dodaj(int a,int b) {
        return a+b;
    }
    public int odejmij(int a,int b) {
        return a-b;
    }
}

class KalkulatorStatystyczny extends Kalkulator {
    public double sinus(double a) {
        return Math.sin(a);
    }
}