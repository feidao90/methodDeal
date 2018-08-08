package com.feidao.demo;

abstract class BaseSuper{
    protected void method(int v){};
    public void method(String s){};
}

public class overwriteAndReload extends BaseSuper{
    public void method(int v){};//覆盖
    public int method(int a,int b){return 0;};
    protected String method(String a,String b){return a+b;};
}
