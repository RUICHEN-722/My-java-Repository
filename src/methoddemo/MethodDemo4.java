package methoddemo;
//带返回值的方法调用和格式
public class MethodDemo4 {
    public static void main(String[] args) {
//        赋值调用
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(10, 20, 30);
        int sum3 = getSum(10, 20, 30);
        int sum4 = getSum(10, 20, 30);
        System.out.println(sum1 + sum2 + sum3 + sum4);

    }
//    带返回值的方法名前面必须是要返回的数据类型
    public static int getSum(int num1, int num2, int num3){
           int result = num1 + num2 + num3;
           return result;
    }
}
