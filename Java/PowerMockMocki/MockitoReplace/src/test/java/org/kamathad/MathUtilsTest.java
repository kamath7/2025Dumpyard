package org.kamathad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MathUtilsTest {

    private final int input;
    private final int expected;

    public MathUtilsTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2, 4}, {3, 6}, {4, 8}
        });
    }

    @Test
    public void testMultiplyByTwo_withStaticMocking() {
        try (MockedStatic<MathUtils> mockedStatic = Mockito.mockStatic(MathUtils.class)) {
            mockedStatic.when(() -> MathUtils.multiplyByTwo(input)).thenReturn(expected);
            int result = MathUtils.multiplyByTwo(input);

            assertEquals(expected, result);
        }
    }
}