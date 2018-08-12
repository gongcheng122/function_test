package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A = 1;
        int B = 2;

        System.out.println("A = "+A+"\n" +
                "B = "+B);
        /*对于静态方法，其他的静态或非静态方法都可以直接调用它。
        而对于非静态方法，其他的非静态方法是可以直接调用它的。但是其他静态方法只有通过对象才能调用它。
        */
        System.out.println("A 与 B 中最大值为： "+Max(A,B));
        //System.out.println((Min(A,B))); error:静态方法不能调用非静态方法

        Main M = new Main();
        System.out.println("A 与 B 中最小值为： "+M.Min(A,B));//静态方法需要通过对象调用其它非静态方法

        System.out.println("A-B = "+first_minus_second(A,B));
        System.out.println("B-A = "+second_minus_first(A,B));
        System.out.println("|A-B| = "+minus_absolute(A,B));

        System.out.println("A+B = "+private_method(A,B));


    }

    public static int Max(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    //返回A和B中较小的数字
    public int Min(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    //返回A-B的值
    public static int first_minus_second(int a, int b){
        return a-b;
    }

    //返回B-A的值
    public static int second_minus_first(int a, int b){
        return b-a;
    }

    //返回A-B的绝对值
    public static int minus_absolute(int a, int b){
        if(a-b>0){
            return a-b;
        }else{
            return b-a;
        }
    }

    private static int private_method(int a, int b){
        return a+b;
    }
}
