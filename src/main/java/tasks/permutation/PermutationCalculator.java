package tasks.permutation;

import utils.MathUtils;

import java.util.HashMap;
import java.util.Map;

public class PermutationCalculator {

    private static final char ZERO_CHARACTER = '0';

    private final Map<Character, Integer> numberOccurrences;
    private final boolean containsNumberZero;

    public PermutationCalculator(String input) {
        this.numberOccurrences = new HashMap<>();

        // counting numbers occurrences
        for (char character : input.toCharArray()) {
            this.numberOccurrences.merge(character, 1, Integer::sum);
        }

        this.containsNumberZero = numberOccurrences.containsKey(ZERO_CHARACTER);
    }

    public Integer calculateNumberOfPermutation() {
        if (this.containsNumberZero) {
            return this.calculateNumberOfPermutationWithoutLeadingZeroes() - this.calculateNumberOfPermutationWithLeadingZeroes();
        }

        return this.calculateNumberOfPermutationWithoutLeadingZeroes();
    }


    private Integer calculateNumberOfPermutationWithoutLeadingZeroes() {
        Integer firstExpression = 0, secondExpression = 1;
        for (Map.Entry<Character, Integer> entry : numberOccurrences.entrySet()) {
            final Integer value = entry.getValue();

            firstExpression += value;
            secondExpression *= MathUtils.factorial(value);
        }

        return MathUtils.factorial(firstExpression) / secondExpression;
    }

    private Integer calculateNumberOfPermutationWithLeadingZeroes() {
        Integer firstExpression = 0, secondExpression = 1;

        for (Map.Entry<Character, Integer> entry : numberOccurrences.entrySet()) {
            final Character key = entry.getKey();
            final Integer value = entry.getValue();

            if (key == ZERO_CHARACTER) {
                firstExpression += value - 1;
                secondExpression *= MathUtils.factorial(value - 1);
            } else {
                firstExpression += value;
                secondExpression *= MathUtils.factorial(value);
            }
        }

        return MathUtils.factorial(firstExpression) / secondExpression;
    }

}
