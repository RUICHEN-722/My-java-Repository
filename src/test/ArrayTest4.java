package test;

import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*需求：生成10个1~100之间的随机数存入数组
        1）求出所有数据的和
        2）求出数据的平均数
        3）统计有多少个数据比平均值小
        */
        int[] arr = new int[10];
        Random r = new Random();
        int count = 0;
        int balence;
        int number1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100)+1;
            arr[i] = number;
        }
//        求和
        for (int x:arr) {
            count = count+x;
        }
        System.out.println("和："+count);

//        求平均数
        balence=count/arr.length;
        System.out.println("平均数："+balence);

//        统计比平均数小的值
        for (int j : arr){
            if (j < balence){
                System.out.println(j);
                number1++;
            }
        }
        System.out.println("小于平均数的个数："+number1);
    }
}
