package com.feidao.demo;

// overwrite
abstract class SuperBase{
    public void method(){}
}


public class Base extends SuperBase{
    public void method(){}

    public int method(int a){
        return 1;
    }
}

