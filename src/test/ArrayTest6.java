package test;

import java.util.Random;

/*需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。

 */
public class ArrayTest6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
// 把数组中的值全部随机交换一次，不同与把数组首尾值交换
// 全部索引都要交换一次，因此i<arr.length
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(5);
            int temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        for (int x : arr){
            System.out.println(x);
        }
    }
}
