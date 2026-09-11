package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AddTest {


    @Test
    public void positif(){
        int a = 1;
        int b = 2;
        assertEquals(3, Add.add(a,b));
    }

    @Test
    public void negatif(){
        int a = -1;
        int b = -2;
        assertEquals(-3, Add.add(a,b));
    }


    @Test
    public void avecZero(){
        int a = 1;
        int b = 0;
        assertEquals(1, Add.add(a,b));
    }

    @Test
    public void doitFaireZero(){
        int a = 1;
        int b = 0;
        assertEquals(1, Add.add(a,b));
    }
}

