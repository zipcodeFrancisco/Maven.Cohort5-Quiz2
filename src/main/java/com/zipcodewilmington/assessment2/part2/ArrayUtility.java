package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer totalLength = array1.length + array2.length;
        Integer[] newArray = new Integer[totalLength];
        System.arraycopy(array1,0,newArray,0,array1.length);
        System.arraycopy(array2,0,newArray,array1.length,array2.length);
        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index)
    {
        Integer numEle = array.length;
        Integer[] myArray = new Integer[numEle];
        for (int i = 0; i < numEle; i++) {
            myArray[ i ] = array[(i+index)%numEle];
        }
        return myArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] newArray = merge(array1,array2);
        Integer counter = 0;
        for( Integer x : newArray){
            if( x.equals(valueToEvaluate) ){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        LinkedHashMap<Integer,Integer> previousValues = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++){
            //System.out.println( "*" + Arrays.asList(previousValues) );
            Integer currentKey = (Integer) array[i];
            System.out.println( i + " ** " + currentKey + " --- " + Arrays.asList(previousValues) );
            if( previousValues.get(currentKey) == null ){
                previousValues.put(currentKey, 1);
            }
            else {
                previousValues.put(currentKey, previousValues.get(currentKey) + 1);
            }
            //System.out.println( i + " ** " + currentKey + " --- " + Arrays.asList(previousValues) );
        }
        System.out.println( previousValues );
        //Collections.sort( previousValues.keySet() );

        LinkedHashMap<Integer, Integer> sortedMap =
                previousValues.entrySet().stream().
                        sorted(Map.Entry.comparingByValue()).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println( sortedMap.entrySet() + " " + sortedMap.entrySet().iterator().next()
                + " " + sortedMap.get(sortedMap.size()-1) + " " + sortedMap.values().iterator().next()
                + " " + sortedMap.keySet().toArray()[sortedMap.size()-1] );

        return (Integer) sortedMap.keySet().toArray()[sortedMap.size()-1];
    }
}
