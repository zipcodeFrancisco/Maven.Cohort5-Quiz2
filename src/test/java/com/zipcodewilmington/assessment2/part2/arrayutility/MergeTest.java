package com.zipcodewilmington.assessment2.part2.arrayutility;

import com.zipcodewilmington.assessment2.part2.ArrayUtility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTest {
    private ArrayUtility utility;

    @Before
    public void setup(){
        utility = new ArrayUtility();
    }

    @Test
    public void testMerge_withOneElement(){
        //Given
        Integer[] array1 = {9};
        Integer[] array2 = {6};
        Integer[] expected = {9, 6};

        //When
        Integer[] actual = utility.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMerge_withMultipleElements(){
        //Given
        Integer[] array1 = {5, 1, 8};
        Integer[] array2 = {4, 2};
        Integer[] expected = {5, 1, 8, 4, 2};

        //When
        Integer[] actual = utility.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }
}
