package com.java.study.task1_array_list;

import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> arrayList;
    private int index;

    public MyList() {
        this.arrayList = new ArrayList<>();
    }
    public void add(T set){
        this.arrayList.add(set);
    }
    public void indexOf(int index){
        this.index = index;
        System.out.println(arrayList.get(index));
    }
    public void getSize(){
        System.out.println(arrayList.size());
    }
}
