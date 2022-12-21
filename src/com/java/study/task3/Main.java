package com.java.study.task3;

public class Main {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>("123");
        System.out.println(myClass.getValue());
        MyClass<Integer> myClass1 = MyClass.factoryMethod();
        myClass1.setValue(1);
        System.out.println(myClass1.getValue());
    }
}
