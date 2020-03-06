package com.atguigu.java1;

/**
 * @author angang @create 2020-03-02 10:59
 */
public class BankTest {
}

class Bank {
    private Bank() {
    }

    private static Bank  instance = null;

    public static Bank getInstance() {
        if (instance == null){
            synchronized (Bank.class){
                if (instance == null){
                    instance = new Bank();

                }

            }

        }
        return instance;
    }
}
