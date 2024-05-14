package com.interview.interviewproblems.Thread.JavaMemoryModel;

public class MyRunnable implements  Runnable{
    private int count=0;
    private MyObject myobject = null;
    public MyRunnable(){}
    public MyRunnable(MyObject myObject){
        this.myobject=myObject;
    }
    @Override
    public void run() {
        System.out.println(this.myobject);
        for(int i=0;i<1_000_000;i++){
            this.count++;
        }
        System.out.println(Thread.currentThread().getName()+" "+this.count);
    }
}
