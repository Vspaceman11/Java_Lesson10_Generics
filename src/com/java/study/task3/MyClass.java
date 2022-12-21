package com.java.study.task3;

public class MyClass <T>{
    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public MyClass() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> MyClass <T> factoryMethod(){
        return new MyClass<>();
    }
}
