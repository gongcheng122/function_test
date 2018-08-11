package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A = 1;
        int B = 2;
        /*对于静态方法，其他的静态或非静态方法都可以直接调用它。
        而对于非静态方法，其他的非静态方法是可以直接调用它的。但是其他静态方法只有通过对象才能调用它。
        */
        System.out.println(Max(A,B));
        //System.out.println((Min(A,B))); error:静态方法不能调用非静态方法
        System.out.println(class_number.Max(A,B));
        //System.out.println(class_number.Min(A,B)); error:静态方法不能调用非静态方法

        class_number C = new class_number();
        System.out.println(C.Min(A,B)); //静态方法需要通过对象调用其它非静态方法

        Main M = new Main();
        System.out.println(M.Min(A,B));//静态方法需要通过对象调用其它非静态方法
    }

    public static int Max(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public int Min(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
}
