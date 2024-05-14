package com.interview.interviewproblems.Thread.JavaMemoryModel;

public class SeparateObjects {
    public static void main(String... args){
        Runnable r1 = new MyRunnable();
        Runnable r2 = new MyRunnable();
        Thread thread1 = new Thread(r1,"thread1");
        Thread thread2 = new Thread(r2,"Thread2");
//        thread1.start();
//        thread2.start();
        MyObject myObject = new MyObject();
        Runnable r3 = new MyRunnable(myObject);
        Runnable r4 = new MyRunnable(myObject);
        Thread thread3 = new Thread(r3,"thread3");
        Thread thread4 = new Thread(r4,"Thread4");
        Thread thread5 = new Thread(r4,"Thread5");
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
