package warmup1;

import org.example.warmup1.Warmup1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Warmup1Test {
    //sleepIn(false, false) → true	true	OK
    //sleepIn(true, false) → false	false	OK
    //sleepIn(false, true) → true	true	OK
    //sleepIn(true, true) → true	true	OK

    Warmup1 warmup1 = new Warmup1();

    @Test
    void sleepIn () {
        Assertions.assertTrue(warmup1.sleepIn(false,false));
        Assertions.assertFalse(warmup1.sleepIn(true, false));
        Assertions.assertTrue(warmup1.sleepIn(false, true));
        Assertions.assertTrue(warmup1.sleepIn(true, true));
    }

    //monkeyTrouble(true, true) → true	true	OK
    //monkeyTrouble(false, false) → true	true	OK
    //monkeyTrouble(true, false) → false	false	OK
    //monkeyTrouble(false, true) → false	false	OK
    @Test
    void monkeyTrouble () {
        Assertions.assertTrue(warmup1.monkeyTrouble(true, true));
        Assertions.assertTrue(warmup1.monkeyTrouble(false, false));
        Assertions.assertFalse(warmup1.monkeyTrouble(true, false));
        Assertions.assertFalse(warmup1.monkeyTrouble(false, true));
    }

    //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8
    @Test
    void sumDouble() {
        Assertions.assertEquals(3, warmup1.sumDouble(1, 2));
        Assertions.assertEquals(5, warmup1.sumDouble(3, 2));
        Assertions.assertEquals(8, warmup1.sumDouble(2, 2));
    }

    //diff21(19) → 2	2	OK
    //diff21(10) → 11	11	OK
    //diff21(21) → 0	0	OK
    //diff21(22) → 2	2	OK
    //diff21(25) → 8	8	OK
    //diff21(30) → 18	18	OK
    //diff21(0) → 21	21	OK
    //diff21(1) → 20	20	OK
    //diff21(2) → 19	19	OK
    //diff21(-1) → 22	22	OK
    //diff21(-2) → 23	23	OK
    //diff21(50) → 58	58
    @Test
    void diff21(){
        Assertions.assertEquals(2, warmup1.diff21(19));
        Assertions.assertEquals(11, warmup1.diff21(10));
        Assertions.assertEquals(0, warmup1.diff21(21));
        Assertions.assertEquals(2, warmup1.diff21(22));
        Assertions.assertEquals(0, warmup1.diff21(21));
        Assertions.assertEquals(18, warmup1.diff21(30));
        Assertions.assertEquals(22, warmup1.diff21(-1));
        Assertions.assertEquals(58, warmup1.diff21(50));
    }

    //parrotTrouble(true, 6) → true	true	OK
    //parrotTrouble(true, 7) → false	false	OK
    //parrotTrouble(false, 6) → false	false	OK
    //parrotTrouble(true, 21) → true	true	OK
    //parrotTrouble(false, 21) → false	false	OK
    //parrotTrouble(false, 20) → false	false	OK
    //parrotTrouble(true, 23) → true	true	OK
    //parrotTrouble(false, 23) → false	false	OK
    //parrotTrouble(true, 20) → false	false	OK
    //parrotTrouble(false, 12) → false	false	OK
    @Test
    void parrotTrouble() {
        Assertions.assertTrue(warmup1.parrotTrouble(true, 6));
        Assertions.assertFalse(warmup1.parrotTrouble(false, 6));
        Assertions.assertFalse(warmup1.parrotTrouble(false, 21));
        Assertions.assertTrue(warmup1.parrotTrouble(true, 23));
        Assertions.assertFalse(warmup1.parrotTrouble(true, 20));
        Assertions.assertFalse(warmup1.parrotTrouble(false, 23));
        Assertions.assertFalse(warmup1.parrotTrouble(false, 12));
    }

    //makes10(9, 10) → true	true	OK
    //makes10(9, 9) → false	false	OK
    //makes10(1, 9) → true	true	OK
    //makes10(10, 1) → true	true	OK
    //makes10(10, 10) → true	true	OK
    //makes10(8, 2) → true	true	OK
    //makes10(8, 3) → false	false	OK
    //makes10(10, 42) → true	true	OK
    //makes10(12, -2) → true	true	OK
    @Test
    void makes10(){
        Assertions.assertFalse(warmup1.makes10(9,9));
        Assertions.assertTrue(warmup1.makes10(9,10));
        Assertions.assertTrue(warmup1.makes10(1,9));
        Assertions.assertFalse(warmup1.makes10(8,3));
        Assertions.assertTrue(warmup1.makes10(10,42));
        Assertions.assertTrue(warmup1.makes10(12,-2));
        Assertions.assertTrue(warmup1.makes10(10,1));
    }

    //nearHundred(93) → true	true	OK
    //nearHundred(90) → true	true	OK
    //nearHundred(89) → false	false	OK
    //nearHundred(110) → true	true	OK
    //nearHundred(111) → false	false	OK
    //nearHundred(121) → false	false	OK
    //nearHundred(-101) → false	false	OK
    @Test
    void nearHundred(){
        Assertions.assertTrue(warmup1.nearHundred(93));
        Assertions.assertTrue(warmup1.nearHundred(90));
        Assertions.assertFalse(warmup1.nearHundred(89));
        Assertions.assertTrue(warmup1.nearHundred(110));
        Assertions.assertFalse(warmup1.nearHundred(111));
        Assertions.assertFalse(warmup1.nearHundred(121));
        Assertions.assertFalse(warmup1.nearHundred(-101));
    }
}
