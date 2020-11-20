package com.tan;


public class Test {

    @org.junit.Test
    public void test1(){
        String auth = AuthService.getAuth();
        System.out.println(auth);
    }
}
