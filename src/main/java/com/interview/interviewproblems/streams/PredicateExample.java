package com.interview.interviewproblems.streams;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String... args){
        Predicate<Integer> leesethan = i-> (i < 18);
        Predicate<Integer> grtrthan = i-> (i > 0);
        System.out.println(leesethan.and(grtrthan).negate().test(5));
        checkPred(10,i->i>=10);
    }
    static void checkPred(int num,Predicate<Integer> predicate){
        if(predicate.test(num)){
            System.out.println("number");
        }
    }
}
