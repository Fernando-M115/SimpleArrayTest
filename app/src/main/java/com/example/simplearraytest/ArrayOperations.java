package com.example.simplearraytest;

public class ArrayOperations {
    public int[] ArrayInt;

    public ArrayOperations(){
        ArrayInt = new int[10];
        ArrayInt[0] = 1;
        ArrayInt[1] = 8;
        ArrayInt[2] = -2;
        ArrayInt[3] = -20;
        ArrayInt[4] = -2;
        ArrayInt[5] = 1;
        ArrayInt[6] = 8;
        ArrayInt[7] = 8;
        ArrayInt[8] = 9;
        ArrayInt[9] = 15;
    }

    public boolean searchNumber(int numero){
        boolean resultado = false;

        for (int j : ArrayInt) {
            if (j == numero) {
                resultado = true;
                break;
            }
        }

        return resultado;
    }

    public int countOcurrences(int numero){
        int numeroVeces = 0;

        for (int j: ArrayInt) {
            if (j == numero){
                numeroVeces++;
            }
        }
        return numeroVeces;
    }

}
