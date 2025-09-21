package test;

public class ArrayTest3 {
    public static void main(String[] args) {
        //定义数组求最大值：33，5,22,44，55

        //扩展问题：
        //1.求最小值
        //2.为什么max记录的值为arr[0]，默认值不能为零吗?
        //不能些零
        //如果数组中的值全负数，那么0是最大的
        //所以用数组中的值让数组内部的元素比较才不会出错
        //max的初始化值一定要是数组中的值
        //3.循环开始的条件一定是零吗
        //为0，意味着自己和自己比了一下，没必要
        int[] arr = {33,5,22,44,55};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
