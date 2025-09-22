package methoddemo;

import java.util.Scanner;
//带参数的方法
public class MethodDemo3 {
    public static void main(String[] args) {
//        完成求和方法的书写以及调用
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        int number1 = sc.nextInt();
        System.out.print("请输入第二个数字:");
        int number2 = sc.nextInt();
//        调用方法
           sum(number1, number2);

    }
    public static void sum(int num1, int num2){
        int count = num1 + num2;
        System.out.println("结果是:"+count);

    }
}
