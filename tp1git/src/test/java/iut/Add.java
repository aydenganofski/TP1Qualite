package iut;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class Add {


    @Test
    public void positif(){
        int a = 1;
        int b = 2;
        assertTrue(3, add(a+b));
    }

    @Test
    public void negatif(){
        int a = -1;
        int b = -2;
        assertTrue(-3, add(a+b));
    }


    @Test
    public void avecZero(){
        int a = 1;
        int b = 0;
        assertTrue(1, add(a+b));
    }

    @Test
    public void doitFaireZero(){
        int a = 1;
        int b = 0;
        assertTrue(1, add(a+b));
    }
}

