package arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int a = 0;
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            a = a+arr[i];
        }
        System.out.println(a);
    }
}
