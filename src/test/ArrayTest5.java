package test;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1,2,3,4,5.交换首尾索引对应的元素
             交换前：1,2,3,4,5
             交换后：5,4,3,2,1
         */
        int arr[] ={1,2,3,4,5};
        int temp ;
        //i<j是因为i要在j的前面，两者相等或i>j都不能继续执行循环
        // 避免把交换过的数字在交换一遍
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
             temp = arr[i];
             arr[i]=arr[j];
             arr[j] = temp;
        }
        for (int x : arr){
            System.out.println(x);
        }
    }
}
