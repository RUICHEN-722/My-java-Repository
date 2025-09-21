package arraydemo;
//动态数组初始化
public class ArrayDemo3 {
    public static void main(String[] args) {
//        格式
//        数据类型[] 数组名 = new 数据类型[数组长度];
//        指定数组长度，由虚拟机给出默认的初始化值
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[1]);
        System.out.println(arr[0]);
        System.out.println(arr[2]);

        //数组默认初始化规律
        //整数类型：默认初始化值为0
        //小数类型：0.0
        //字符类型：'/u0000' 空格
        //布尔类型：false
        //引用数据类型：null

        int arr1[] = new int[3];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
