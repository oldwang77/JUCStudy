package com.kuang.demo1;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        // 获取CPU的核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        Thread.sleep(10);

        Test1 test1 = new Test1();
        test1.wait();
    }
}
