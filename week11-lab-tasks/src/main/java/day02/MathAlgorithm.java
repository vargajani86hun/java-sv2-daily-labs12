package day02;

import java.util.ArrayList;
import java.util.List;

public final class MathAlgorithm {
    private MathAlgorithm(){

    }

    public static int getGreatestCommonDivisorOf(int a, int b) {
        List<Integer> divisorsOfA = getDivisorsOf(a);
        List<Integer> divisorsOfB = getDivisorsOf(b);
        for (int i = divisorsOfA.size() - 1; i >= 0; i--) {
            for (int j = divisorsOfB.size() - 1; j >= 0; j--) {
                if (divisorsOfA.get(i).intValue() == divisorsOfB.get(j)) {
                    return divisorsOfA.get(i);
                }
            }
        }
        return 1;
    }

    public static List<Integer> getDivisorsOf(int x) {
        List<Integer> results = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if ((x % i) == 0) {
                results.add(i);
            }
        }
        return results;
    }
}
