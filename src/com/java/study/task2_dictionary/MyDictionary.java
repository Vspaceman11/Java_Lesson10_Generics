package com.java.study.task2_dictionary;

import java.util.ArrayList;

public class MyDictionary<TKey, TValue>{
    private ArrayList<TKey> arrayKey;
    private ArrayList<TValue> arrayValue;
    private int dictionarySize;

    public MyDictionary() {
        this.arrayKey = new ArrayList<>();
        this.arrayValue = new ArrayList<>();
    }
    public void add(TKey key, TValue value){
        arrayKey.add(key);
        arrayValue.add(value);
    }
    public void indexOf(int keyIndex){
        int valueOfKey = arrayKey.indexOf(keyIndex);
        if (arrayValue.size() > valueOfKey)
            System.out.println(arrayValue.get(valueOfKey));
        else throw new IndexOutOfBoundsException("Out of Array");
    }
    public void getDictionarySize(){
        System.out.println("Key size: " + this.arrayKey.size());
        System.out.println("Value size: " + this.arrayValue.size());
    }
}
