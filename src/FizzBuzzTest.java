import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void kiemTraFizzBuzz() {
        FizzBuzz abc = new FizzBuzz();
        System.out.println(abc.kiemTraFizzBuzz(9));
    }


    @Test
    void docSo() {
        FizzBuzz a = new FizzBuzz();
        System.out.println(a.docSo(9));
    }

    @Test
    void docSoHaiChuSo() {
        FizzBuzz a = new FizzBuzz();
        System.out.println(a.docSoHaiChuSo(9));
    }
}