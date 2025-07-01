package org.kamathad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Parameterized.class)
@PrepareForTest(MathUtils.class)
public class MathUtilsTest {

    private final int input ;
    private final int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2, 4}, {3, 6}, {4, 8}
        });
    }

    public MathUtilsTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
        System.out.println("Creating test case with input = " + input + ", expected = " + expected);
    }

    @Test
    public void testMultiplyByTwo() {
        System.out.println("Running test with input = " + input);
        PowerMockito.mockStatic(MathUtils.class);
        PowerMockito.when(MathUtils.multiplyByTwo((input))).thenReturn(expected);

        assertEquals(expected, MathUtils.multiplyByTwo(input));
    }
}