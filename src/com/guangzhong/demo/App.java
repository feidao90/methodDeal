package com.guangzhong.demo;

public class App{
    public int publicVarofApp = 1;
    private int privateVarofApp = 1;
    int defaultVarofApp = 1;

    protected void methodOfApp(){}
}

class Sub extends App {
    public void methodOfSub(){
        publicVarofApp = 2;
        defaultVarofApp = 2;

        methodOfApp();
    }

    public static void main(String args[]){
        Sub sub = new Sub();
        sub.publicVarofApp = 3;
        sub.defaultVarofApp = 3;
        sub.methodOfApp();
        sub.methodOfSub();
    }
}
