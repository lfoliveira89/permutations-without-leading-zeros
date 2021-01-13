package utils;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void factorialShouldReturnSuccessfully() {
        // given
        final int n = 4;

        // when
        final int actual = MathUtils.factorial(n);

        // then
        Assert.assertEquals(24, actual);
    }

}