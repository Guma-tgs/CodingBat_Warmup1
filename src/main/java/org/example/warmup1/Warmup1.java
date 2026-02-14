package org.example.warmup1;

public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a+b)*2;
        }
        return a + b;
    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return 21 - n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {
            if (hour < 7 || hour > 20){
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a + b == 10) {
            return true;
        }
        if (a == 10 || b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10 ||
                Math.abs(n - 200) <= 10);
    }

}
