package com.learn.tso.ioc;

import org.springframework.stereotype.Component;

/**
 * @author luyu@pinduoduo.com
 * @date 2021/3/24 9:45 上午
 */
@Component
public class HelloWorld {
    public void say(){
        System.out.println("Hello world!");
    }


    public static void main(String[] args) {
        isPalindrome(1);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int revrse = 0;
        while(x != 0){
            revrse = revrse * 10 + x % 10;
            x /= 10;
        }
        System.out.println(x);
        System.out.println(revrse);
        return x == revrse;
    }
}
