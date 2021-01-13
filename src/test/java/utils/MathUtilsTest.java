package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    public void factorialShouldReturnSuccessfully() {
        // given
        final int n = 4;

        // when
        final int actual = MathUtils.factorial(n);

        // then
        Assertions.assertEquals(24, actual);
    }

}