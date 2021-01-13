package tasks.permutation;

import org.junit.Assert;
import org.junit.Test;

public class PermutationCalculatorTest {

    @Test
    public void calculateNumberOfPermutationShouldReturnSuccessfullyForInputsWithoutLeadingZeroes() {
        // given
        final String input = "432";

        // when
        final PermutationCalculator permutationCalculator = new PermutationCalculator(input);
        final int actual = permutationCalculator.calculateNumberOfPermutation();

        // then
        Assert.assertEquals(6, actual);
    }

    @Test
    public void calculateNumberOfPermutationShouldReturnSuccessfullyForInputsWithLeadingZeroes() {
        // given
        final String input = "120";

        // when
        final PermutationCalculator permutationCalculator = new PermutationCalculator(input);
        final int actual = permutationCalculator.calculateNumberOfPermutation();

        // then
        Assert.assertEquals(4, actual);
    }

}