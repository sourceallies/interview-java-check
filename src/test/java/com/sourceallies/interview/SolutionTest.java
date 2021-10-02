package com.sourceallies.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void shouldPass(){
        Solution solution = new Solution();
        String name = "world";

        assertEquals("Hello "+ name, solution.greeting(name));
    }

}
