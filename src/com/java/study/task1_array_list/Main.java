package com.java.study.task1_array_list;


public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(8);
        list.add(5);
        list.add(3);
        list.indexOf(1); // index 1 = value 5;
        list.getSize(); // size 3
    }
}
