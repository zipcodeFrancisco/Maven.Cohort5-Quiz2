package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        return this.input%3 == 0 ? true : false;
    }

    public Boolean isTang() {
        return this.input%5 == 0 ? true : false;
    }

    public Boolean isWuTang() {
        return ((this.input%3 == 0) && (this.input%5 == 0)) ? true : false;
    }

}
