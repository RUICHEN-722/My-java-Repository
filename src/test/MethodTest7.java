package test;

public class MethodTest7 {
    public static void main(String[] args) {
         /*需求：定义一个方法copyOfRange(int[] arr, int form, int to)
           功能：将数组arr中从索引form（包含form）开始
           到索引to结束（不包含to）的元素复制到新数组中，
           将新数组返回
          */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyArr = copyOfRange(arr, 3, 7);
        for (int x : copyArr){
            System.out.print(" "+x);
        }
    }
    public static int[] copyOfRange(int[] arr, int form, int to){
        int[] arr2 = new int[to - form];
        for (int i = form,j = 0; i < to;i++,j++){
              arr2[j] = arr[i];
        }
        return arr2;
    } 
}
