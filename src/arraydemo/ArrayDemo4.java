package arraydemo;
//访问不存在的索引，从而引发的索引越界异常
public class ArrayDemo4 {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
//     最大索引值为4
        System.out.println(arr[6]);
    }
}
