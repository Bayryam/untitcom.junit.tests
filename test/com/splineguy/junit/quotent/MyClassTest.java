package com.splineguy.junit.quotent;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyClassTest {

    MyClass tester;
    @Before
    public  void before(){
        tester = new MyClass();

    }

    @After
    public  void after(){
        tester = null;
    }

    @Test
    public void testTruncateAInFirst2Positions()
    {
        System.out.println("testTruncateAInFirst2Positions");
        String expectedOutput = "RTAA";

        tester.truncateAInFirst2Positions("RTAA");
        assertEquals("RTAA",tester.truncateAInFirst2Positions(("RTAA")));
        assertEquals("BB",tester.truncateAInFirst2Positions(("AABB")));
        assertEquals("BBB",tester.truncateAInFirst2Positions(("BABB")));
    }

    @Test
    public void testAreFirstAndLastTwoCharacterstheSame()
        {

            System.out.println("testAreFirstAndLastTwoCharacterstheSame");
        assertFalse(tester.areFirstAndLastTwoCharacterstheSame(""));
            assertFalse(tester.areFirstAndLastTwoCharacterstheSame("A"));
            assertTrue(tester.areFirstAndLastTwoCharacterstheSame("AB"));
            assertTrue(tester.areFirstAndLastTwoCharacterstheSame("AAA"));
            assertFalse(tester.areFirstAndLastTwoCharacterstheSame("AAB"));
            assertFalse(tester.areFirstAndLastTwoCharacterstheSame("AAB"));


    }

    @Test
    public void testAraysSort()
    {
        int[] numbers = {5,6,4,2,3,1};
        Arrays.sort(numbers);
        int[] expectedOutput = {1,2,3,4,5,6};
        assertArrayEquals(expectedOutput,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraysSortWithNullcondition(){
        int[] numbers = null;
        Arrays.sort(numbers);
    }
@Test(timeout = 100)
    public void testarraysSort(){
        for (int i = 0; i <1000000;i++) {
            int[] numbers = {i, i - 1, i + 1};
            Arrays.sort(numbers);
        }
    }


}