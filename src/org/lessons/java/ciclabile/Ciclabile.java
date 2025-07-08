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

    // costruttore vuoto per il bonus
    public Ciclabile() {
        this.arrayInt = new int[0];
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

    // metodo per aggiungere un elemento(bonus)
    public void addElement(int numero) {
        int[] newArray = new int[arrayInt.length + 1];
        for (int i = 0; i < arrayInt.length; i++) {
            newArray[i] = arrayInt[i];
        }

        newArray[arrayInt.length] = numero;
        arrayInt = newArray;
    }
}
