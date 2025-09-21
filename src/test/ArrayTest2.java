package test;
//遍历数组如果是偶数除以二，奇数乘以二
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
               arr[i]=arr[i]/2;
            }else {
                arr[i]=arr[i]*2;
            }
        }
//        一个循环尽量只做一件事
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
