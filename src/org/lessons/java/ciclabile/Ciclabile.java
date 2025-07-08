package org.lessons.java.ciclabile;

public class Ciclabile {

    private int[] arrayInt;
    private int currentIndex;

    public Ciclabile(int[] arrayInt) {
        this.arrayInt = arrayInt;
        this.currentIndex = 0;
    }

    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return arrayInt[currentIndex++];
        }
        return -1;
    }

    public boolean hasAncoraElementi() {
        // return currentIndex < arrayInt.length;
        if (currentIndex >= arrayInt.length) {
            return false;
        }
        return true;
    }
}
