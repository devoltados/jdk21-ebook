package com.devueda.ebook.modulo001;

public class CopiarArraysUtil {
    public static char[] copiaArrayChar(char[] arrayASerCopiado) {
        char[] copiaDoArray;

//        copiaDoArray = new char[ arrayASerCopiado.length ];

//        for(int i=0; i<arrayASerCopiado.length; i++) {
//            copiaDoArray[i] = arrayASerCopiado[i];
//        }

//        System.arraycopy(arrayASerCopiado, 0, copiaDoArray, 0, arrayASerCopiado.length);

        copiaDoArray = java.util.Arrays.copyOfRange(arrayASerCopiado, 0, arrayASerCopiado.length);

        return copiaDoArray;
    }
}
