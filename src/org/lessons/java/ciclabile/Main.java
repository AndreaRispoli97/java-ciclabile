package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {

        int[] numeri = { 10, 20, 30, 40, 50, 60 };
        Ciclabile elenco = new Ciclabile(numeri);

        // System.out.println(elenco.getElementoSuccessivo());
        // System.out.println(elenco.hasAncoraElementi());

        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }

        // System.out.println(elenco.getElementoSuccessivo());
        // System.out.println(elenco.hasAncoraElementi());
    }
}
