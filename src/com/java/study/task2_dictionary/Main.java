package com.java.study.task2_dictionary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> dictionary = new MyDictionary<>();
        dictionary.add(1,"Dan");
        dictionary.add(2,"Ban");
        dictionary.add(3,"Van");
        try {
            dictionary.indexOf(2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        dictionary.getDictionarySize();

    }
}
