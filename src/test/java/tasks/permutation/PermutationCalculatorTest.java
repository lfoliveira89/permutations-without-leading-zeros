package tasks.permutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationCalculatorTest {

    @Test
    public void calculateNumberOfPermutationShouldReturnSuccessfullyForInputsWithoutLeadingZeroes() {
        // given
        final String input = "432";

        // when
        final PermutationCalculator permutationCalculator = new PermutationCalculator(input);
        final int actual = permutationCalculator.calculateNumberOfPermutation();

        // then
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void calculateNumberOfPermutationShouldReturnSuccessfullyForInputsWithLeadingZeroes() {
        // given
        final String input = "120";

        // when
        final PermutationCalculator permutationCalculator = new PermutationCalculator(input);
        final int actual = permutationCalculator.calculateNumberOfPermutation();

        // then
        Assertions.assertEquals(4, actual);
    }

}