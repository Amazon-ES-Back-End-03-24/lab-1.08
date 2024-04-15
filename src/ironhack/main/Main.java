package ironhack.main;

import ironhack.classes.intlists.IntArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        // Exercise 1
        BigDecimal b1 = new BigDecimal("4.2545");
        System.out.println(round(b1));

        // Exercise 2
        BigDecimal b2 = new BigDecimal("1.2345");
        BigDecimal b3 = new BigDecimal("-45.67");
        System.out.println(inverseAndRound(b2));
        System.out.println(inverseAndRound(b3));

        //
        IntArrayList intArrayList = new IntArrayList();
        for(int i=0; i<20; i++) {
            intArrayList.add(i);
        }
    }

    public static BigDecimal round(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal inverseAndRound(BigDecimal bigDecimal) {
        return bigDecimal.negate().setScale(1, RoundingMode.HALF_EVEN);
    }



}
