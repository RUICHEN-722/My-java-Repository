package test;
//设计方法找出数组中的最大值
public class MethodTest5 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 8, 10};
        int max = getMax(arr);
        System.out.println(max);
    }
//    需要返回最终值max
    public static int getMax(int[] arr1){
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        return max;
    }
}
