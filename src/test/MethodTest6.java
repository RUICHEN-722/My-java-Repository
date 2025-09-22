package test;

public class MethodTest6 {
    public static void main(String[] args) {
        /*
        定义一个方法判断数组中的某一个数是否存在，将结果返回
        给调用处
         */

        int[] arr = {1, 34, 56, 27, 90, 87, 57};

        boolean q = contains(arr, 80);
        System.out.println(q);
    }
    public static boolean contains(int[] arr1, int number){
        for (int j : arr1) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
