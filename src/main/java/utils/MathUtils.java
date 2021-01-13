package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MathUtils {

    private static Map<Integer, Integer> factorialCache = new HashMap<>();

    private MathUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static Integer factorial(Integer n) {
        if (factorialCache.containsKey(n)) {
            return factorialCache.get(n);
        }

        final int result = IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
        factorialCache.put(n, result);

        return result;
    }
}
