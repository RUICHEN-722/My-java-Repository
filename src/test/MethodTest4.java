package test;
//定义一个方法，循环输出数组
public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        array(arr);
    }
    public static void array(int[] arr1){
        int i = 0;
        for (int x : arr1){
            if(i <= 0){
                System.out.print("[" + x + " ");
            } else if (i >= arr1.length-1) {
                System.out.print("," + x + "]");
            }else{
                System.out.print("," + x + "  ");
            }
        i++;
        }
    }
}
