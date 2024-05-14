package com.interview.interviewproblems.Thread;

import java.util.concurrent.Semaphore;

public class AlthernateThreadSemaphore implements Runnable{
    int counter;
    Semaphore ins,outs;
    AlthernateThreadSemaphore(int counter,Semaphore ins,Semaphore outs){
        this.counter = counter;
        this.ins=ins;
        this.outs=outs;
    }
    public void run(){
        for(int i =0;i<25;i++){
            try {
                ins.acquire();
            System.out.println(""+ counter);
            outs.release();
            counter+=2;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Semaphore s1= new Semaphore(1);
        Semaphore s2= new Semaphore(0);
        AlthernateThreadSemaphore al1= new AlthernateThreadSemaphore(1,s1,s2);
        AlthernateThreadSemaphore al2= new AlthernateThreadSemaphore(2,s2,s1);
        
    }
}
