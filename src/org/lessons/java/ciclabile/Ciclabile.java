package org.lessons.java.ciclabile;

public class Ciclabile {
    // attributi e costruzione array
    private int[] arrayInt;
    private int currentIndex;

    // costruttore con array
    public Ciclabile(int[] arrayInt) {
        this.arrayInt = arrayInt;
        this.currentIndex = 0;
    }

    // metodo get
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return arrayInt[currentIndex++];
        }
        return -1;
    }

    // metodo per verificare se ci sono altri elementi da prendere
    public boolean hasAncoraElementi() {
        // return currentIndex < arrayInt.length;
        if (currentIndex >= arrayInt.length) {
            return false;
        }
        return true;
    }
}
