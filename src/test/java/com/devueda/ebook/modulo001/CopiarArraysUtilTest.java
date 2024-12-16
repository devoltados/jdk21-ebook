package com.devueda.ebook.modulo001;

import static org.junit.jupiter.api.Assertions.*;

class CopiarArraysUtilTest {

    @org.junit.jupiter.api.Test
    void copiaArrayChar() {
        char[] meuArray = {'A','B', 'C'};

        char[] arrayCopia = CopiarArraysUtil.copiaArrayChar(meuArray);

//        arrayCopia[1] = 'W'; //Esta linha faz o teste falhar

        assertArrayEquals(meuArray, arrayCopia);
    }
}