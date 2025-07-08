package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {

        int[] numeri = { 10, 20, 30, 40, 50, 60 };
        Ciclabile elenco = new Ciclabile(numeri);

        // System.out.println(elenco.getElementoSuccessivo());
        // System.out.println(elenco.hasAncoraElementi());
        elenco.addElement(70);
        elenco.addElement(80);
        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }
        // elenco.addElement(90);
        // System.out.println(elenco.getElementoSuccessivo());
        // System.out.println(elenco.hasAncoraElementi());

        Ciclabile elenco2 = new Ciclabile();

        elenco2.addElement(11);
        elenco2.addElement(22);
        elenco2.addElement(33);
        elenco2.addElement(44);
        elenco2.addElement(55);

        while (elenco2.hasAncoraElementi()) {
            System.out.println(elenco2.getElementoSuccessivo());
        }

    }

}
