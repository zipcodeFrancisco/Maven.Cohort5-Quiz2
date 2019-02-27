package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value > 4 ? true : false;
    }

    public Boolean isLessThan7(Integer value) {
        return value < 8 ? true : false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return (isGreaterThan5(valueToEvaluate) && isLessThan7(valueToEvaluate)) ? true : false;
    }

    public Boolean startsWith(String string, Character character) {
        return string.substring(0,1).toLowerCase().equals(character.toString().toLowerCase()) ? true : false;
    }
}
