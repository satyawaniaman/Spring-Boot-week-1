package com.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Factorial {
    static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    @PostConstruct
    void before(){
        System.out.println("creating the bean.");
    }
    @PreDestroy
    void after(){
        System.out.println("the bean is destroyed.");
    }
}
