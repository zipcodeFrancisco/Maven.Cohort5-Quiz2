package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2 == 0 ? true : false;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = start; i <= stop; i++) {
            myList.add(i);
        }
        Integer[] res = new Integer[myList.size()];
        Integer counter = 0;
        for (Object o : myList){
            res[counter] = (Integer) o;
            counter++;
        }

        return res;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
