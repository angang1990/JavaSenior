package atguigu.java;

import org.junit.Test;

/**
 * @author angang @create 2020-02-20 13:10
 */
public class HelloWorld {
    static int num = 10;
    public static final int NUMBER = 1;

    public static void main(String[] args) {
//        System.out.println(123);
//        System.out.println(123);
//
//        System.out.println("HelloWorld.main");
//        System.out.println("args = [" + args + "]");
//
//        System.out.println("num = " +num);

        String[] str = new String[5];
        for (String myStr : str ){
            System.out.println(myStr);
            myStr = "123";
            System.out.println(myStr);

        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }

}
