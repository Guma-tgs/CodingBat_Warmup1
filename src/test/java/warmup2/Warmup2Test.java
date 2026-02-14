package warmup2;

import org.example.warmup2.Warmup2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Warmup2Test {

    Warmup2 warmup2 = new Warmup2();

    //stringTimes("Hi", 2) → "HiHi"	"HiHi"	OK
    //stringTimes("Hi", 3) → "HiHiHi"	"HiHiHi"	OK
    //stringTimes("Hi", 1) → "Hi"	"Hi"
    //stringTimes("Oh Boy!", 2) → "Oh Boy!Oh Boy!"	"Oh Boy!Oh Boy!"	OK
    //stringTimes("x", 4) → "xxxx"	"xxxx"
    @Test
    void stringTimes() {
        Assertions.assertEquals("HiHi", warmup2.stringTimes("Hi", 2));
        Assertions.assertEquals("HiHiHi", warmup2.stringTimes("Hi", 3));
        Assertions.assertEquals("Hi", warmup2.stringTimes("Hi", 1));
        Assertions.assertEquals("Oh Boy!Oh Boy!", warmup2.stringTimes("Oh Boy!", 2));
        Assertions.assertEquals("xxxx", warmup2.stringTimes("x", 4));
    }
}
