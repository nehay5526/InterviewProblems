package com.interview.interviewproblems.streams;

import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInter {
    public static void main(String... args){
        Function<Double,Double>  half = a-> a/2.0;
        System.out.println(half.apply(10.0));
        Map<String,Integer> map = new HashMap();
        map.values().stream().collect(Collectors.toSet()).size();

    }
}
