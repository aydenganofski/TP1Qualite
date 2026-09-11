package iut;
public class test_unitaire {
    
    @test
    void nombrePositifs(int a, int b){
        a = 5; b = 3;
        equals(a-b);
    }

    @test
    void nombreNegatifs(int a, int b){
        a = -4; b = -7;
        equals(a-b);
    }
}