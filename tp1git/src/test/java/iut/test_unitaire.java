package iut;

import org.junit.jupiter.api.Test;

public class test_unitaire {
    
    @Test
    void nombrePositifs(){
        int a = 5; 
        int b = 3;
        AssertEquals(a-b, 2);
    }

    @Test
    void nombreNegatifs(){
        int a = -5; 
        int b = -3;
        AssertEquals(a-b, 2);
    }
}